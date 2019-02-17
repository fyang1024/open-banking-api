# ConsumerDataStandards.ProductsApi

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
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.ProductsApi();
var productId = "productId_example"; // String | ID of the specific product requested
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProductDetail(productId, callback);
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
> ResponseBankingProducts listProducts(opts)

Get Products

Obtain a list of products that are currently openly offered to the market

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.ProductsApi();
var opts = {
  'effective': "'CURRENT'", // String | Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'
  'updatedSince': "updatedSince_example", // String | Only include products that have been updated after the specified date and time. If absent defaults to include all products
  'brand': "brand_example", // String | Filter results based on a specific brand
  'productCategory': "productCategory_example", // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
  'page': 1, // Number | Page of results to request (standard pagination)
  'pageSize': 25 // Number | Page size to request. Default is 25 (standard pagination)
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listProducts(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective** | **String**| Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#39;CURRENT&#39; | [optional] [default to &#39;CURRENT&#39;]
 **updatedSince** | **String**| Only include products that have been updated after the specified date and time. If absent defaults to include all products | [optional] 
 **brand** | **String**| Filter results based on a specific brand | [optional] 
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingProducts**](ResponseBankingProducts.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

