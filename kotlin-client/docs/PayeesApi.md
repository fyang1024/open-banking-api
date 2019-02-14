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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PayeesApi()
val payeeId : kotlin.String = payeeId_example // kotlin.String | The ID used to locate the details of a particular payee
try {
    val result : ResponseBankingPayeeDetails = apiInstance.getPayeeDetail(payeeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayeesApi#getPayeeDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayeesApi#getPayeeDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payeeId** | [**kotlin.String**](.md)| The ID used to locate the details of a particular payee |

### Return type

[**ResponseBankingPayeeDetails**](ResponseBankingPayeeDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listPayees"></a>
# **listPayees**
> ResponseBankingPayees listPayees(type, page, pageSize)

Get Payees

Obtain a list of pre-registered payees

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PayeesApi()
val type : kotlin.String = type_example // kotlin.String | Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingPayees = apiInstance.listPayees(type, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayeesApi#listPayees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayeesApi#listPayees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**kotlin.String**](.md)| Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL | [optional] [enum: DOMESTIC, INTERNATIONAL, BILLER]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingPayees**](ResponseBankingPayees.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

