# DownloadsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDownload**](DownloadsApi.md#cancelDownload) | **DELETE** /downloads/{downloadId} | Cancel a download
[**createDownload**](DownloadsApi.md#createDownload) | **POST** /downloads | Create a new download
[**getDownload**](DownloadsApi.md#getDownload) | **GET** /downloads/{downloadId} | Get a download


<a name="cancelDownload"></a>
# **cancelDownload**
> cancelDownload(downloadId)

Cancel a download

**Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Cancels the creation of a download request.  **Note:** The download node can be deleted using the **DELETE /nodes/{downloadId}** endpoint  By default, if the download node is not deleted it will be picked up by a cleaner job which removes download nodes older than a configurable amount of time (default is 1 hour)  Information about the existing progress at the time of cancelling can be retrieved by calling the **GET /downloads/{downloadId}** endpoint  The cancel operation is done asynchronously. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.DownloadsApi;








DownloadsApi apiInstance = new DownloadsApi();
String downloadId = "downloadId_example"; // String | The identifier of a download node.
try {
    apiInstance.cancelDownload(downloadId);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#cancelDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **downloadId** | **String**| The identifier of a download node. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDownload"></a>
# **createDownload**
> DownloadEntry createDownload(downloadBodyCreate, fields)

Create a new download

**Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Creates a new download node asynchronously, the content of which will be the zipped content of the **nodeIds** specified in the JSON body like this:  &#x60;&#x60;&#x60;JSON {     \&quot;nodeIds\&quot;:      [        \&quot;c8bb482a-ff3c-4704-a3a3-de1c83ccd84c\&quot;,        \&quot;cffa62db-aa01-493d-9594-058bc058eeb1\&quot;      ] } &#x60;&#x60;&#x60;  **Note:** The content of the download node can be obtained using the **GET /nodes/{downloadId}/content** endpoint 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.DownloadsApi;








DownloadsApi apiInstance = new DownloadsApi();
DownloadBodyCreate downloadBodyCreate = new DownloadBodyCreate(); // DownloadBodyCreate | The nodeIds the content of which will be zipped, which zip will be set as the content of our download node.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    DownloadEntry result = apiInstance.createDownload(downloadBodyCreate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#createDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **downloadBodyCreate** | [**DownloadBodyCreate**](DownloadBodyCreate.md)| The nodeIds the content of which will be zipped, which zip will be set as the content of our download node. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**DownloadEntry**](DownloadEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownload"></a>
# **getDownload**
> DownloadEntry getDownload(downloadId, fields)

Get a download

**Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Retrieve status information for download node **downloadId** 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.DownloadsApi;








DownloadsApi apiInstance = new DownloadsApi();
String downloadId = "downloadId_example"; // String | The identifier of a download node.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    DownloadEntry result = apiInstance.getDownload(downloadId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#getDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **downloadId** | **String**| The identifier of a download node. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**DownloadEntry**](DownloadEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

