# DeclassificationExemptionsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeclassificationExemption**](DeclassificationExemptionsApi.md#createDeclassificationExemption) | **POST** /declassification-exemptions | Create a declassification exemption
[**deleteDeclassificationExemption**](DeclassificationExemptionsApi.md#deleteDeclassificationExemption) | **DELETE** /declassification-exemptions/{declassificationExemptionId} | Delete a declassification exemption
[**listDeclassificationExemptions**](DeclassificationExemptionsApi.md#listDeclassificationExemptions) | **GET** /declassification-exemptions | List all declassification exemptions
[**showDeclassificationExemptionById**](DeclassificationExemptionsApi.md#showDeclassificationExemptionById) | **GET** /declassification-exemptions/{declassificationExemptionId} | Get declassification exemption information
[**updateDeclassificationExemption**](DeclassificationExemptionsApi.md#updateDeclassificationExemption) | **PUT** /declassification-exemptions/{declassificationExemptionId} | Update a declassification exemption


<a name="createDeclassificationExemption"></a>
# **createDeclassificationExemption**
> DeclassificationExemptionEntry createDeclassificationExemption(declassificationExemption)

Create a declassification exemption

Creates a new declassification exemption.  **Note:** You can create more than one exemption by specifying a list of exemptions in the JSON body. For example, the following JSON body creates two declassification exemptions: &#x60;&#x60;&#x60;JSON [   {     \&quot;code\&quot;:\&quot;My Code1\&quot;,     \&quot;description\&quot;:\&quot;My Description1\&quot;   },   {     \&quot;code\&quot;:\&quot;My Code2\&quot;,     \&quot;description\&quot;:\&quot;My Description2\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.DeclassificationExemptionsApi;








DeclassificationExemptionsApi apiInstance = new DeclassificationExemptionsApi();
DeclassificationExemptionBody declassificationExemption = new DeclassificationExemptionBody(); // DeclassificationExemptionBody | Declassification exemption
try {
    DeclassificationExemptionEntry result = apiInstance.createDeclassificationExemption(declassificationExemption);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeclassificationExemptionsApi#createDeclassificationExemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **declassificationExemption** | [**DeclassificationExemptionBody**](DeclassificationExemptionBody.md)| Declassification exemption |

### Return type

[**DeclassificationExemptionEntry**](DeclassificationExemptionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeclassificationExemption"></a>
# **deleteDeclassificationExemption**
> deleteDeclassificationExemption(declassificationExemptionId)

Delete a declassification exemption

Deletes the declassification exemption with id **declassificationExemptionId**. You can&#39;t delete a classification exemption that is being used to classify content.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.DeclassificationExemptionsApi;








DeclassificationExemptionsApi apiInstance = new DeclassificationExemptionsApi();
String declassificationExemptionId = "declassificationExemptionId_example"; // String | The identifier for the declassification exemption
try {
    apiInstance.deleteDeclassificationExemption(declassificationExemptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeclassificationExemptionsApi#deleteDeclassificationExemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **declassificationExemptionId** | **String**| The identifier for the declassification exemption |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDeclassificationExemptions"></a>
# **listDeclassificationExemptions**
> DeclassificationExemptionsPaging listDeclassificationExemptions(skipCount, maxItems)

List all declassification exemptions

Gets all declassification exemptions.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.DeclassificationExemptionsApi;








DeclassificationExemptionsApi apiInstance = new DeclassificationExemptionsApi();
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
try {
    DeclassificationExemptionsPaging result = apiInstance.listDeclassificationExemptions(skipCount, maxItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeclassificationExemptionsApi#listDeclassificationExemptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]

### Return type

[**DeclassificationExemptionsPaging**](DeclassificationExemptionsPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showDeclassificationExemptionById"></a>
# **showDeclassificationExemptionById**
> DeclassificationExemptionEntry showDeclassificationExemptionById(declassificationExemptionId)

Get declassification exemption information

Gets the declassification exemption with id **declassificationExemptionId**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.DeclassificationExemptionsApi;








DeclassificationExemptionsApi apiInstance = new DeclassificationExemptionsApi();
String declassificationExemptionId = "declassificationExemptionId_example"; // String | The identifier for the declassification exemption
try {
    DeclassificationExemptionEntry result = apiInstance.showDeclassificationExemptionById(declassificationExemptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeclassificationExemptionsApi#showDeclassificationExemptionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **declassificationExemptionId** | **String**| The identifier for the declassification exemption |

### Return type

[**DeclassificationExemptionEntry**](DeclassificationExemptionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDeclassificationExemption"></a>
# **updateDeclassificationExemption**
> DeclassificationExemptionEntry updateDeclassificationExemption(declassificationExemptionId, declassificationExemption)

Update a declassification exemption

Updates the declassification exemption with id **declassificationExemptionId**. For example, you can rename a declassification exemption.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.DeclassificationExemptionsApi;








DeclassificationExemptionsApi apiInstance = new DeclassificationExemptionsApi();
String declassificationExemptionId = "declassificationExemptionId_example"; // String | The identifier for the declassification exemption
DeclassificationExemptionBody declassificationExemption = new DeclassificationExemptionBody(); // DeclassificationExemptionBody | Declassification exemption
try {
    DeclassificationExemptionEntry result = apiInstance.updateDeclassificationExemption(declassificationExemptionId, declassificationExemption);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeclassificationExemptionsApi#updateDeclassificationExemption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **declassificationExemptionId** | **String**| The identifier for the declassification exemption |
 **declassificationExemption** | [**DeclassificationExemptionBody**](DeclassificationExemptionBody.md)| Declassification exemption |

### Return type

[**DeclassificationExemptionEntry**](DeclassificationExemptionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

