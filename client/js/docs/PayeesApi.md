# ConsumerDataStandards.PayeesApi

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
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.PayeesApi();
var payeeId = "payeeId_example"; // String | The ID used to locate the details of a particular payee
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPayeeDetail(payeeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payeeId** | **String**| The ID used to locate the details of a particular payee | 

### Return type

[**ResponseBankingPayeeDetails**](ResponseBankingPayeeDetails.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPayees"></a>
# **listPayees**
> ResponseBankingPayees listPayees(opts)

Get Payees

Obtain a list of pre-registered payees

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.PayeesApi();
var opts = {
  'type': "'ALL'", // String | Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL
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
apiInstance.listPayees(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL | [optional] [default to &#39;ALL&#39;]
 **page** | **Number**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Number**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingPayees**](ResponseBankingPayees.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

