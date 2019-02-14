# AccountsApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | A tokenised identifier for the account which is unique but not shareable
try {
    ResponseBankingAccount result = apiInstance.getAccountDetail(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A tokenised identifier for the account which is unique but not shareable |

### Return type

[**ResponseBankingAccount**](ResponseBankingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionDetail"></a>
# **getTransactionDetail**
> ResponseBankingTransactionDetail getTransactionDetail(accountId, transactionId)

Get Transaction Detail

Obtain detailed information on a transaction for a specific account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | The account id token that is used to uniquely represent the account
String transactionId = "transactionId_example"; // String | The unique identifier for the specific transaction for which details are being requested
try {
    ResponseBankingTransactionDetail result = apiInstance.getTransactionDetail(accountId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getTransactionDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| The account id token that is used to uniquely represent the account |
 **transactionId** | **String**| The unique identifier for the specific transaction for which details are being requested |

### Return type

[**ResponseBankingTransactionDetail**](ResponseBankingTransactionDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> ResponseBankingTransactions getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Account

Obtain transactions for a specific account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String accountId = "accountId_example"; // String | ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.
String startTime = "startTime_example"; // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
String endTime = "endTime_example"; // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
String minAmount = "minAmount_example"; // String | Filter transactions to only transactions with amounts higher or equal to than this amount
String maxAmount = "maxAmount_example"; // String | Filter transactions to only transactions with amounts less than or equal to than this amount
String text = "text_example"; // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingTransactions result = apiInstance.getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getTransactions");
    e.printStackTrace();
}
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
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccounts"></a>
# **listAccounts**
> ResponseBankingAccounts listAccounts(openStatus, isOwned, productCategory, page, pageSize)

Get Accounts

Obtain a list of accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String openStatus = "openStatus_example"; // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
String isOwned = "isOwned_example"; // String | Filters accounts based on whether they are owned by the authorised customer
String productCategory = "productCategory_example"; // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingAccounts result = apiInstance.listAccounts(openStatus, isOwned, productCategory, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingAccounts**](ResponseBankingAccounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBalancesBulk"></a>
# **listBalancesBulk**
> ResponseBankingAccountsBalances listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize)

Get Bulk Balances

Obtain balances for multiple, filtered accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String openStatus = "openStatus_example"; // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
String isOwned = "isOwned_example"; // String | Filters accounts based on whether they are owned by the authorised customer
String productCategory = "productCategory_example"; // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingAccountsBalances result = apiInstance.listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listBalancesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingAccountsBalances**](ResponseBankingAccountsBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBalancesSpecificAccounts"></a>
# **listBalancesSpecificAccounts**
> ResponseBankingAccountsBalances listBalancesSpecificAccounts(body)

Get Balances For Specific Accounts

Obtain balances for a specified list of accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
RequestAccountIds body = new RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
try {
    ResponseBankingAccountsBalances result = apiInstance.listBalancesSpecificAccounts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listBalancesSpecificAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for |

### Return type

[**ResponseBankingAccountsBalances**](ResponseBankingAccountsBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransactionsBulk"></a>
# **listTransactionsBulk**
> ResponseBankingTransactions listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Multiple Accounts

Obtain transactions for multiple, filtered accounts

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
String openStatus = "openStatus_example"; // String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
String isOwned = "isOwned_example"; // String | Filters accounts based on whether they are owned by the authorised customer
String productCategory = "productCategory_example"; // String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
String startTime = "startTime_example"; // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
String endTime = "endTime_example"; // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
String minAmount = "minAmount_example"; // String | Filter transactions to only transactions with amounts higher or equal to than this amount
String maxAmount = "maxAmount_example"; // String | Filter transactions to only transactions with amounts less than or equal to than this amount
String text = "text_example"; // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingTransactions result = apiInstance.listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listTransactionsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | **String**| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | **String**| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | **String**| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **startTime** | **String**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **endTime** | **String**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **minAmount** | **String**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **maxAmount** | **String**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | **String**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransactionsSpecificAccounts"></a>
# **listTransactionsSpecificAccounts**
> ResponseBankingTransactions listTransactionsSpecificAccounts(body, startTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Specific Accounts

Obtain transactions for a specified list of transactions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
RequestAccountIds body = new RequestAccountIds(); // RequestAccountIds | The list of account IDs to obtain information for
String startTime = "startTime_example"; // String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
String endTime = "endTime_example"; // String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
String minAmount = "minAmount_example"; // String | Filter transactions to only transactions with amounts higher or equal to than this amount
String maxAmount = "maxAmount_example"; // String | Filter transactions to only transactions with amounts less than or equal to than this amount
String text = "text_example"; // String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
Integer page = 56; // Integer | Page of results to request (standard pagination)
Integer pageSize = 56; // Integer | Page size to request. Default is 25 (standard pagination)
try {
    ResponseBankingTransactions result = apiInstance.listTransactionsSpecificAccounts(body, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#listTransactionsSpecificAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for |
 **startTime** | **String**| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **endTime** | **String**| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **minAmount** | **String**| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **maxAmount** | **String**| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | **String**| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | **Integer**| Page of results to request (standard pagination) | [optional]
 **pageSize** | **Integer**| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

