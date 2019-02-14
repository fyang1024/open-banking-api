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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


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

No authorization required

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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

