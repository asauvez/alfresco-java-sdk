# GsSitesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRMSite**](GsSitesApi.md#createRMSite) | **POST** /gs-sites | Create the Records Management (RM) site
[**deleteRMSite**](GsSitesApi.md#deleteRMSite) | **DELETE** /gs-sites/rm | Delete the Records Management (RM) site
[**getRMSite**](GsSitesApi.md#getRMSite) | **GET** /gs-sites/rm | Get the Records Management (RM) site
[**updateRMSite**](GsSitesApi.md#updateRMSite) | **PUT** /gs-sites/rm | Update the Records Management (RM) site


<a name="createRMSite"></a>
# **createRMSite**
> RMSiteEntry createRMSite(siteBodyCreate, skipAddToFavorites)

Create the Records Management (RM) site

 Creates the RM site with the given details.  **Note:** The default site id is rm and the default site name is Records Management. The id of a site cannot be updated once the site has been created.  For example, to create an RM site named \&quot;Records Management\&quot; with \&quot;Records Management Description\&quot; as description, the following body could be used: &#x60;&#x60;&#x60;JSON {   \&quot;title\&quot;: \&quot;Records Management\&quot;,   \&quot;description\&quot;: \&quot;Records Management Description\&quot; } &#x60;&#x60;&#x60;  The creator will be added as a member with Site Manager role.  When you create the RM site, the **filePlan** structure is also created including special containers, such as containers for transfers, holds and, unfiled records. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.GsSitesApi;








GsSitesApi apiInstance = new GsSitesApi();
RMSiteBodyCreate siteBodyCreate = new RMSiteBodyCreate(); // RMSiteBodyCreate | The site details
Boolean skipAddToFavorites = false; // Boolean | Flag to indicate whether the RM site should not be added to the user's site favorites.
try {
    RMSiteEntry result = apiInstance.createRMSite(siteBodyCreate, skipAddToFavorites);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GsSitesApi#createRMSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteBodyCreate** | [**RMSiteBodyCreate**](RMSiteBodyCreate.md)| The site details |
 **skipAddToFavorites** | **Boolean**| Flag to indicate whether the RM site should not be added to the user&#39;s site favorites. | [optional] [default to false]

### Return type

[**RMSiteEntry**](RMSiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRMSite"></a>
# **deleteRMSite**
> deleteRMSite()

Delete the Records Management (RM) site

 Deletes the RM site. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.GsSitesApi;








GsSitesApi apiInstance = new GsSitesApi();
try {
    apiInstance.deleteRMSite();
} catch (ApiException e) {
    System.err.println("Exception when calling GsSitesApi#deleteRMSite");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRMSite"></a>
# **getRMSite**
> RMSiteEntry getRMSite(fields)

Get the Records Management (RM) site

 Gets information for RM site. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.GsSitesApi;








GsSitesApi apiInstance = new GsSitesApi();
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RMSiteEntry result = apiInstance.getRMSite(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GsSitesApi#getRMSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RMSiteEntry**](RMSiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRMSite"></a>
# **updateRMSite**
> RMSiteEntry updateRMSite(siteBodyUpdate, fields)

Update the Records Management (RM) site

 Update the details for the RM site. Site Manager or other (site) admin can update title or description.  **Note**: the id, site visibility, or compliance of the RM site cannot be updated once the site has been created. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.GsSitesApi;








GsSitesApi apiInstance = new GsSitesApi();
RMSiteBodyUpdate siteBodyUpdate = new RMSiteBodyUpdate(); // RMSiteBodyUpdate | The RM site information to update.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RMSiteEntry result = apiInstance.updateRMSite(siteBodyUpdate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GsSitesApi#updateRMSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteBodyUpdate** | [**RMSiteBodyUpdate**](RMSiteBodyUpdate.md)| The RM site information to update. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RMSiteEntry**](RMSiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

