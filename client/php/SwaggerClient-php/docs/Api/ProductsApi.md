# Swagger\Client\ProductsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProductDetail**](ProductsApi.md#getProductDetail) | **GET** /banking/products/{productId} | Get Product Detail
[**listProducts**](ProductsApi.md#listProducts) | **GET** /banking/products | Get Products

# **getProductDetail**
> \Swagger\Client\Model\ResponseBankingProduct getProductDetail($product_id)

Get Product Detail

Obtain detailed information on a single product offered openly to the market

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProductsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$product_id = "product_id_example"; // string | ID of the specific product requested

try {
    $result = $apiInstance->getProductDetail($product_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductsApi->getProductDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **string**| ID of the specific product requested |

### Return type

[**\Swagger\Client\Model\ResponseBankingProduct**](../Model/ResponseBankingProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listProducts**
> \Swagger\Client\Model\ResponseBankingProducts listProducts($effective, $updated_since, $brand, $product_category, $page, $page_size)

Get Products

Obtain a list of products that are currently openly offered to the market

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ProductsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$effective = "effective_example"; // string | Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'
$updated_since = "updated_since_example"; // string | Only include products that have been updated after the specified date and time. If absent defaults to include all products
$brand = "brand_example"; // string | Filter results based on a specific brand
$product_category = "product_category_example"; // string | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listProducts($effective, $updated_since, $brand, $product_category, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductsApi->listProducts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effective** | **string**| Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#x27;CURRENT&#x27; | [optional]
 **updated_since** | **string**| Only include products that have been updated after the specified date and time. If absent defaults to include all products | [optional]
 **brand** | **string**| Filter results based on a specific brand | [optional]
 **product_category** | **string**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingProducts**](../Model/ResponseBankingProducts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

