# ConsumerDataStandards.CustomerApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /common/customer | Get Customer
[**getCustomerDetail**](CustomerApi.md#getCustomerDetail) | **GET** /common/customer/detail | Get Customer Detail


<a name="getCustomer"></a>
# **getCustomer**
> ResponseCommonCustomer getCustomer()

Get Customer

Obtain basic information on the customer that has authorised the current session

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.CustomerApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCustomer(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCommonCustomer**](ResponseCommonCustomer.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerDetail"></a>
# **getCustomerDetail**
> ResponseCommonCustomerDetailed getCustomerDetail()

Get Customer Detail

Obtain detailed information on the authorised customer within the current session.

### Example
```javascript
var ConsumerDataStandards = require('consumer_data_standards');
var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new ConsumerDataStandards.CustomerApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCustomerDetail(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseCommonCustomerDetailed**](ResponseCommonCustomerDetailed.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

