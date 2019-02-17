# DirectDebitsApi

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDirectDebits**](DirectDebitsApi.md#listDirectDebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
[**listDirectDebitsBulk**](DirectDebitsApi.md#listDirectDebitsBulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
[**listDirectDebitsSpecificAccounts**](DirectDebitsApi.md#listDirectDebitsSpecificAccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts


<a name="listDirectDebits"></a>
# **listDirectDebits**
> ResponseBankingDirectDebits listDirectDebits(accountId, page, pageSize)

Get Direct Debits For Account

Obtain direct debit authorisations for a specific account

### Example
```java
// Import classes:
ApiClient
ApiException
Configuration
//import org.openbank.client.auth.*;
DirectDebitsApi

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DirectDebitsApi apiInstance = new DirectDebitsApi();
String accountId = "accountId_example"; // String | ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.
Integer page = 1; // Integer | Page of results to request (standard pagination)
Integer pageSize = 25; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingDirectDebits result = apiInstance.listDirectDebits(accountId, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDebitsApi#listDirectDebits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. |
 **page** | **Integer**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDirectDebitsBulk"></a>
# **listDirectDebitsBulk**
> ResponseBankingDirectDebits listDirectDebitsBulk(isOwned, productCategory, page, pageSize)

Get Bulk Direct Debits

Obtain direct debit authorisations for multiple, filtered accounts

### Example
```java
// Import classes:
//import org.openbank.client.ApiClient;
//import org.openbank.client.ApiException;
//import org.openbank.client.Configuration;
//import org.openbank.client.auth.*;
//import org.openbank.client.api.DirectDebitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DirectDebitsApi apiInstance = new DirectDebitsApi();
String isOwned = "ALL"; // String | Filters accounts based on whether they are owned by the authorised customer
String productCategory = "productCategory_example"; // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
Integer page = 1; // Integer | Page of results to request (standard pagination)
Integer pageSize = 25; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingDirectDebits result = apiInstance.listDirectDebitsBulk(isOwned, productCategory, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDebitsApi#listDirectDebitsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [default to ALL] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional] [default to 1]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional] [default to 25]

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
```java
// Import classes:
//import org.openbank.client.ApiClient;
//import org.openbank.client.ApiException;
//import org.openbank.client.Configuration;
//import org.openbank.client.auth.*;
//import org.openbank.client.api.DirectDebitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

DirectDebitsApi apiInstance = new DirectDebitsApi();
RequestAccountIds requestAccountIds = new RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
try {
    ResponseBankingDirectDebits result = apiInstance.listDirectDebitsSpecificAccounts(requestAccountIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectDebitsApi#listDirectDebitsSpecificAccounts");
    e.printStackTrace();
}
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

