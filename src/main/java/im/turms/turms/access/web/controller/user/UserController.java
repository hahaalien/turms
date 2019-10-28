/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.turms.access.web.controller.user;

import im.turms.turms.access.web.util.ResponseFactory;
import im.turms.turms.annotation.web.RequiredPermission;
import im.turms.turms.common.DateTimeUtil;
import im.turms.turms.common.PageUtil;
import im.turms.turms.common.TurmsStatusCode;
import im.turms.turms.constant.AdminPermission;
import im.turms.turms.constant.DeviceType;
import im.turms.turms.constant.DivideBy;
import im.turms.turms.constant.UserStatus;
import im.turms.turms.pojo.bo.UserOnlineInfo;
import im.turms.turms.pojo.domain.Group;
import im.turms.turms.pojo.domain.User;
import im.turms.turms.pojo.domain.UserLocation;
import im.turms.turms.service.group.GroupService;
import im.turms.turms.service.message.MessageService;
import im.turms.turms.service.user.UserService;
import im.turms.turms.service.user.onlineuser.OnlineUserManager;
import im.turms.turms.service.user.onlineuser.OnlineUserService;
import im.turms.turms.service.user.onlineuser.UsersNearbyService;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;

import static im.turms.turms.common.Constants.OFFLINE_USER_ONLINE_INFO;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final OnlineUserService onlineUserService;
    private final UsersNearbyService usersNearbyService;
    private final GroupService groupService;
    private final MessageService messageService;
    private final PageUtil pageUtil;

    public UserController(UserService userService, OnlineUserService onlineUserService, GroupService groupService, PageUtil pageUtil, UsersNearbyService usersNearbyService, MessageService messageService) {
        this.userService = userService;
        this.onlineUserService = onlineUserService;
        this.groupService = groupService;
        this.pageUtil = pageUtil;
        this.usersNearbyService = usersNearbyService;
        this.messageService = messageService;
    }

    @GetMapping
    @RequiredPermission(AdminPermission.USER_QUERY)
    public Mono<ResponseEntity> getUsers(
            @RequestParam(required = false) Set<Long> userIds,
            @RequestParam(required = false) Long userId,
            @RequestParam(required = false) Date registrationDateStart,
            @RequestParam(required = false) Date registrationDateEnd,
            @RequestParam(required = false) Date deletionDateStart,
            @RequestParam(required = false) Date deletionDateEnd,
            @RequestParam(required = false) Boolean active,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "0") int size) {
        if (userId != null) {
            return ResponseFactory.okWhenTruthy(userService.queryUser(userId));
        } else {
            size = pageUtil.getSize(size);
            Flux<User> users = userService.queryUsers(
                    userIds,
                    registrationDateStart,
                    registrationDateEnd,
                    deletionDateStart,
                    deletionDateEnd,
                    active,
                    page,
                    size);
            return ResponseFactory.okWhenTruthy(users);
        }
    }

    @PostMapping
    @RequiredPermission(AdminPermission.USER_CREATE)
    public Mono<ResponseEntity> addUser(@RequestBody User user) {
        Mono<User> addUser = userService.addUser(
                user.getId(),
                user.getPassword(),
                user.getName(),
                user.getIntro(),
                user.getProfilePictureUrl(),
                user.getRegistrationDate(),
                user.getActive());
        return ResponseFactory.okWhenTruthy(addUser);
    }

    @DeleteMapping
    @RequiredPermission(AdminPermission.USER_DELETE)
    public Mono<ResponseEntity> deleteUsers(
            @RequestParam Set<Long> userIds,
            @RequestParam(defaultValue = "false") boolean deleteRelationships,
            @RequestParam(required = false) Boolean logicallyDelete) {
        Mono<Boolean> deleted = userService.deleteUsers(userIds, deleteRelationships, logicallyDelete);
        return ResponseFactory.acknowledged(deleted);
    }

    @PutMapping
    @RequiredPermission(AdminPermission.USER_UPDATE)
    public Mono<ResponseEntity> updateUser(
            @RequestParam Set<Long> userIds,
            @RequestBody User user) {
        boolean validated = user.getPassword() != null
                && user.getName() != null
                && user.getIntro() != null
                && user.getProfilePictureUrl() != null
                && user.getRegistrationDate() != null
                && user.getActive() != null;
        if (validated) {
            Mono<Boolean> updated = userService.updateUsers(
                    userIds,
                    user.getPassword(),
                    user.getName(),
                    user.getIntro(),
                    user.getProfilePictureUrl(),
                    user.getProfileAccess(),
                    user.getRegistrationDate(),
                    user.getActive());
            return ResponseFactory.acknowledged(updated);
        } else {
            return ResponseFactory.code(TurmsStatusCode.ILLEGAL_ARGUMENTS);
        }
    }

    @GetMapping("/count")
    @RequiredPermission(AdminPermission.USER_QUERY)
    public Mono<ResponseEntity> countUsers(
            @RequestParam(required = false) Date registeredUsersStartDate,
            @RequestParam(required = false) Date registeredUsersEndDate,
            @RequestParam(required = false) Date deletedUsersStartDate,
            @RequestParam(required = false) Date deletedUsersEndDate,
            @RequestParam(required = false) Date deliveredMessageStartDate,
            @RequestParam(required = false) Date deliveredMessageEndDate,
            @RequestParam(required = false) Date loggedInUsersStartDate,
            @RequestParam(required = false) Date loggedInUsersEndDate,
            @RequestParam(required = false) Date maxOnlineUsersStartDate,
            @RequestParam(required = false) Date maxOnlineUsersEndDate,
            @RequestParam(defaultValue = "false") Boolean countOnlineUsers,
            @RequestParam(defaultValue = "NOOP") DivideBy divideBy) {
        if (countOnlineUsers) {
            return ResponseFactory.withKey("total", onlineUserService.countOnlineUsers());
        }
        if (divideBy == null || divideBy == DivideBy.NOOP) {
            List<Mono<Pair<String, Long>>> counts = new LinkedList<>();
            if (deletedUsersStartDate != null || deletedUsersEndDate != null) {
                counts.add(userService.countDeletedUsers(
                        deletedUsersStartDate,
                        deletedUsersEndDate)
                        .map(total -> Pair.of("deletedUsers", total)));
            }
            if (deliveredMessageStartDate != null || deliveredMessageEndDate != null) {
                counts.add(messageService.countUsersWhoSentMessage(
                        deliveredMessageStartDate,
                        deliveredMessageEndDate,
                        null)
                        .map(total -> Pair.of("usersWhoSentMessages", total)));
            }
            if (loggedInUsersStartDate != null || loggedInUsersEndDate != null) {
                counts.add(userService.countLoggedInUsers(
                        loggedInUsersStartDate,
                        loggedInUsersEndDate)
                        .map(total -> Pair.of("loggedInUsers", total)));
            }
            if (maxOnlineUsersStartDate != null || maxOnlineUsersEndDate != null) {
                counts.add(userService.countMaxOnlineUsers(
                        maxOnlineUsersStartDate,
                        maxOnlineUsersEndDate)
                        .map(total -> Pair.of("maxOnlineUsers", total)));
            }
            if (counts.isEmpty() || registeredUsersStartDate != null || registeredUsersEndDate != null) {
                counts.add(userService.countRegisteredUsers(
                        registeredUsersStartDate,
                        registeredUsersEndDate)
                        .map(total -> Pair.of("registeredUsers", total)));
            }
            return ResponseFactory.collectCountResults(counts);
        } else {
            List<Mono<Pair<String, List<Map<String, ?>>>>> counts = new LinkedList<>();
            if (deletedUsersStartDate != null && deletedUsersEndDate != null) {
                counts.add(DateTimeUtil.queryBetweenDate(
                        "deletedUsers",
                        deletedUsersStartDate,
                        deletedUsersEndDate,
                        divideBy,
                        userService::countDeletedUsers));
            }
            if (deliveredMessageStartDate != null && deliveredMessageEndDate != null) {
                counts.add(DateTimeUtil.queryBetweenDate(
                        "usersWhoSentMessages",
                        deliveredMessageStartDate,
                        deliveredMessageEndDate,
                        divideBy,
                        messageService::countUsersWhoSentMessage,
                        null));
            }
            if (loggedInUsersStartDate != null && loggedInUsersEndDate != null) {
                counts.add(DateTimeUtil.queryBetweenDate(
                        "loggedInUsers",
                        loggedInUsersStartDate,
                        loggedInUsersEndDate,
                        divideBy,
                        userService::countLoggedInUsers));
            }
            if (maxOnlineUsersStartDate != null && maxOnlineUsersEndDate != null) {
                counts.add(DateTimeUtil.queryBetweenDate(
                        "maxOnlineUsers",
                        maxOnlineUsersStartDate,
                        maxOnlineUsersEndDate,
                        divideBy,
                        userService::countMaxOnlineUsers));
            }
            if (registeredUsersStartDate != null && registeredUsersEndDate != null) {
                counts.add(DateTimeUtil.queryBetweenDate(
                        "registeredUsers",
                        registeredUsersStartDate,
                        registeredUsersEndDate,
                        divideBy,
                        userService::countRegisteredUsers));
            }
            if (counts.isEmpty()) {
                return ResponseFactory.code(TurmsStatusCode.ILLEGAL_ARGUMENTS);
            }
            return ResponseFactory.collectCountResults(counts);
        }
    }

    @GetMapping("/online-statuses")
    @RequiredPermission(AdminPermission.USER_QUERY)
    public Mono<ResponseEntity> getOnlineUsersStatus(@RequestParam Set<Long> userIds) {
        List<Mono<UserOnlineInfo>> queryUsers = new ArrayList<>(userIds.size());
        for (Long userId : userIds) {
            Mono<UserOnlineInfo> queryInfo = onlineUserService.queryUserOnlineInfo(userId);
            queryInfo = queryInfo.map(info -> {
                if (info == OFFLINE_USER_ONLINE_INFO) {
                    return UserOnlineInfo.builder()
                            .userId(userId)
                            .userStatus(UserStatus.OFFLINE)
                            .build();
                } else {
                    return info;
                }
            });
            queryUsers.add(queryInfo);
        }
        return ResponseFactory.okWhenTruthy(Flux.merge(queryUsers));
    }

    @PutMapping("/online-statuses")
    @RequiredPermission(AdminPermission.USER_UPDATE)
    public ResponseEntity updateUserOnlineStatus(
            @RequestParam Long userId,
            @RequestBody Map<String, String> onlineStatusMap) {
        String onlineStatus = onlineStatusMap.get("onlineStatus");
        if (onlineStatus != null) {
            UserStatus userStatus = EnumUtils.getEnum(UserStatus.class, onlineStatus);
            if (userStatus == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            OnlineUserManager manager = onlineUserService.getLocalOnlineUserManager(userId);
            boolean updated;
            if (manager != null) {
                updated = manager.setUserOnlineStatus(userStatus);
            } else {
                updated = false;
            }
            return ResponseFactory.acknowledged(updated);
        } else {
            return ResponseFactory.entity(TurmsStatusCode.ILLEGAL_ARGUMENTS);
        }
    }

    @GetMapping("/users-nearby")
    @RequiredPermission(AdminPermission.USER_QUERY)
    public Mono<ResponseEntity> getUsersNearby(
            @RequestParam Long userId,
            @RequestParam(required = false) DeviceType deviceType,
            @RequestParam(required = false) Integer maxPeopleNumber,
            @RequestParam(required = false) Double maxDistance) {
        Flux<User> usersNearby = usersNearbyService.queryUsersProfilesNearby(userId, deviceType, maxPeopleNumber, maxDistance);
        return ResponseFactory.okWhenTruthy(usersNearby);
    }

    @GetMapping("/locations")
    @RequiredPermission(AdminPermission.USER_QUERY)
    public ResponseEntity getUserLocations(@RequestParam Long userId) {
        SortedSet<UserLocation> userLocations = onlineUserService.getUserLocations(userId);
        return ResponseFactory.okWhenTruthy(userLocations);
    }

    @GetMapping("/groups")
    @RequiredPermission(AdminPermission.USER_QUERY)
    public Mono<ResponseEntity> getUserJoinedGroup(@RequestParam Long userId) {
        Flux<Group> groups = groupService.queryUserJoinedGroup(userId);
        return ResponseFactory.okWhenTruthy(groups);
    }
}
