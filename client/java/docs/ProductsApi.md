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
```java
// Import classes:
//import org.openbanking.client.ApiClient;
//import org.openbanking.client.ApiException;
//import org.openbanking.client.Configuration;
//import org.openbanking.client.auth.*;
//import org.openbanking.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
String productId = "productId_example"; // String | ID of the specific product requested
try {
    ResponseBankingProduct result = apiInstance.getProductDetail(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#getProductDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| ID of the specific product requested |

### Return type

[**ResponseBankingProduct**](ResponseBankingProduct.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProducts"></a>
# **listProducts**
> ResponseBankingProducts listProducts(effective, updatedSince, brand, productCategory, page, pageSize)

Get Products

Obtain a list of products that are currently openly offered to the market

### Example
```java
// Import classes:
//import org.openbanking.client.ApiClient;
//import org.openbanking.client.ApiException;
//import org.openbanking.client.Configuration;
//import org.openbanking.client.auth.*;
//import org.openbanking.client.api.ProductsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

ProductsApi apiInstance = new ProductsApi();
String effective = "CURRENT"; // String | Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'
String updatedSince = "updatedSince_example"; // String | Only include products that have been updated after the specified date and time. If absent defaults to include all products
String brand = "brand_example"; // String | Filter results based on a specific brand
String productCategory = "productCategory_example"; // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
Integer page = 1; // Integer | Page of results to request (standard pagination)
Integer pageSize = 25; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingProducts result = apiInstance.listProducts(effective, updatedSince, brand, productCategory, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#listProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective** | **String**| Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#39;CURRENT&#39; | [optional] [default to CURRENT] [enum: CURRENT, FUTURE, ALL]
 **updatedSince** | **String**| Only include products that have been updated after the specified date and time. If absent defaults to include all products | [optional]
 **brand** | **String**| Filter results based on a specific brand | [optional]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingProducts**](ResponseBankingProducts.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

