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
package org.alfresco.sdk.sample.handler;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import org.alfresco.core.handler.NodesApi;
import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.filter.IsFileFilter;
import org.alfresco.event.sdk.handling.filter.MimeTypeFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeCreatedEventHandler;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Sample event handler to demonstrate reacting to the creation of an HTML content in the repository.
 */
@Component
public class HtmlContentCreatedHandler implements OnNodeCreatedEventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlContentCreatedHandler.class);

    @Autowired
    NodesApi nodesApi;

    @Value("${local.storage.folder}")
    String localStorageFolder;


    @Override
    public void handleEvent(final RepoEvent<DataAttributes<Resource>> repoEvent) {

        final NodeResource nodeResource = (NodeResource) repoEvent.getData().getResource();

        LOGGER.info("An HTML content named {} has been created!", nodeResource.getName());

        try {

            LOGGER.info("Retrieving content from Alfresco node {}", nodeResource.getName());

            InputStream htmlFileInputStream = nodesApi.getNodeContent(nodeResource.getId(), true, null, null)
                .getBody()
                .getInputStream();


            LOGGER.info("Storing content to local folder {}", localStorageFolder);

            Path targetFile = Path.of(localStorageFolder, nodeResource.getName());
            Files.copy(htmlFileInputStream, targetFile);
            htmlFileInputStream.close();

        } catch (Exception ex) {
            LOGGER.error("An error occurred trying to download the content of the file", ex);
        }
    }

    /**
     * {@link EventFilter} implementations filter the events before they are handled.
     * Filters can be chained using: <ul>
     * <li>{@link EventFilter#and(EventFilter)}</li>
     * <li>{@link EventFilter#negate()}</li>
     * <li>{@link EventFilter#or(EventFilter)}</li>
     * </ul>
     */
    @Override
    public EventFilter getEventFilter() {
        return IsFileFilter.get()
            .and(MimeTypeFilter.of("text/html"));
    }
}
