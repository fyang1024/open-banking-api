# ConsumerDataStandards.DirectDebitsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDirectDebits**](DirectDebitsApi.md#listDirectDebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
[**listDirectDebitsBulk**](DirectDebitsApi.md#listDirectDebitsBulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
[**listDirectDebitsSpecificAccounts**](DirectDebitsApi.md#listDirectDebitsSpecificAccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts


<a name="listDirectDebits"></a>
# **listDirectDebits**
> ResponseBankingDirectDebits listDirectDebits(accountId, opts)

Get Direct Debits For Account

Obtain direct debit authorisations for a specific account

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.DirectDebitsApi();
var accountId = "accountId_example"; // String | ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.
var opts = {
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
apiInstance.listDirectDebits(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. | 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectDebitsBulk"></a>
# **listDirectDebitsBulk**
> ResponseBankingDirectDebits listDirectDebitsBulk(opts)

Get Bulk Direct Debits

Obtain direct debit authorisations for multiple, filtered accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.DirectDebitsApi();
var opts = {
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
apiInstance.listDirectDebitsBulk(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [default to &#39;ALL&#39;]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] 
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectDebitsSpecificAccounts"></a>
# **listDirectDebitsSpecificAccounts**
> ResponseBankingDirectDebits listDirectDebitsSpecificAccounts(requestAccountIds)

Get Direct Debits For Specific Accounts

Obtain direct debit authorisations for a specified list of accounts

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.DirectDebitsApi();
var requestAccountIds = new ConsumerDataStandards.RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listDirectDebitsSpecificAccounts(requestAccountIds, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestAccountIds** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for | 

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

