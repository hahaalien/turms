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

package im.turms.turms.pojo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@Document
@FieldNameConstants
@NoArgsConstructor
public class UserRelationshipGroup {
    @Id
    private Key key;
    private String name;
    private Date creationDate;

    public UserRelationshipGroup(
            @NotNull Long ownerId,
            @NotNull Integer index,
            @NotNull String name,
            @NotNull Date creationDate) {
        this.key = new Key(ownerId, index);
        this.name = name;
        this.creationDate = creationDate;
    }

    /**
     * Do not use the unique group name of a user as a ID because when
     * it will cost a lot when updating the group name
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    public static class Key {
        @Indexed
        private Long ownerId;

        @Indexed
        private Integer index;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class KeyList {
        private List<Key> keys;
    }
}