# CustomerApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /common/customer | Get Customer
[**getCustomerDetail**](CustomerApi.md#getCustomerDetail) | **GET** /common/customer/detail | Get Customer Detail


<a name="getCustomer"></a>
# **getCustomer**
> ResponseCommonCustomer getCustomer()

Get Customer

Obtain basic information on the customer that has authorised the current session

### Example
```java
// Import classes:
//import org.openbanking.client.ApiClient;
//import org.openbanking.client.ApiException;
//import org.openbanking.client.Configuration;
//import org.openbanking.client.auth.*;
//import org.openbanking.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
try {
    ResponseCommonCustomer result = apiInstance.getCustomer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCommonCustomer**](ResponseCommonCustomer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerDetail"></a>
# **getCustomerDetail**
> ResponseCommonCustomerDetailed getCustomerDetail()

Get Customer Detail

Obtain detailed information on the authorised customer within the current session.

### Example
```java
// Import classes:
//import org.openbanking.client.ApiClient;
//import org.openbanking.client.ApiException;
//import org.openbanking.client.Configuration;
//import org.openbanking.client.auth.*;
//import org.openbanking.client.api.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CustomerApi apiInstance = new CustomerApi();
try {
    ResponseCommonCustomerDetailed result = apiInstance.getCustomerDetail();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomerDetail");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCommonCustomerDetailed**](ResponseCommonCustomerDetailed.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

