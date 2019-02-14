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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DirectDebitsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingDirectDebits = apiInstance.listDirectDebits(accountId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectDebitsApi#listDirectDebits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectDebitsApi#listDirectDebits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.String**](.md)| ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. |
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listDirectDebitsBulk"></a>
# **listDirectDebitsBulk**
> ResponseBankingDirectDebits listDirectDebitsBulk(isOwned, productCategory, page, pageSize)

Get Bulk Direct Debits

Obtain direct debit authorisations for multiple, filtered accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DirectDebitsApi()
val isOwned : kotlin.String = isOwned_example // kotlin.String | Filters accounts based on whether they are owned by the authorised customer
val productCategory : kotlin.String = productCategory_example // kotlin.String | Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.
val page : kotlin.Int = 56 // kotlin.Int | Page of results to request (standard pagination)
val pageSize : kotlin.Int = 56 // kotlin.Int | Page size to request. Default is 25 (standard pagination)
try {
    val result : ResponseBankingDirectDebits = apiInstance.listDirectDebitsBulk(isOwned, productCategory, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectDebitsApi#listDirectDebitsBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectDebitsApi#listDirectDebitsBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isOwned** | [**kotlin.String**](.md)| Filters accounts based on whether they are owned by the authorised customer | [optional] [enum: OWNED, NOT_OWNED, ALL]
 **productCategory** | [**kotlin.String**](.md)| Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. | [optional] [enum: PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD]
 **page** | [**kotlin.Int**](.md)| Page of results to request (standard pagination) | [optional]
 **pageSize** | [**kotlin.Int**](.md)| Page size to request. Default is 25 (standard pagination) | [optional]

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

<a name="listDirectDebitsSpecificAccounts"></a>
# **listDirectDebitsSpecificAccounts**
> ResponseBankingDirectDebits listDirectDebitsSpecificAccounts(body)

Get Direct Debits For Specific Accounts

Obtain direct debit authorisations for a specified list of accounts

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DirectDebitsApi()
val body : RequestAccountIds =  // RequestAccountIds | The list of account IDs to obtain information for
try {
    val result : ResponseBankingDirectDebits = apiInstance.listDirectDebitsSpecificAccounts(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectDebitsApi#listDirectDebitsSpecificAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectDebitsApi#listDirectDebitsSpecificAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestAccountIds**](RequestAccountIds.md)| The list of account IDs to obtain information for |

### Return type

[**ResponseBankingDirectDebits**](ResponseBankingDirectDebits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: 

