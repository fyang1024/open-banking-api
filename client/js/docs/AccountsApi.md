# ConsumerDataStandards.AccountsApi

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


<a name="getAccountDetail"></a>
# **getAccountDetail**
> ResponseBankingAccount getAccountDetail(accountId)

Get Account Detail

Obtain detailed information on a single account

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var accountId = "accountId_example"; // String | A tokenised identifier for the account which is unique but not shareable
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountDetail(accountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A tokenised identifier for the account which is unique but not shareable | 

### Return type

[**ResponseBankingAccount**](ResponseBankingAccount.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionDetail"></a>
# **getTransactionDetail**
> ResponseBankingTransactionDetail getTransactionDetail(accountId, transactionId)

Get Transaction Detail

Obtain detailed information on a transaction for a specific account

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var accountId = "accountId_example"; // String | The account id token that is used to uniquely represent the account
var transactionId = "transactionId_example"; // String | The unique identifier for the specific transaction for which details are being requested
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionDetail(accountId, transactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| The account id token that is used to uniquely represent the account | 
 **transactionId** | **String**| The unique identifier for the specific transaction for which details are being requested | 

### Return type

[**ResponseBankingTransactionDetail**](ResponseBankingTransactionDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> ResponseBankingTransactions getTransactions(accountId, opts)

Get Transactions For Account

Obtain transactions for a specific account

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var accountId = "accountId_example"; // String | ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.
var opts = {
  'startTime': "startTime_example", // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
  'endTime': "endTime_example", // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
  'minAmount': "minAmount_example", // String | Filter transactions to only transactions with amounts higher or equal to than this amount
  'maxAmount': "maxAmount_example", // String | Filter transactions to only transactions with amounts less than or equal to than this amount
  'text': "text_example", // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
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
apiInstance.getTransactions(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. | 
 **startTime** | **String**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional] 
 **endTime** | **String**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional] 
 **minAmount** | **String**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional] 
 **maxAmount** | **String**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional] 
 **text** | **String**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccounts"></a>
# **listAccounts**
> ResponseBankingAccounts listAccounts(opts)

Get Accounts

Obtain a list of accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var opts = {
  'openStatus': "'ALL'", // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
  'isOwned': "'ALL'", // String | Filters accounts based on whether they are owned by the authorised customer
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
apiInstance.listAccounts(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [default to &#39;ALL&#39;]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [default to &#39;ALL&#39;]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingAccounts**](ResponseBankingAccounts.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBalancesBulk"></a>
# **listBalancesBulk**
> ResponseBankingAccountsBalances listBalancesBulk(opts)

Get Bulk Balances

Obtain balances for multiple, filtered accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var opts = {
  'openStatus': "'ALL'", // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
  'isOwned': "'ALL'", // String | Filters accounts based on whether they are owned by the authorised customer
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
apiInstance.listBalancesBulk(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [default to &#39;ALL&#39;]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [default to &#39;ALL&#39;]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingAccountsBalances**](ResponseBankingAccountsBalances.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBalancesSpecificAccounts"></a>
# **listBalancesSpecificAccounts**
> ResponseBankingAccountsBalances listBalancesSpecificAccounts(requestAccountIds)

Get Balances For Specific Accounts

Obtain balances for a specified list of accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var requestAccountIds = new ConsumerDataStandards.RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listBalancesSpecificAccounts(requestAccountIds, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestAccountIds** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for | 

### Return type

[**ResponseBankingAccountsBalances**](ResponseBankingAccountsBalances.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactionsBulk"></a>
# **listTransactionsBulk**
> ResponseBankingTransactions listTransactionsBulk(opts)

Get Transactions For Multiple Accounts

Obtain transactions for multiple, filtered accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var opts = {
  'openStatus': "'ALL'", // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
  'isOwned': "'ALL'", // String | Filters accounts based on whether they are owned by the authorised customer
  'productCategory': "productCategory_example", // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
  'startTime': "startTime_example", // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
  'endTime': "endTime_example", // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
  'minAmount': "minAmount_example", // String | Filter transactions to only transactions with amounts higher or equal to than this amount
  'maxAmount': "maxAmount_example", // String | Filter transactions to only transactions with amounts less than or equal to than this amount
  'text': "text_example", // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
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
apiInstance.listTransactionsBulk(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [default to &#39;ALL&#39;]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [default to &#39;ALL&#39;]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] 
 **startTime** | **String**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional] 
 **endTime** | **String**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional] 
 **minAmount** | **String**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional] 
 **maxAmount** | **String**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional] 
 **text** | **String**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransactionsSpecificAccounts"></a>
# **listTransactionsSpecificAccounts**
> ResponseBankingTransactions listTransactionsSpecificAccounts(requestAccountIds, opts)

Get Transactions For Specific Accounts

Obtain transactions for a specified list of transactions.

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.AccountsApi();
var requestAccountIds = new ConsumerDataStandards.RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
var opts = {
  'startTime': "startTime_example", // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
  'endTime': "endTime_example", // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
  'minAmount': "minAmount_example", // String | Filter transactions to only transactions with amounts higher or equal to than this amount
  'maxAmount': "maxAmount_example", // String | Filter transactions to only transactions with amounts less than or equal to than this amount
  'text': "text_example", // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
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
apiInstance.listTransactionsSpecificAccounts(requestAccountIds, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestAccountIds** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for | 
 **startTime** | **String**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional] 
 **endTime** | **String**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional] 
 **minAmount** | **String**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional] 
 **maxAmount** | **String**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional] 
 **text** | **String**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

