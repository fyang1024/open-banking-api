# Swagger\Client\DirectDebitsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDirectDebits**](DirectDebitsApi.md#listDirectDebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
[**listDirectDebitsBulk**](DirectDebitsApi.md#listDirectDebitsBulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
[**listDirectDebitsSpecificAccounts**](DirectDebitsApi.md#listDirectDebitsSpecificAccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts

# **listDirectDebits**
> \Swagger\Client\Model\ResponseBankingDirectDebits listDirectDebits($account_id, $page, $page_size)

Get Direct Debits For Account

Obtain direct debit authorisations for a specific account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectDebitsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$account_id = "account_id_example"; // string | ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listDirectDebits($account_id, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectDebitsApi->listDirectDebits: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. |
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingDirectDebits**](../Model/ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listDirectDebitsBulk**
> \Swagger\Client\Model\ResponseBankingDirectDebits listDirectDebitsBulk($is_owned, $product_category, $page, $page_size)

Get Bulk Direct Debits

Obtain direct debit authorisations for multiple, filtered accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectDebitsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$is_owned = "is_owned_example"; // string | Filters accounts based on whether they are owned by the authorised customer
$product_category = "product_category_example"; // string | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listDirectDebitsBulk($is_owned, $product_category, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectDebitsApi->listDirectDebitsBulk: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **is_owned** | **string**| Filters accounts based on whether they are owned by the authorised customer | [optional]
 **product_category** | **string**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingDirectDebits**](../Model/ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listDirectDebitsSpecificAccounts**
> \Swagger\Client\Model\ResponseBankingDirectDebits listDirectDebitsSpecificAccounts($body)

Get Direct Debits For Specific Accounts

Obtain direct debit authorisations for a specified list of accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectDebitsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\RequestAccountIds(); // \Swagger\Client\Model\RequestAccountIds | The list of account IDs to obtain information for

try {
    $result = $apiInstance->listDirectDebitsSpecificAccounts($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectDebitsApi->listDirectDebitsSpecificAccounts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RequestAccountIds**](../Model/RequestAccountIds.md)| The list of account IDs to obtain information for |

### Return type

[**\Swagger\Client\Model\ResponseBankingDirectDebits**](../Model/ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

