# consumer_data_standards

ConsumerDataStandards - JavaScript client for consumer_data_standards
API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install consumer_data_standards --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your consumer_data_standards from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('consumer_data_standards')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var ConsumerDataStandards = require('consumer_data_standards');

var defaultClient = ConsumerDataStandards.ApiClient.instance;
// Configure OAuth2 access token for authorization: OAuth2
var OAuth2 = defaultClient.authentications['OAuth2'];
OAuth2.accessToken = "YOUR ACCESS TOKEN"

var api = new ConsumerDataStandards.AccountsApi()
var accountId = "accountId_example"; // {String} A tokenised identifier for the account which is unique but not shareable

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getAccountDetail(accountId, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsumerDataStandards.AccountsApi* | [**getAccountDetail**](docs/AccountsApi.md#getAccountDetail) | **GET** /banking/accounts/{accountId} | Get Account Detail
*ConsumerDataStandards.AccountsApi* | [**getTransactionDetail**](docs/AccountsApi.md#getTransactionDetail) | **GET** /banking/accounts/{accountId}/transactions/{transactionId} | Get Transaction Detail
*ConsumerDataStandards.AccountsApi* | [**getTransactions**](docs/AccountsApi.md#getTransactions) | **GET** /banking/accounts/{accountId}/transactions | Get Transactions For Account
*ConsumerDataStandards.AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listAccounts) | **GET** /banking/accounts | Get Accounts
*ConsumerDataStandards.AccountsApi* | [**listBalancesBulk**](docs/AccountsApi.md#listBalancesBulk) | **GET** /banking/accounts/balances | Get Bulk Balances
*ConsumerDataStandards.AccountsApi* | [**listBalancesSpecificAccounts**](docs/AccountsApi.md#listBalancesSpecificAccounts) | **POST** /banking/accounts/balances | Get Balances For Specific Accounts
*ConsumerDataStandards.AccountsApi* | [**listTransactionsBulk**](docs/AccountsApi.md#listTransactionsBulk) | **GET** /banking/accounts/transactions | Get Transactions For Multiple Accounts
*ConsumerDataStandards.AccountsApi* | [**listTransactionsSpecificAccounts**](docs/AccountsApi.md#listTransactionsSpecificAccounts) | **POST** /banking/accounts/transactions | Get Transactions For Specific Accounts
*ConsumerDataStandards.CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /common/customer | Get Customer
*ConsumerDataStandards.CustomerApi* | [**getCustomerDetail**](docs/CustomerApi.md#getCustomerDetail) | **GET** /common/customer/detail | Get Customer Detail
*ConsumerDataStandards.DirectDebitsApi* | [**listDirectDebits**](docs/DirectDebitsApi.md#listDirectDebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
*ConsumerDataStandards.DirectDebitsApi* | [**listDirectDebitsBulk**](docs/DirectDebitsApi.md#listDirectDebitsBulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
*ConsumerDataStandards.DirectDebitsApi* | [**listDirectDebitsSpecificAccounts**](docs/DirectDebitsApi.md#listDirectDebitsSpecificAccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts
*ConsumerDataStandards.PayeesApi* | [**getPayeeDetail**](docs/PayeesApi.md#getPayeeDetail) | **GET** /banking/payees/{payeeId} | Get Payee Detail
*ConsumerDataStandards.PayeesApi* | [**listPayees**](docs/PayeesApi.md#listPayees) | **GET** /banking/payees | Get Payees
*ConsumerDataStandards.ProductsApi* | [**getProductDetail**](docs/ProductsApi.md#getProductDetail) | **GET** /banking/products/{productId} | Get Product Detail
*ConsumerDataStandards.ProductsApi* | [**listProducts**](docs/ProductsApi.md#listProducts) | **GET** /banking/products | Get Products


## Documentation for Models

 - [ConsumerDataStandards.Account](docs/Account.md)
 - [ConsumerDataStandards.AccountDepositRates](docs/AccountDepositRates.md)
 - [ConsumerDataStandards.AccountDetail](docs/AccountDetail.md)
 - [ConsumerDataStandards.AccountDiscounts](docs/AccountDiscounts.md)
 - [ConsumerDataStandards.AccountFeatures](docs/AccountFeatures.md)
 - [ConsumerDataStandards.AccountFees](docs/AccountFees.md)
 - [ConsumerDataStandards.AccountLendingRates](docs/AccountLendingRates.md)
 - [ConsumerDataStandards.AuthorisedEntity](docs/AuthorisedEntity.md)
 - [ConsumerDataStandards.Balance](docs/Balance.md)
 - [ConsumerDataStandards.BillerPayee](docs/BillerPayee.md)
 - [ConsumerDataStandards.CreditCardAccount](docs/CreditCardAccount.md)
 - [ConsumerDataStandards.CurrencyAmount](docs/CurrencyAmount.md)
 - [ConsumerDataStandards.DepositBalance](docs/DepositBalance.md)
 - [ConsumerDataStandards.DirectDebits](docs/DirectDebits.md)
 - [ConsumerDataStandards.DomesticPayee](docs/DomesticPayee.md)
 - [ConsumerDataStandards.DomesticPayeeAccount](docs/DomesticPayeeAccount.md)
 - [ConsumerDataStandards.DomesticPayeeCard](docs/DomesticPayeeCard.md)
 - [ConsumerDataStandards.DomesticPayeePayId](docs/DomesticPayeePayId.md)
 - [ConsumerDataStandards.EmailAddress](docs/EmailAddress.md)
 - [ConsumerDataStandards.EnumProductCategory](docs/EnumProductCategory.md)
 - [ConsumerDataStandards.ErrorList](docs/ErrorList.md)
 - [ConsumerDataStandards.ErrorListErrors](docs/ErrorListErrors.md)
 - [ConsumerDataStandards.InternationalPayee](docs/InternationalPayee.md)
 - [ConsumerDataStandards.InternationalPayeeBankDetails](docs/InternationalPayeeBankDetails.md)
 - [ConsumerDataStandards.InternationalPayeeBankDetailsBankAddress](docs/InternationalPayeeBankDetailsBankAddress.md)
 - [ConsumerDataStandards.InternationalPayeeBeneficiaryDetails](docs/InternationalPayeeBeneficiaryDetails.md)
 - [ConsumerDataStandards.LendingBalance](docs/LendingBalance.md)
 - [ConsumerDataStandards.Links](docs/Links.md)
 - [ConsumerDataStandards.LinksPaginated](docs/LinksPaginated.md)
 - [ConsumerDataStandards.LoanAccount](docs/LoanAccount.md)
 - [ConsumerDataStandards.MetaPaginated](docs/MetaPaginated.md)
 - [ConsumerDataStandards.Organisation](docs/Organisation.md)
 - [ConsumerDataStandards.OrganisationDetail](docs/OrganisationDetail.md)
 - [ConsumerDataStandards.PAFAddress](docs/PAFAddress.md)
 - [ConsumerDataStandards.Payee](docs/Payee.md)
 - [ConsumerDataStandards.PayeeDetail](docs/PayeeDetail.md)
 - [ConsumerDataStandards.Person](docs/Person.md)
 - [ConsumerDataStandards.PersonDetail](docs/PersonDetail.md)
 - [ConsumerDataStandards.PhoneNumber](docs/PhoneNumber.md)
 - [ConsumerDataStandards.PhysicalAddress](docs/PhysicalAddress.md)
 - [ConsumerDataStandards.PhysicalAddressWithPurpose](docs/PhysicalAddressWithPurpose.md)
 - [ConsumerDataStandards.Product](docs/Product.md)
 - [ConsumerDataStandards.ProductAdditionalInformation](docs/ProductAdditionalInformation.md)
 - [ConsumerDataStandards.ProductBundles](docs/ProductBundles.md)
 - [ConsumerDataStandards.ProductConstraints](docs/ProductConstraints.md)
 - [ConsumerDataStandards.ProductDepositRates](docs/ProductDepositRates.md)
 - [ConsumerDataStandards.ProductDetail](docs/ProductDetail.md)
 - [ConsumerDataStandards.ProductDiscounts](docs/ProductDiscounts.md)
 - [ConsumerDataStandards.ProductEligibility](docs/ProductEligibility.md)
 - [ConsumerDataStandards.ProductFeatures](docs/ProductFeatures.md)
 - [ConsumerDataStandards.ProductFees](docs/ProductFees.md)
 - [ConsumerDataStandards.ProductLendingRates](docs/ProductLendingRates.md)
 - [ConsumerDataStandards.RequestAccountIds](docs/RequestAccountIds.md)
 - [ConsumerDataStandards.RequestAccountIdsData](docs/RequestAccountIdsData.md)
 - [ConsumerDataStandards.ResponseBankingAccount](docs/ResponseBankingAccount.md)
 - [ConsumerDataStandards.ResponseBankingAccounts](docs/ResponseBankingAccounts.md)
 - [ConsumerDataStandards.ResponseBankingAccountsBalances](docs/ResponseBankingAccountsBalances.md)
 - [ConsumerDataStandards.ResponseBankingAccountsBalancesData](docs/ResponseBankingAccountsBalancesData.md)
 - [ConsumerDataStandards.ResponseBankingAccountsData](docs/ResponseBankingAccountsData.md)
 - [ConsumerDataStandards.ResponseBankingDirectDebits](docs/ResponseBankingDirectDebits.md)
 - [ConsumerDataStandards.ResponseBankingDirectDebitsData](docs/ResponseBankingDirectDebitsData.md)
 - [ConsumerDataStandards.ResponseBankingPayeeDetails](docs/ResponseBankingPayeeDetails.md)
 - [ConsumerDataStandards.ResponseBankingPayees](docs/ResponseBankingPayees.md)
 - [ConsumerDataStandards.ResponseBankingPayeesData](docs/ResponseBankingPayeesData.md)
 - [ConsumerDataStandards.ResponseBankingProduct](docs/ResponseBankingProduct.md)
 - [ConsumerDataStandards.ResponseBankingProducts](docs/ResponseBankingProducts.md)
 - [ConsumerDataStandards.ResponseBankingProductsData](docs/ResponseBankingProductsData.md)
 - [ConsumerDataStandards.ResponseBankingTransactionDetail](docs/ResponseBankingTransactionDetail.md)
 - [ConsumerDataStandards.ResponseBankingTransactionDetailData](docs/ResponseBankingTransactionDetailData.md)
 - [ConsumerDataStandards.ResponseBankingTransactions](docs/ResponseBankingTransactions.md)
 - [ConsumerDataStandards.ResponseBankingTransactionsData](docs/ResponseBankingTransactionsData.md)
 - [ConsumerDataStandards.ResponseCommonCustomer](docs/ResponseCommonCustomer.md)
 - [ConsumerDataStandards.ResponseCommonCustomerData](docs/ResponseCommonCustomerData.md)
 - [ConsumerDataStandards.ResponseCommonCustomerDetailed](docs/ResponseCommonCustomerDetailed.md)
 - [ConsumerDataStandards.ResponseCommonCustomerDetailedData](docs/ResponseCommonCustomerDetailedData.md)
 - [ConsumerDataStandards.SimpleAddress](docs/SimpleAddress.md)
 - [ConsumerDataStandards.TermDepositAccount](docs/TermDepositAccount.md)
 - [ConsumerDataStandards.Transaction](docs/Transaction.md)
 - [ConsumerDataStandards.TransactionDetail](docs/TransactionDetail.md)


## Documentation for Authorization


### OAuth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: /oauth2/authorize
- **Scopes**: 
  - accounts: Read accounts information
  - direct-debits: Read direct debits information
  - payees: Read payees information
  - products: Read products information
  - customer: Read customer information

