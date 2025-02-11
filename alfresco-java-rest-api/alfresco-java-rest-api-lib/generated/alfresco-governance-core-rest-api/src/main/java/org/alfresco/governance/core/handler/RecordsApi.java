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
package org.alfresco.governance.core.handler;

import org.alfresco.governance.core.model.Error;
import org.alfresco.governance.core.model.FilePlanComponentBodyUpdate;
import java.time.OffsetDateTime;
import org.alfresco.governance.core.model.RecordEntry;
import org.alfresco.governance.core.model.RequestBodyFile;
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

@Api(value = "Records")
public interface RecordsApi {

    @ApiOperation(value = "Complete a record", nickname = "completeRecord", notes = "Completes the record **recordId**. ", response = RecordEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RecordEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **recordIdParam** is not a valid format or **recordIdParam** is not a record "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to complete record **recordIdParam**"),
        @ApiResponse(code = 404, message = "**recordIdParam** does not exist "),
        @ApiResponse(code = 422, message = "Model integrity exception: the action breaks system's integrity restrictions "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}/complete",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.POST)
    ResponseEntity<RecordEntry> completeRecord(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId,@ApiParam(value = "Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Delete a record", nickname = "deleteRecord", notes = "Deletes the record **recordId**. Deleted file plan components cannot be recovered, they are deleted permanently. ", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **recordId** is not a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete **recordId**"),
        @ApiResponse(code = 404, message = "**recordId** does not exist"),
        @ApiResponse(code = 409, message = "**recordId** is locked and cannot be deleted"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRecord(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId);


    @ApiOperation(value = "File a record", nickname = "fileRecord", notes = "Files the record **recordId** in the target record folder.  You need to specify the target record folder by providing its id **targetParentId**  If the record is already filed, a link to the target record folder is created.  You can use the **include** parameter (include=allowableOperations) to return additional information. ", response = RecordEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RecordEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **recordIdParam** or **targetParentId** is not a valid format, **recordIdParam** is not a record, **targetParentId** is not a record container or **nodeBodyFile** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to create children of **nodeId**"),
        @ApiResponse(code = 404, message = "**recordIdParam** or **targetParentId** does not exist "),
        @ApiResponse(code = 422, message = "Model integrity exception: the action breaks system's integrity restrictions "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}/file",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RecordEntry> fileRecord(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId,@ApiParam(value = "The target record folder id" ,required=true )  @Valid @RequestBody RequestBodyFile nodeBodyFile,@ApiParam(value = "Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Get a record", nickname = "getRecord", notes = "Gets information for record **recordId**  Mandatory fields and the record's aspects and properties are returned by default.  You can use the **include** parameter (include=allowableOperations) to return additional information. ", response = RecordEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RecordEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **recordId** is not a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to read **recordId**"),
        @ApiResponse(code = 404, message = "**recordId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<RecordEntry> getRecord(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId,@ApiParam(value = "Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Get record content", nickname = "getRecordContent", notes = " Gets the content of the record with identifier **recordId**. ", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response"),
        @ApiResponse(code = 304, message = "Content has not been modified since the date provided in the If-Modified-Since header"),
        @ApiResponse(code = 400, message = "Invalid parameter: **recordId** is not a valid format, or is not a record "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**recordId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}/content",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Void> getRecordContent(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId,@ApiParam(value = "**true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. ", defaultValue = "true") @Valid @RequestParam(value = "attachment", required = false, defaultValue="true") Boolean attachment,@ApiParam(value = "Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. " ) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince);


    @ApiOperation(value = "Update record", nickname = "updateRecord", notes = "Updates the record **recordId**. For example, you can rename a record: ```JSON {   \"name\":\"My new name\" } ``` You can also set or update one or more properties: ```JSON {   \"properties\":     {        \"cm:title\":\"New title\",        \"cm:description\":\"New description\"     } } ``` **Note:** if you want to add or remove aspects, then you must use **GET /records/{recordId}** first to get the complete set of *aspectNames*.  **Note:** Currently there is no optimistic locking for updates, so they are applied in \"last one wins\" order. ", response = RecordEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "records", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RecordEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: the update request is invalid or **recordId** is not a valid format or **recordBodyUpdate** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update **recordId**"),
        @ApiResponse(code = 404, message = "**recordId** does not exist"),
        @ApiResponse(code = 409, message = "Updated name clashes with an existing node in the current parent folder"),
        @ApiResponse(code = 422, message = "Model integrity exception, including file name with invalid characters"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/records/{recordId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RecordEntry> updateRecord(@ApiParam(value = "The identifier of a record.",required=true) @PathVariable("recordId") String recordId,@ApiParam(value = "The record information to update." ,required=true )  @Valid @RequestBody FilePlanComponentBodyUpdate recordBodyUpdate,@ApiParam(value = "Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);

}
