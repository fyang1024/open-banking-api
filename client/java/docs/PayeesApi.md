# PayeesApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayeeDetail**](PayeesApi.md#getPayeeDetail) | **GET** /banking/payees/{payeeId} | Get Payee Detail
[**listPayees**](PayeesApi.md#listPayees) | **GET** /banking/payees | Get Payees

<a name="getPayeeDetail"></a>
# **getPayeeDetail**
> ResponseBankingPayeeDetails getPayeeDetail(payeeId)

Get Payee Detail

Obtain detailed information on a single payee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PayeesApi;


PayeesApi apiInstance = new PayeesApi();
String payeeId = "payeeId_example"; // String | The ID used to locate the details of a particular payee
try {
    ResponseBankingPayeeDetails result = apiInstance.getPayeeDetail(payeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayeesApi#getPayeeDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payeeId** | **String**| The ID used to locate the details of a particular payee |

### Return type

[**ResponseBankingPayeeDetails**](ResponseBankingPayeeDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayees"></a>
# **listPayees**
> ResponseBankingPayees listPayees(type, page, pageSize)

Get Payees

Obtain a list of pre-registered payees

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PayeesApi;


PayeesApi apiInstance = new PayeesApi();
String type = "type_example"; // String | Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingPayees result = apiInstance.listPayees(type, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayeesApi#listPayees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL | [optional] [enum: DOMESTIC, INTERNATIONAL, BILLER]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingPayees**](ResponseBankingPayees.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

