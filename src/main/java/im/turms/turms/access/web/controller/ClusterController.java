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

package im.turms.turms.access.web.controller;

import im.turms.turms.access.web.util.ResponseFactory;
import im.turms.turms.annotation.web.RequiredPermission;
import im.turms.turms.cluster.TurmsClusterManager;
import im.turms.turms.common.TurmsStatusCode;
import im.turms.turms.exception.TurmsBusinessException;
import im.turms.turms.pojo.dto.ResponseDTO;
import im.turms.turms.property.TurmsProperties;
import im.turms.turms.service.user.UserSimultaneousLoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

import static im.turms.turms.constant.AdminPermission.*;

@RestController
@RequestMapping("/cluster")
public class ClusterController {
    private final TurmsClusterManager turmsClusterManager;
    private final UserSimultaneousLoginService userSimultaneousLoginService;

    public ClusterController(TurmsClusterManager turmsClusterManager, UserSimultaneousLoginService userSimultaneousLoginService) {
        this.turmsClusterManager = turmsClusterManager;
        this.userSimultaneousLoginService = userSimultaneousLoginService;
    }

    @GetMapping("/hazelcast-info")
    @RequiredPermission(CLUSTER_CONFIG_QUERY)
    public ResponseEntity<ResponseDTO<Map>> queryHazelcastInfo(@RequestParam(defaultValue = "false") boolean withConfigs) {
        Map<String, ?> hazelcastInfo = turmsClusterManager.getHazelcastInfo(withConfigs);
        return ResponseFactory.okIfTruthy(hazelcastInfo);
    }

    @GetMapping("/config")
    @RequiredPermission(CLUSTER_CONFIG_QUERY)
    public ResponseEntity<ResponseDTO<TurmsProperties>> queryClusterConfig(@RequestParam(defaultValue = "false") boolean mutable) {
        TurmsProperties properties = turmsClusterManager.getTurmsProperties();
        if (mutable) {
            try {
                return ResponseFactory.okIfTruthy(TurmsProperties.getMutableProperties(turmsClusterManager.getTurmsProperties()));
            } catch (IOException e) {
                throw TurmsBusinessException.get(TurmsStatusCode.SERVER_INTERNAL_ERROR);
            }
        } else {
            return ResponseFactory.okIfTruthy(properties);
        }
    }

    @GetMapping("/server")
    @RequiredPermission(NONE)
    public ResponseEntity<String> queryServerHost(@RequestParam Long userId) {
        String host = turmsClusterManager.getMemberByUserId(userId).getAddress().getHost();
        return ResponseFactory.raw(host);
    }

    /**
     * Do not call this method frequently because it will cost a lot of resources
     */
    @PutMapping("/config")
    @RequiredPermission(CLUSTER_CONFIG_UPDATE)
    public ResponseEntity<ResponseDTO<TurmsProperties>> updateClusterConfig(@RequestBody TurmsProperties turmsProperties) throws IOException {
        TurmsProperties mergedProperties = TurmsProperties.merge(
                turmsClusterManager.getTurmsProperties(),
                turmsProperties);
        turmsClusterManager.updateProperties(mergedProperties);
        userSimultaneousLoginService.applyStrategy(
                mergedProperties.getUser().getSimultaneousLogin().getStrategy());
        return ResponseFactory.okIfTruthy(mergedProperties);
    }
}
