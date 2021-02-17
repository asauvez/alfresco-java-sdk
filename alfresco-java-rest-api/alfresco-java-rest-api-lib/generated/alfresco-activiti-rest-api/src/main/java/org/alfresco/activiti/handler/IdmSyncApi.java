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
/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.SyncLogEntryRepresentation;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "IdmSync")
public interface IdmSyncApi {

    @ApiOperation(value = "Get log file for a sync log entry", nickname = "getLogFileUsingGET", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "idm-sync", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/enterprise/idm-sync-log-entries/{syncLogEntryId}/logfile",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Void> getLogFileUsingGET(@ApiParam(value = "syncLogEntryId",required=true) @PathVariable("syncLogEntryId") Long syncLogEntryId);


    @ApiOperation(value = "List sync log entries", nickname = "getSyncLogEntriesUsingGET", notes = "", response = SyncLogEntryRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "idm-sync", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SyncLogEntryRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/idm-sync-log-entries",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<SyncLogEntryRepresentation>> getSyncLogEntriesUsingGET(@ApiParam(value = "tenantId") @Valid @RequestParam(value = "tenantId", required = false) Long tenantId,@ApiParam(value = "page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "start") @Valid @RequestParam(value = "start", required = false) Integer start,@ApiParam(value = "size") @Valid @RequestParam(value = "size", required = false) Integer size);

}
