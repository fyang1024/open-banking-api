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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CustomerApi()
try {
    val result : ResponseCommonCustomer = apiInstance.getCustomer()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#getCustomer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#getCustomer")
    e.printStackTrace()
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
 - **Accept**: 

<a name="getCustomerDetail"></a>
# **getCustomerDetail**
> ResponseCommonCustomerDetailed getCustomerDetail()

Get Customer Detail

Obtain detailed information on the authorised customer within the current session.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = CustomerApi()
try {
    val result : ResponseCommonCustomerDetailed = apiInstance.getCustomerDetail()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#getCustomerDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#getCustomerDetail")
    e.printStackTrace()
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
 - **Accept**: 

