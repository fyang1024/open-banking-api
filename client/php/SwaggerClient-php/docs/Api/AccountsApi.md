# Swagger\Client\AccountsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountDetail**](AccountsApi.md#getAccountDetail) | **GET** /banking/accounts/{accountId} | Get Account Detail
[**getTransactionDetail**](AccountsApi.md#getTransactionDetail) | **GET** /banking/accounts/{accountId}/transactions/{transactionId} | Get Transaction Detail
[**getTransactions**](AccountsApi.md#getTransactions) | **GET** /banking/accounts/{accountId}/transactions | Get Transactions For Account
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /banking/accounts | Get Accounts
[**listBalancesBulk**](AccountsApi.md#listBalancesBulk) | **GET** /banking/accounts/balances | Get Bulk Balances
[**listBalancesSpecificAccounts**](AccountsApi.md#listBalancesSpecificAccounts) | **POST** /banking/accounts/balances | Get Balances For Specific Accounts
[**listTransactionsBulk**](AccountsApi.md#listTransactionsBulk) | **GET** /banking/accounts/transactions | Get Transactions For Multiple Accounts
[**listTransactionsSpecificAccounts**](AccountsApi.md#listTransactionsSpecificAccounts) | **POST** /banking/accounts/transactions | Get Transactions For Specific Accounts

# **getAccountDetail**
> \Swagger\Client\Model\ResponseBankingAccount getAccountDetail($account_id)

Get Account Detail

Obtain detailed information on a single account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$account_id = "account_id_example"; // string | A tokenised identifier for the account which is unique but not shareable

try {
    $result = $apiInstance->getAccountDetail($account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->getAccountDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| A tokenised identifier for the account which is unique but not shareable |

### Return type

[**\Swagger\Client\Model\ResponseBankingAccount**](../Model/ResponseBankingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransactionDetail**
> \Swagger\Client\Model\ResponseBankingTransactionDetail getTransactionDetail($account_id, $transaction_id)

Get Transaction Detail

Obtain detailed information on a transaction for a specific account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$account_id = "account_id_example"; // string | The account id token that is used to uniquely represent the account
$transaction_id = "transaction_id_example"; // string | The unique identifier for the specific transaction for which details are being requested

try {
    $result = $apiInstance->getTransactionDetail($account_id, $transaction_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->getTransactionDetail: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| The account id token that is used to uniquely represent the account |
 **transaction_id** | **string**| The unique identifier for the specific transaction for which details are being requested |

### Return type

[**\Swagger\Client\Model\ResponseBankingTransactionDetail**](../Model/ResponseBankingTransactionDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTransactions**
> \Swagger\Client\Model\ResponseBankingTransactions getTransactions($account_id, $start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size)

Get Transactions For Account

Obtain transactions for a specific account

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$account_id = "account_id_example"; // string | ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.
$start_time = "start_time_example"; // string | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
$end_time = "end_time_example"; // string | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
$min_amount = "min_amount_example"; // string | Filter transactions to only transactions with amounts higher or equal to than this amount
$max_amount = "max_amount_example"; // string | Filter transactions to only transactions with amounts less than or equal to than this amount
$text = "text_example"; // string | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->getTransactions($account_id, $start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->getTransactions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. |
 **start_time** | **string**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **end_time** | **string**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **min_amount** | **string**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **max_amount** | **string**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | **string**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingTransactions**](../Model/ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAccounts**
> \Swagger\Client\Model\ResponseBankingAccounts listAccounts($open_status, $is_owned, $product_category, $page, $page_size)

Get Accounts

Obtain a list of accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$open_status = "open_status_example"; // string | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
$is_owned = "is_owned_example"; // string | Filters accounts based on whether they are owned by the authorised customer
$product_category = "product_category_example"; // string | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listAccounts($open_status, $is_owned, $product_category, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->listAccounts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **open_status** | **string**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional]
 **is_owned** | **string**| Filters accounts based on whether they are owned by the authorised customer | [optional]
 **product_category** | **string**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingAccounts**](../Model/ResponseBankingAccounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listBalancesBulk**
> \Swagger\Client\Model\ResponseBankingAccountsBalances listBalancesBulk($open_status, $is_owned, $product_category, $page, $page_size)

Get Bulk Balances

Obtain balances for multiple, filtered accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$open_status = "open_status_example"; // string | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
$is_owned = "is_owned_example"; // string | Filters accounts based on whether they are owned by the authorised customer
$product_category = "product_category_example"; // string | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listBalancesBulk($open_status, $is_owned, $product_category, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->listBalancesBulk: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **open_status** | **string**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional]
 **is_owned** | **string**| Filters accounts based on whether they are owned by the authorised customer | [optional]
 **product_category** | **string**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingAccountsBalances**](../Model/ResponseBankingAccountsBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listBalancesSpecificAccounts**
> \Swagger\Client\Model\ResponseBankingAccountsBalances listBalancesSpecificAccounts($body)

Get Balances For Specific Accounts

Obtain balances for a specified list of accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\RequestAccountIds(); // \Swagger\Client\Model\RequestAccountIds | The list of account IDs to obtain information for

try {
    $result = $apiInstance->listBalancesSpecificAccounts($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->listBalancesSpecificAccounts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RequestAccountIds**](../Model/RequestAccountIds.md)| The list of account IDs to obtain information for |

### Return type

[**\Swagger\Client\Model\ResponseBankingAccountsBalances**](../Model/ResponseBankingAccountsBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listTransactionsBulk**
> \Swagger\Client\Model\ResponseBankingTransactions listTransactionsBulk($open_status, $is_owned, $product_category, $start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size)

Get Transactions For Multiple Accounts

Obtain transactions for multiple, filtered accounts

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$open_status = "open_status_example"; // string | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
$is_owned = "is_owned_example"; // string | Filters accounts based on whether they are owned by the authorised customer
$product_category = "product_category_example"; // string | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
$start_time = "start_time_example"; // string | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
$end_time = "end_time_example"; // string | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
$min_amount = "min_amount_example"; // string | Filter transactions to only transactions with amounts higher or equal to than this amount
$max_amount = "max_amount_example"; // string | Filter transactions to only transactions with amounts less than or equal to than this amount
$text = "text_example"; // string | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listTransactionsBulk($open_status, $is_owned, $product_category, $start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->listTransactionsBulk: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **open_status** | **string**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional]
 **is_owned** | **string**| Filters accounts based on whether they are owned by the authorised customer | [optional]
 **product_category** | **string**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional]
 **start_time** | **string**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **end_time** | **string**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **min_amount** | **string**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **max_amount** | **string**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | **string**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingTransactions**](../Model/ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listTransactionsSpecificAccounts**
> \Swagger\Client\Model\ResponseBankingTransactions listTransactionsSpecificAccounts($body$start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size)

Get Transactions For Specific Accounts

Obtain transactions for a specified list of transactions.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\AccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Swagger\Client\Model\RequestAccountIds(); // \Swagger\Client\Model\RequestAccountIds | The list of account IDs to obtain information for
$start_time = "start_time_example"; // string | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
$end_time = "end_time_example"; // string | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
$min_amount = "min_amount_example"; // string | Filter transactions to only transactions with amounts higher or equal to than this amount
$max_amount = "max_amount_example"; // string | Filter transactions to only transactions with amounts less than or equal to than this amount
$text = "text_example"; // string | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
$page = 56; // int | Page of results to request (standard pagination)
$page_size = 56; // int | Page size to request. Default is 25 (standard pagination)

try {
    $result = $apiInstance->listTransactionsSpecificAccounts($body$start_time, $end_time, $min_amount, $max_amount, $text, $page, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountsApi->listTransactionsSpecificAccounts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RequestAccountIds**](../Model/RequestAccountIds.md)| The list of account IDs to obtain information for |
 **start_time** | **string**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **end_time** | **string**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **min_amount** | **string**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **max_amount** | **string**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | **string**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | **int**| Page of results to request (standard pagination) | [optional]
 **page_size** | **int**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**\Swagger\Client\Model\ResponseBankingTransactions**](../Model/ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

