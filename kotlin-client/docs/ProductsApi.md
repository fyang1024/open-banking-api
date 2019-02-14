# ProductsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductDetail**](ProductsApi.md#getProductDetail) | **GET** /banking/products/{productId} | Get Product Detail
[**listProducts**](ProductsApi.md#listProducts) | **GET** /banking/products | Get Products

<a name="getProductDetail"></a>
# **getProductDetail**
> ResponseBankingProduct getProductDetail(productId)

Get Product Detail

Obtain detailed information on a single product offered openly to the market

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProductsApi()
val productId : kotlin.String = productId_example // kotlin.String | ID of the specific product requested
try {
    val result : ResponseBankingProduct = apiInstance.getProductDetail(productId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#getProductDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#getProductDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | [**kotlin.String**](.md)| ID of the specific product requested |

### Return type

[**ResponseBankingProduct**](ResponseBankingProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listProducts"></a>
# **listProducts**
> ResponseBankingProducts listProducts(effective, updatedSince, brand, productCategory, page, pageSize)

Get Products

Obtain a list of products that are currently openly offered to the market

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProductsApi()
val effective : kotlin.String = effective_example // kotlin.String | Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'
val updatedSince : kotlin.String = updatedSince_example // kotlin.String | Only include products that have been updated after the specified date and time. If absent defaults to include all products
val brand : kotlin.String = brand_example // kotlin.String | Filter results based on a specific brand
val productCategory : kotlin.String = productCategory_example // kotlin.String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingProducts = apiInstance.listProducts(effective, updatedSince, brand, productCategory, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#listProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#listProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective** | [**kotlin.String**](.md)| Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#x27;CURRENT&#x27; | [optional] [enum: CURRENT, FUTURE, ALL]
 **updatedSince** | [**kotlin.String**](.md)| Only include products that have been updated after the specified date and time. If absent defaults to include all products | [optional]
 **brand** | [**kotlin.String**](.md)| Filter results based on a specific brand | [optional]
 **productCategory** | [**kotlin.String**](.md)| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingProducts**](ResponseBankingProducts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

