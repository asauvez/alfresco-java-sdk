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
package org.alfresco.sdk.sample.event.handler;

import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.filter.PropertyChangedFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeUpdatedEventHandler;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Sample event handler to demonstrate reacting to the update of the title of a node in the repository.
 */
@Component
public class TitleModifiedHandler implements OnNodeUpdatedEventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(TitleModifiedHandler.class);
    private static final String CM_TITLE = "cm:title";

    @Override
    public void handleEvent(final RepoEvent<DataAttributes<Resource>> repoEvent) {
        final NodeResource nodeResource = (NodeResource) repoEvent.getData().getResource();
        final NodeResource beforeNodeResource = (NodeResource) repoEvent.getData().getResourceBefore();
        final String name = nodeResource.getName();
        final String previousTitle = (String) beforeNodeResource.getProperties().getOrDefault(CM_TITLE, "");
        final String currentTitle = (String) nodeResource.getProperties().getOrDefault(CM_TITLE, "");

        LOGGER.info("The title of the node {} has changed from '{}' to '{}'!", name, previousTitle, currentTitle);
    }

    @Override
    public EventFilter getEventFilter() {
        return PropertyChangedFilter.of(CM_TITLE);
    }
}
