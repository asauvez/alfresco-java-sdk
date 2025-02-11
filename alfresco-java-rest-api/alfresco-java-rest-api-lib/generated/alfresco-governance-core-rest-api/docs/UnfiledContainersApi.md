# UnfiledContainersApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUnfiledContainerChildren**](UnfiledContainersApi.md#createUnfiledContainerChildren) | **POST** /unfiled-containers/{unfiledContainerId}/children | Create a record or an unfiled record folder
[**getUnfiledContainer**](UnfiledContainersApi.md#getUnfiledContainer) | **GET** /unfiled-containers/{unfiledContainerId} | Get the unfiled records container
[**listUnfiledContainerChildren**](UnfiledContainersApi.md#listUnfiledContainerChildren) | **GET** /unfiled-containers/{unfiledContainerId}/children | List unfiled record container&#39;s children
[**updateUnfiledContainer**](UnfiledContainersApi.md#updateUnfiledContainer) | **PUT** /unfiled-containers/{unfiledContainerId} | Update an unfiled record container


<a name="createUnfiledContainerChildren"></a>
# **createUnfiledContainerChildren**
> UnfiledContainerAssociationPaging createUnfiledContainerChildren(unfiledContainerId, nodeBodyCreate, autoRename, include, fields)

Create a record or an unfiled record folder

Creates a record or an unfiled record folder as a primary child of **unfiledContainerId**.  You can set the **autoRename** boolean field to automatically resolve name clashes. If there is a name clash, then the API method tries to create a unique name using an integer suffix.  This endpoint supports both JSON and multipart/form-data (file upload).  **Using multipart/form-data**  Use the **filedata** field to represent the content to upload, for example, the following curl command will create a node with the contents of test.txt in the test user&#39;s home folder.  &#x60;&#x60;&#x60;curl -utest:test -X POST host:port/alfresco/api/-default-/public/gs/versions/1/unfiled-containers/{unfiledContainerId}/children -F filedata&#x3D;@test.txt&#x60;&#x60;&#x60;  This API method also supports record and unfiled record folder creation using application/json.  You must specify at least a **name** and **nodeType**.  You can create a non-electronic record like this: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Non-electronic Record\&quot;,   \&quot;nodeType\&quot;:\&quot;rma:nonElectronicDocument\&quot;,   \&quot;properties\&quot;:     {       \&quot;cm:description\&quot;:\&quot;My Non-electronic Record Description\&quot;,       \&quot;cm:title\&quot;:\&quot;My Non-electronic Record Title\&quot;,       \&quot;rma:box\&quot;:\&quot;My Non-electronic Record Box\&quot;,       \&quot;rma:file\&quot;:\&quot;My Non-electronic Record File\&quot;,       \&quot;rma:numberOfCopies\&quot;:1,       \&quot;rma:physicalSize\&quot;:30,       \&quot;rma:shelf\&quot;:\&quot;My Non-electronic Record Shelf\&quot;,       \&quot;rma:storageLocation\&quot;:\&quot;My Non-electronic Record Location\&quot;     } } &#x60;&#x60;&#x60;  You can create an empty electronic record: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Electronic Record\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:content\&quot; } &#x60;&#x60;&#x60;  You can create an unfiled record folder like this: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;: \&quot;My Unfiled Record Folder\&quot;,   \&quot;nodeType\&quot;: \&quot;rma:unfiledRecordFolder\&quot;,   \&quot;properties\&quot;:   {     \&quot;cm:title\&quot;: \&quot;My Unfiled Record Folder Title\&quot;   } } &#x60;&#x60;&#x60;  Any missing aspects are applied automatically. You can set aspects explicitly, if needed, using an **aspectNames** field.  **Note:** You can create more than one child by specifying a list of nodes in the JSON body. For example, the following JSON body creates a record and an unfiled record folder inside the specified **unfiledContainerId**: &#x60;&#x60;&#x60;JSON [   {     \&quot;name\&quot;:\&quot;My Record\&quot;,     \&quot;nodeType\&quot;:\&quot;cm:content\&quot;   },   {     \&quot;name\&quot;:\&quot;My Unfiled Record Folder\&quot;,     \&quot;nodeType\&quot;:\&quot;rma:unfiledRecordFolder\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.UnfiledContainersApi;








UnfiledContainersApi apiInstance = new UnfiledContainersApi();
String unfiledContainerId = "unfiledContainerId_example"; // String | The identifier of an unfiled records container. You can use the **-unfiled-** alias.
RMNodeBodyCreate nodeBodyCreate = new RMNodeBodyCreate(); // RMNodeBodyCreate | The node information to create.
Boolean autoRename = true; // Boolean | If true, then  a name clash will cause an attempt to auto rename by finding a unique name using an integer suffix. 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the unfiled records container's children. Any optional field from the response model can be requested. For example: * allowableOperations * path 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    UnfiledContainerAssociationPaging result = apiInstance.createUnfiledContainerChildren(unfiledContainerId, nodeBodyCreate, autoRename, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfiledContainersApi#createUnfiledContainerChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unfiledContainerId** | **String**| The identifier of an unfiled records container. You can use the **-unfiled-** alias. |
 **nodeBodyCreate** | [**RMNodeBodyCreate**](RMNodeBodyCreate.md)| The node information to create. |
 **autoRename** | **Boolean**| If true, then  a name clash will cause an attempt to auto rename by finding a unique name using an integer suffix.  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the unfiled records container&#39;s children. Any optional field from the response model can be requested. For example: * allowableOperations * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**UnfiledContainerAssociationPaging**](UnfiledContainerAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="getUnfiledContainer"></a>
# **getUnfiledContainer**
> UnfiledContainerEntry getUnfiledContainer(unfiledContainerId, include, fields)

Get the unfiled records container

Gets information for unfiled records container **unfiledContainerId**  Mandatory fields and the unfiled records container&#39;s aspects and properties are returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.UnfiledContainersApi;








UnfiledContainersApi apiInstance = new UnfiledContainersApi();
String unfiledContainerId = "unfiledContainerId_example"; // String | The identifier of an unfiled records container. You can use the **-unfiled-** alias.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the unfiled records container's children. Any optional field from the response model can be requested. For example: * allowableOperations * path 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    UnfiledContainerEntry result = apiInstance.getUnfiledContainer(unfiledContainerId, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfiledContainersApi#getUnfiledContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unfiledContainerId** | **String**| The identifier of an unfiled records container. You can use the **-unfiled-** alias. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the unfiled records container&#39;s children. Any optional field from the response model can be requested. For example: * allowableOperations * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**UnfiledContainerEntry**](UnfiledContainerEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUnfiledContainerChildren"></a>
# **listUnfiledContainerChildren**
> UnfiledContainerAssociationPaging listUnfiledContainerChildren(unfiledContainerId, skipCount, maxItems, where, include, includeSource, fields)

List unfiled record container&#39;s children

Returns a list of records or unfiled record folders.  Minimal information for each child is returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.UnfiledContainersApi;








UnfiledContainersApi apiInstance = new UnfiledContainersApi();
String unfiledContainerId = "unfiledContainerId_example"; // String | The identifier of an unfiled records container. You can use the **-unfiled-** alias.
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
String where = "where_example"; // String | Optionally filter the list. Here are some examples:  *   ```where=(isRecord=true)```  *   ```where=(isUnfiledRecordFolder=false)```  *   ```where=(nodeType='cm:content INCLUDESUBTYPES')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the unfiled records container's children. Any optional field from the response model can be requested. For example: * allowableOperations * aspectNames * association  * path * properties 
Boolean includeSource = true; // Boolean | Also include **source** (in addition to **entries**) with folder information on the parent node – the specified parent **unfiledContainerId**
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    UnfiledContainerAssociationPaging result = apiInstance.listUnfiledContainerChildren(unfiledContainerId, skipCount, maxItems, where, include, includeSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfiledContainersApi#listUnfiledContainerChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unfiledContainerId** | **String**| The identifier of an unfiled records container. You can use the **-unfiled-** alias. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **where** | **String**| Optionally filter the list. Here are some examples:  *   &#x60;&#x60;&#x60;where&#x3D;(isRecord&#x3D;true)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isUnfiledRecordFolder&#x3D;false)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(nodeType&#x3D;&#39;cm:content INCLUDESUBTYPES&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the unfiled records container&#39;s children. Any optional field from the response model can be requested. For example: * allowableOperations * aspectNames * association  * path * properties  | [optional]
 **includeSource** | **Boolean**| Also include **source** (in addition to **entries**) with folder information on the parent node – the specified parent **unfiledContainerId** | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**UnfiledContainerAssociationPaging**](UnfiledContainerAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUnfiledContainer"></a>
# **updateUnfiledContainer**
> UnfiledContainerEntry updateUnfiledContainer(unfiledContainerId, unfiledContainerBodyUpdate, include, fields)

Update an unfiled record container

Updates unfiled record container **unfiledContainerId**. For example, you can rename an unfiled record container: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My new name\&quot; } &#x60;&#x60;&#x60; You can also set or update description and title properties: &#x60;&#x60;&#x60;JSON {   \&quot;properties\&quot;:     {        \&quot;cm:description\&quot;: \&quot;New Description\&quot;,        \&quot;cm:title\&quot;:\&quot;New Title\&quot;     } } &#x60;&#x60;&#x60;  **Note:** Currently there is no optimistic locking for updates, so they are applied in \&quot;last one wins\&quot; order. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.UnfiledContainersApi;








UnfiledContainersApi apiInstance = new UnfiledContainersApi();
String unfiledContainerId = "unfiledContainerId_example"; // String | The identifier of an unfiled records container. You can use the **-unfiled-** alias.
UnfiledRecordContainerBodyUpdate unfiledContainerBodyUpdate = new UnfiledRecordContainerBodyUpdate(); // UnfiledRecordContainerBodyUpdate | The unfiled record container information to update.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the unfiled records container's children. Any optional field from the response model can be requested. For example: * allowableOperations * path 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    UnfiledContainerEntry result = apiInstance.updateUnfiledContainer(unfiledContainerId, unfiledContainerBodyUpdate, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfiledContainersApi#updateUnfiledContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unfiledContainerId** | **String**| The identifier of an unfiled records container. You can use the **-unfiled-** alias. |
 **unfiledContainerBodyUpdate** | [**UnfiledRecordContainerBodyUpdate**](UnfiledRecordContainerBodyUpdate.md)| The unfiled record container information to update. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the unfiled records container&#39;s children. Any optional field from the response model can be requested. For example: * allowableOperations * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**UnfiledContainerEntry**](UnfiledContainerEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

