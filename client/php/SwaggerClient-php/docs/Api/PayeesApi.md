# Swagger\Client\PayeesApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayeeDetail**](PayeesApi.md#getPayeeDetail) | **GET** /banking/payees/{payeeId} | Get Payee Detail
[**listPayees**](PayeesApi.md#listPayees) | **GET** /banking/payees | Get Payees

# **getPayeeDetail**
> \Swagger\Client\Model\ResponseBankingPayeeDetails getPayeeDetail($payee_id)

Get Payee Detail

Obtain detailed information on a single payee

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\PayeesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$payee_id = "payee_id_example"; // string | The ID used to locate the details of a particular payee

try {
    $result = $apiInstance->getPayeeDetail($payee_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PayeesApi->getPayeeDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payee_id** | **string**| The ID used to locate the details of a particular payee |

### Return type

[**\Swagger\Client\Model\ResponseBankingPayeeDetails**](../Model/ResponseBankingPayeeDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listPayees**
> \Swagger\Client\Model\ResponseBankingPayees listPayees($type, $page, $page_size)

Get Payees

Obtain a list of pre-registered payees

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\PayeesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$type = "type_example"; // string | Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listPayees($type, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PayeesApi->listPayees: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **string**| Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingPayees**](../Model/ResponseBankingPayees.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

