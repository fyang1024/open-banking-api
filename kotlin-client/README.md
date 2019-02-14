# io.swagger.client - Kotlin client library for Consumer Data Standards

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getAccountDetail**](docs/AccountsApi.md#getaccountdetail) | **GET** /banking/accounts/{accountId} | Get Account Detail
*AccountsApi* | [**getTransactionDetail**](docs/AccountsApi.md#gettransactiondetail) | **GET** /banking/accounts/{accountId}/transactions/{transactionId} | Get Transaction Detail
*AccountsApi* | [**getTransactions**](docs/AccountsApi.md#gettransactions) | **GET** /banking/accounts/{accountId}/transactions | Get Transactions For Account
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listaccounts) | **GET** /banking/accounts | Get Accounts
*AccountsApi* | [**listBalancesBulk**](docs/AccountsApi.md#listbalancesbulk) | **GET** /banking/accounts/balances | Get Bulk Balances
*AccountsApi* | [**listBalancesSpecificAccounts**](docs/AccountsApi.md#listbalancesspecificaccounts) | **POST** /banking/accounts/balances | Get Balances For Specific Accounts
*AccountsApi* | [**listTransactionsBulk**](docs/AccountsApi.md#listtransactionsbulk) | **GET** /banking/accounts/transactions | Get Transactions For Multiple Accounts
*AccountsApi* | [**listTransactionsSpecificAccounts**](docs/AccountsApi.md#listtransactionsspecificaccounts) | **POST** /banking/accounts/transactions | Get Transactions For Specific Accounts
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getcustomer) | **GET** /common/customer | Get Customer
*CustomerApi* | [**getCustomerDetail**](docs/CustomerApi.md#getcustomerdetail) | **GET** /common/customer/detail | Get Customer Detail
*DirectDebitsApi* | [**listDirectDebits**](docs/DirectDebitsApi.md#listdirectdebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
*DirectDebitsApi* | [**listDirectDebitsBulk**](docs/DirectDebitsApi.md#listdirectdebitsbulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
*DirectDebitsApi* | [**listDirectDebitsSpecificAccounts**](docs/DirectDebitsApi.md#listdirectdebitsspecificaccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts
*PayeesApi* | [**getPayeeDetail**](docs/PayeesApi.md#getpayeedetail) | **GET** /banking/payees/{payeeId} | Get Payee Detail
*PayeesApi* | [**listPayees**](docs/PayeesApi.md#listpayees) | **GET** /banking/payees | Get Payees
*ProductsApi* | [**getProductDetail**](docs/ProductsApi.md#getproductdetail) | **GET** /banking/products/{productId} | Get Product Detail
*ProductsApi* | [**listProducts**](docs/ProductsApi.md#listproducts) | **GET** /banking/products | Get Products

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Account](docs/Account.md)
 - [io.swagger.client.models.AccountDepositRates](docs/AccountDepositRates.md)
 - [io.swagger.client.models.AccountDetail](docs/AccountDetail.md)
 - [io.swagger.client.models.AccountDiscounts](docs/AccountDiscounts.md)
 - [io.swagger.client.models.AccountFeatures](docs/AccountFeatures.md)
 - [io.swagger.client.models.AccountFees](docs/AccountFees.md)
 - [io.swagger.client.models.AccountLendingRates](docs/AccountLendingRates.md)
 - [io.swagger.client.models.AuthorisedEntity](docs/AuthorisedEntity.md)
 - [io.swagger.client.models.Balance](docs/Balance.md)
 - [io.swagger.client.models.BillerPayee](docs/BillerPayee.md)
 - [io.swagger.client.models.CreditCardAccount](docs/CreditCardAccount.md)
 - [io.swagger.client.models.CurrencyAmount](docs/CurrencyAmount.md)
 - [io.swagger.client.models.DepositBalance](docs/DepositBalance.md)
 - [io.swagger.client.models.DirectDebits](docs/DirectDebits.md)
 - [io.swagger.client.models.DomesticPayee](docs/DomesticPayee.md)
 - [io.swagger.client.models.DomesticPayeeAccount](docs/DomesticPayeeAccount.md)
 - [io.swagger.client.models.DomesticPayeeCard](docs/DomesticPayeeCard.md)
 - [io.swagger.client.models.DomesticPayeePayId](docs/DomesticPayeePayId.md)
 - [io.swagger.client.models.EmailAddress](docs/EmailAddress.md)
 - [io.swagger.client.models.EnumProductCategory](docs/EnumProductCategory.md)
 - [io.swagger.client.models.ErrorList](docs/ErrorList.md)
 - [io.swagger.client.models.ErrorListErrors](docs/ErrorListErrors.md)
 - [io.swagger.client.models.InternationalPayee](docs/InternationalPayee.md)
 - [io.swagger.client.models.InternationalPayeeBankDetails](docs/InternationalPayeeBankDetails.md)
 - [io.swagger.client.models.InternationalPayeeBankDetailsBankAddress](docs/InternationalPayeeBankDetailsBankAddress.md)
 - [io.swagger.client.models.InternationalPayeeBeneficiaryDetails](docs/InternationalPayeeBeneficiaryDetails.md)
 - [io.swagger.client.models.LendingBalance](docs/LendingBalance.md)
 - [io.swagger.client.models.Links](docs/Links.md)
 - [io.swagger.client.models.LinksPaginated](docs/LinksPaginated.md)
 - [io.swagger.client.models.LoanAccount](docs/LoanAccount.md)
 - [io.swagger.client.models.Meta](docs/Meta.md)
 - [io.swagger.client.models.MetaPaginated](docs/MetaPaginated.md)
 - [io.swagger.client.models.Organisation](docs/Organisation.md)
 - [io.swagger.client.models.OrganisationDetail](docs/OrganisationDetail.md)
 - [io.swagger.client.models.PAFAddress](docs/PAFAddress.md)
 - [io.swagger.client.models.Payee](docs/Payee.md)
 - [io.swagger.client.models.PayeeDetail](docs/PayeeDetail.md)
 - [io.swagger.client.models.Person](docs/Person.md)
 - [io.swagger.client.models.PersonDetail](docs/PersonDetail.md)
 - [io.swagger.client.models.PhoneNumber](docs/PhoneNumber.md)
 - [io.swagger.client.models.PhysicalAddress](docs/PhysicalAddress.md)
 - [io.swagger.client.models.PhysicalAddressWithPurpose](docs/PhysicalAddressWithPurpose.md)
 - [io.swagger.client.models.Product](docs/Product.md)
 - [io.swagger.client.models.ProductAdditionalInformation](docs/ProductAdditionalInformation.md)
 - [io.swagger.client.models.ProductBundles](docs/ProductBundles.md)
 - [io.swagger.client.models.ProductConstraints](docs/ProductConstraints.md)
 - [io.swagger.client.models.ProductDepositRates](docs/ProductDepositRates.md)
 - [io.swagger.client.models.ProductDetail](docs/ProductDetail.md)
 - [io.swagger.client.models.ProductDiscounts](docs/ProductDiscounts.md)
 - [io.swagger.client.models.ProductEligibility](docs/ProductEligibility.md)
 - [io.swagger.client.models.ProductFeatures](docs/ProductFeatures.md)
 - [io.swagger.client.models.ProductFees](docs/ProductFees.md)
 - [io.swagger.client.models.ProductLendingRates](docs/ProductLendingRates.md)
 - [io.swagger.client.models.RequestAccountIds](docs/RequestAccountIds.md)
 - [io.swagger.client.models.RequestAccountIdsData](docs/RequestAccountIdsData.md)
 - [io.swagger.client.models.ResponseBankingAccount](docs/ResponseBankingAccount.md)
 - [io.swagger.client.models.ResponseBankingAccounts](docs/ResponseBankingAccounts.md)
 - [io.swagger.client.models.ResponseBankingAccountsBalances](docs/ResponseBankingAccountsBalances.md)
 - [io.swagger.client.models.ResponseBankingAccountsBalancesData](docs/ResponseBankingAccountsBalancesData.md)
 - [io.swagger.client.models.ResponseBankingAccountsData](docs/ResponseBankingAccountsData.md)
 - [io.swagger.client.models.ResponseBankingDirectDebits](docs/ResponseBankingDirectDebits.md)
 - [io.swagger.client.models.ResponseBankingDirectDebitsData](docs/ResponseBankingDirectDebitsData.md)
 - [io.swagger.client.models.ResponseBankingPayeeDetails](docs/ResponseBankingPayeeDetails.md)
 - [io.swagger.client.models.ResponseBankingPayees](docs/ResponseBankingPayees.md)
 - [io.swagger.client.models.ResponseBankingPayeesData](docs/ResponseBankingPayeesData.md)
 - [io.swagger.client.models.ResponseBankingProduct](docs/ResponseBankingProduct.md)
 - [io.swagger.client.models.ResponseBankingProducts](docs/ResponseBankingProducts.md)
 - [io.swagger.client.models.ResponseBankingProductsData](docs/ResponseBankingProductsData.md)
 - [io.swagger.client.models.ResponseBankingTransactionDetail](docs/ResponseBankingTransactionDetail.md)
 - [io.swagger.client.models.ResponseBankingTransactionDetailData](docs/ResponseBankingTransactionDetailData.md)
 - [io.swagger.client.models.ResponseBankingTransactions](docs/ResponseBankingTransactions.md)
 - [io.swagger.client.models.ResponseBankingTransactionsData](docs/ResponseBankingTransactionsData.md)
 - [io.swagger.client.models.ResponseCommonCustomer](docs/ResponseCommonCustomer.md)
 - [io.swagger.client.models.ResponseCommonCustomerData](docs/ResponseCommonCustomerData.md)
 - [io.swagger.client.models.ResponseCommonCustomerDetailed](docs/ResponseCommonCustomerDetailed.md)
 - [io.swagger.client.models.ResponseCommonCustomerDetailedData](docs/ResponseCommonCustomerDetailedData.md)
 - [io.swagger.client.models.SimpleAddress](docs/SimpleAddress.md)
 - [io.swagger.client.models.TermDepositAccount](docs/TermDepositAccount.md)
 - [io.swagger.client.models.Transaction](docs/Transaction.md)
 - [io.swagger.client.models.TransactionDetail](docs/TransactionDetail.md)
 - [io.swagger.client.models.TransactionDetailExtendedData](docs/TransactionDetailExtendedData.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
