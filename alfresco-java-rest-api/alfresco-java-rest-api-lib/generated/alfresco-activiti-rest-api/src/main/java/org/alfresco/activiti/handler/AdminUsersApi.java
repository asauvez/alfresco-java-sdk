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

import org.alfresco.activiti.model.AbstractUserRepresentation;
import org.alfresco.activiti.model.BulkUserUpdateRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationAbstractUserRepresentation;
import org.alfresco.activiti.model.UserRepresentation;
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

@Api(value = "AdminUsers")
public interface AdminUsersApi {

    @ApiOperation(value = "Bulk update a list of users", nickname = "bulkUpdateUsersUsingPUT", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "admin-users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/enterprise/admin/users",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> bulkUpdateUsersUsingPUT(@ApiParam(value = "update" ,required=true )  @Valid @RequestBody BulkUserUpdateRepresentation update);


    @ApiOperation(value = "Create a user", nickname = "createNewUserUsingPOST", notes = "", response = UserRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "admin-users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserRepresentation.class) })
    @RequestMapping(value = "/enterprise/admin/users",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<UserRepresentation> createNewUserUsingPOST(@ApiParam(value = "userRepresentation" ,required=true )  @Valid @RequestBody UserRepresentation userRepresentation);


    @ApiOperation(value = "Get a user", nickname = "getUserUsingGET", notes = "", response = AbstractUserRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "admin-users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AbstractUserRepresentation.class) })
    @RequestMapping(value = "/enterprise/admin/users/{userId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<AbstractUserRepresentation> getUserUsingGET(@ApiParam(value = "userId",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "summary") @Valid @RequestParam(value = "summary", required = false) Boolean summary);


    @ApiOperation(value = "Query users", nickname = "getUsersUsingGET", notes = "", response = ResultListDataRepresentationAbstractUserRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "admin-users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAbstractUserRepresentation.class) })
    @RequestMapping(value = "/enterprise/admin/users",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationAbstractUserRepresentation> getUsersUsingGET(@ApiParam(value = "filter") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "status") @Valid @RequestParam(value = "status", required = false) String status,@ApiParam(value = "accountType") @Valid @RequestParam(value = "accountType", required = false) String accountType,@ApiParam(value = "sort") @Valid @RequestParam(value = "sort", required = false) String sort,@ApiParam(value = "company") @Valid @RequestParam(value = "company", required = false) String company,@ApiParam(value = "start") @Valid @RequestParam(value = "start", required = false) Integer start,@ApiParam(value = "page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "size") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "groupId") @Valid @RequestParam(value = "groupId", required = false) Long groupId,@ApiParam(value = "tenantId") @Valid @RequestParam(value = "tenantId", required = false) Long tenantId,@ApiParam(value = "summary") @Valid @RequestParam(value = "summary", required = false) Boolean summary);


    @ApiOperation(value = "Update a user", nickname = "updateUserDetailsUsingPUT", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "admin-users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/enterprise/admin/users/{userId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUserDetailsUsingPUT(@ApiParam(value = "userId",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "userRepresentation" ,required=true )  @Valid @RequestBody UserRepresentation userRepresentation);

}
