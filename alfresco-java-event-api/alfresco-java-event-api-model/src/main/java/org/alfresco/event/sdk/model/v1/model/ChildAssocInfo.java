/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.event.sdk.model.v1.model;

import java.util.Objects;

public class ChildAssocInfo {

    private String id;

    public ChildAssocInfo() {
    }

    public ChildAssocInfo(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChildAssocInfo)) {
            return false;
        }
        final ChildAssocInfo assoc = (ChildAssocInfo) o;
        return Objects.equals(id, assoc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ChildAssocInfo [id=" + id + ']';
    }
}
