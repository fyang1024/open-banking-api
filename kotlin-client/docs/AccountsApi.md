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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | A tokenised identifier for the account which is unique but not shareable
try {
    val result : ResponseBankingAccount = apiInstance.getAccountDetail(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.String**](.md)| A tokenised identifier for the account which is unique but not shareable |

### Return type

[**ResponseBankingAccount**](ResponseBankingAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="getTransactionDetail"></a>
# **getTransactionDetail**
> ResponseBankingTransactionDetail getTransactionDetail(accountId, transactionId)

Get Transaction Detail

Obtain detailed information on a transaction for a specific account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | The account id token that is used to uniquely represent the account
val transactionId : kotlin.String = transactionId_example // kotlin.String | The unique identifier for the specific transaction for which details are being requested
try {
    val result : ResponseBankingTransactionDetail = apiInstance.getTransactionDetail(accountId, transactionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getTransactionDetail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getTransactionDetail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.String**](.md)| The account id token that is used to uniquely represent the account |
 **transactionId** | [**kotlin.String**](.md)| The unique identifier for the specific transaction for which details are being requested |

### Return type

[**ResponseBankingTransactionDetail**](ResponseBankingTransactionDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="getTransactions"></a>
# **getTransactions**
> ResponseBankingTransactions getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Account

Obtain transactions for a specific account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.
val startTime : kotlin.String = startTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
val endTime : kotlin.String = endTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
val minAmount : kotlin.String = minAmount_example // kotlin.String | Filter transactions to only transactions with amounts higher or equal to than this amount
val maxAmount : kotlin.String = maxAmount_example // kotlin.String | Filter transactions to only transactions with amounts less than or equal to than this amount
val text : kotlin.String = text_example // kotlin.String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingTransactions = apiInstance.getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.String**](.md)| ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. |
 **startTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **endTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **minAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **maxAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | [**kotlin.String**](.md)| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listAccounts"></a>
# **listAccounts**
> ResponseBankingAccounts listAccounts(openStatus, isOwned, productCategory, page, pageSize)

Get Accounts

Obtain a list of accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val openStatus : kotlin.String = openStatus_example // kotlin.String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
val isOwned : kotlin.String = isOwned_example // kotlin.String | Filters accounts based on whether they are owned by the authorised customer
val productCategory : kotlin.String = productCategory_example // kotlin.String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingAccounts = apiInstance.listAccounts(openStatus, isOwned, productCategory, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | [**kotlin.String**](.md)| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | [**kotlin.String**](.md)| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | [**kotlin.String**](.md)| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingAccounts**](ResponseBankingAccounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listBalancesBulk"></a>
# **listBalancesBulk**
> ResponseBankingAccountsBalances listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize)

Get Bulk Balances

Obtain balances for multiple, filtered accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val openStatus : kotlin.String = openStatus_example // kotlin.String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
val isOwned : kotlin.String = isOwned_example // kotlin.String | Filters accounts based on whether they are owned by the authorised customer
val productCategory : kotlin.String = productCategory_example // kotlin.String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingAccountsBalances = apiInstance.listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listBalancesBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listBalancesBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | [**kotlin.String**](.md)| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | [**kotlin.String**](.md)| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | [**kotlin.String**](.md)| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingAccountsBalances**](ResponseBankingAccountsBalances.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listBalancesSpecificAccounts"></a>
# **listBalancesSpecificAccounts**
> ResponseBankingAccountsBalances listBalancesSpecificAccounts(body)

Get Balances For Specific Accounts

Obtain balances for a specified list of accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val body : RequestAccountIds =  // RequestAccountIds | The list of account IDs to obtain information for
try {
    val result : ResponseBankingAccountsBalances = apiInstance.listBalancesSpecificAccounts(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listBalancesSpecificAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listBalancesSpecificAccounts")
    e.printStackTrace()
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
 - **Accept**: 

<a name="listTransactionsBulk"></a>
# **listTransactionsBulk**
> ResponseBankingTransactions listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Multiple Accounts

Obtain transactions for multiple, filtered accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val openStatus : kotlin.String = openStatus_example // kotlin.String | Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed
val isOwned : kotlin.String = isOwned_example // kotlin.String | Filters accounts based on whether they are owned by the authorised customer
val productCategory : kotlin.String = productCategory_example // kotlin.String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
val startTime : kotlin.String = startTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
val endTime : kotlin.String = endTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
val minAmount : kotlin.String = minAmount_example // kotlin.String | Filter transactions to only transactions with amounts higher or equal to than this amount
val maxAmount : kotlin.String = maxAmount_example // kotlin.String | Filter transactions to only transactions with amounts less than or equal to than this amount
val text : kotlin.String = text_example // kotlin.String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingTransactions = apiInstance.listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listTransactionsBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listTransactionsBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openStatus** | [**kotlin.String**](.md)| Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed | [optional] [enum: OPEN, CLOSED, ALL]
 **isOwned** | [**kotlin.String**](.md)| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | [**kotlin.String**](.md)| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **startTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **endTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **minAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **maxAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | [**kotlin.String**](.md)| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listTransactionsSpecificAccounts"></a>
# **listTransactionsSpecificAccounts**
> ResponseBankingTransactions listTransactionsSpecificAccounts(bodystartTime, endTime, minAmount, maxAmount, text, page, pageSize)

Get Transactions For Specific Accounts

Obtain transactions for a specified list of transactions.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = AccountsApi()
val body : RequestAccountIds =  // RequestAccountIds | The list of account IDs to obtain information for
val startTime : kotlin.String = startTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type
val endTime : kotlin.String = endTime_example // kotlin.String | Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type
val minAmount : kotlin.String = minAmount_example // kotlin.String | Filter transactions to only transactions with amounts higher or equal to than this amount
val maxAmount : kotlin.String = maxAmount_example // kotlin.String | Filter transactions to only transactions with amounts less than or equal to than this amount
val text : kotlin.String = text_example // kotlin.String | Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingTransactions = apiInstance.listTransactionsSpecificAccounts(bodystartTime, endTime, minAmount, maxAmount, text, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#listTransactionsSpecificAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#listTransactionsSpecificAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for |
 **startTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type | [optional]
 **endTime** | [**kotlin.String**](.md)| Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type | [optional]
 **minAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts higher or equal to than this amount | [optional]
 **maxAmount** | [**kotlin.String**](.md)| Filter transactions to only transactions with amounts less than or equal to than this amount | [optional]
 **text** | [**kotlin.String**](.md)| Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string | [optional]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingTransactions**](ResponseBankingTransactions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

