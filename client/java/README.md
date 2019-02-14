# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        
        AccountsApi apiInstance = new AccountsApi();
        String accountId = "accountId_example"; // String | A tokenised identifier for the account which is unique but not shareable
        try {
            ResponseBankingAccount result = apiInstance.getAccountDetail(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#getAccountDetail");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://data.provider.com.au/cds-au/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getAccountDetail**](docs/AccountsApi.md#getAccountDetail) | **GET** /banking/accounts/{accountId} | Get Account Detail
*AccountsApi* | [**getTransactionDetail**](docs/AccountsApi.md#getTransactionDetail) | **GET** /banking/accounts/{accountId}/transactions/{transactionId} | Get Transaction Detail
*AccountsApi* | [**getTransactions**](docs/AccountsApi.md#getTransactions) | **GET** /banking/accounts/{accountId}/transactions | Get Transactions For Account
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listAccounts) | **GET** /banking/accounts | Get Accounts
*AccountsApi* | [**listBalancesBulk**](docs/AccountsApi.md#listBalancesBulk) | **GET** /banking/accounts/balances | Get Bulk Balances
*AccountsApi* | [**listBalancesSpecificAccounts**](docs/AccountsApi.md#listBalancesSpecificAccounts) | **POST** /banking/accounts/balances | Get Balances For Specific Accounts
*AccountsApi* | [**listTransactionsBulk**](docs/AccountsApi.md#listTransactionsBulk) | **GET** /banking/accounts/transactions | Get Transactions For Multiple Accounts
*AccountsApi* | [**listTransactionsSpecificAccounts**](docs/AccountsApi.md#listTransactionsSpecificAccounts) | **POST** /banking/accounts/transactions | Get Transactions For Specific Accounts
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /common/customer | Get Customer
*CustomerApi* | [**getCustomerDetail**](docs/CustomerApi.md#getCustomerDetail) | **GET** /common/customer/detail | Get Customer Detail
*DirectDebitsApi* | [**listDirectDebits**](docs/DirectDebitsApi.md#listDirectDebits) | **GET** /banking/accounts/{accountId}/direct-debits | Get Direct Debits For Account
*DirectDebitsApi* | [**listDirectDebitsBulk**](docs/DirectDebitsApi.md#listDirectDebitsBulk) | **GET** /banking/accounts/direct-debits | Get Bulk Direct Debits
*DirectDebitsApi* | [**listDirectDebitsSpecificAccounts**](docs/DirectDebitsApi.md#listDirectDebitsSpecificAccounts) | **POST** /banking/accounts/direct-debits | Get Direct Debits For Specific Accounts
*PayeesApi* | [**getPayeeDetail**](docs/PayeesApi.md#getPayeeDetail) | **GET** /banking/payees/{payeeId} | Get Payee Detail
*PayeesApi* | [**listPayees**](docs/PayeesApi.md#listPayees) | **GET** /banking/payees | Get Payees
*ProductsApi* | [**getProductDetail**](docs/ProductsApi.md#getProductDetail) | **GET** /banking/products/{productId} | Get Product Detail
*ProductsApi* | [**listProducts**](docs/ProductsApi.md#listProducts) | **GET** /banking/products | Get Products

## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountDepositRates](docs/AccountDepositRates.md)
 - [AccountDetail](docs/AccountDetail.md)
 - [AccountDiscounts](docs/AccountDiscounts.md)
 - [AccountFeatures](docs/AccountFeatures.md)
 - [AccountFees](docs/AccountFees.md)
 - [AccountLendingRates](docs/AccountLendingRates.md)
 - [AuthorisedEntity](docs/AuthorisedEntity.md)
 - [Balance](docs/Balance.md)
 - [BillerPayee](docs/BillerPayee.md)
 - [CreditCardAccount](docs/CreditCardAccount.md)
 - [CurrencyAmount](docs/CurrencyAmount.md)
 - [DepositBalance](docs/DepositBalance.md)
 - [DirectDebits](docs/DirectDebits.md)
 - [DomesticPayee](docs/DomesticPayee.md)
 - [DomesticPayeeAccount](docs/DomesticPayeeAccount.md)
 - [DomesticPayeeCard](docs/DomesticPayeeCard.md)
 - [DomesticPayeePayId](docs/DomesticPayeePayId.md)
 - [EmailAddress](docs/EmailAddress.md)
 - [EnumProductCategory](docs/EnumProductCategory.md)
 - [ErrorList](docs/ErrorList.md)
 - [ErrorListErrors](docs/ErrorListErrors.md)
 - [InternationalPayee](docs/InternationalPayee.md)
 - [InternationalPayeeBankDetails](docs/InternationalPayeeBankDetails.md)
 - [InternationalPayeeBankDetailsBankAddress](docs/InternationalPayeeBankDetailsBankAddress.md)
 - [InternationalPayeeBeneficiaryDetails](docs/InternationalPayeeBeneficiaryDetails.md)
 - [LendingBalance](docs/LendingBalance.md)
 - [Links](docs/Links.md)
 - [LinksPaginated](docs/LinksPaginated.md)
 - [LoanAccount](docs/LoanAccount.md)
 - [Meta](docs/Meta.md)
 - [MetaPaginated](docs/MetaPaginated.md)
 - [Organisation](docs/Organisation.md)
 - [OrganisationDetail](docs/OrganisationDetail.md)
 - [PAFAddress](docs/PAFAddress.md)
 - [Payee](docs/Payee.md)
 - [PayeeDetail](docs/PayeeDetail.md)
 - [Person](docs/Person.md)
 - [PersonDetail](docs/PersonDetail.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PhysicalAddress](docs/PhysicalAddress.md)
 - [PhysicalAddressWithPurpose](docs/PhysicalAddressWithPurpose.md)
 - [Product](docs/Product.md)
 - [ProductAdditionalInformation](docs/ProductAdditionalInformation.md)
 - [ProductBundles](docs/ProductBundles.md)
 - [ProductConstraints](docs/ProductConstraints.md)
 - [ProductDepositRates](docs/ProductDepositRates.md)
 - [ProductDetail](docs/ProductDetail.md)
 - [ProductDiscounts](docs/ProductDiscounts.md)
 - [ProductEligibility](docs/ProductEligibility.md)
 - [ProductFeatures](docs/ProductFeatures.md)
 - [ProductFees](docs/ProductFees.md)
 - [ProductLendingRates](docs/ProductLendingRates.md)
 - [RequestAccountIds](docs/RequestAccountIds.md)
 - [RequestAccountIdsData](docs/RequestAccountIdsData.md)
 - [ResponseBankingAccount](docs/ResponseBankingAccount.md)
 - [ResponseBankingAccounts](docs/ResponseBankingAccounts.md)
 - [ResponseBankingAccountsBalances](docs/ResponseBankingAccountsBalances.md)
 - [ResponseBankingAccountsBalancesData](docs/ResponseBankingAccountsBalancesData.md)
 - [ResponseBankingAccountsData](docs/ResponseBankingAccountsData.md)
 - [ResponseBankingDirectDebits](docs/ResponseBankingDirectDebits.md)
 - [ResponseBankingDirectDebitsData](docs/ResponseBankingDirectDebitsData.md)
 - [ResponseBankingPayeeDetails](docs/ResponseBankingPayeeDetails.md)
 - [ResponseBankingPayees](docs/ResponseBankingPayees.md)
 - [ResponseBankingPayeesData](docs/ResponseBankingPayeesData.md)
 - [ResponseBankingProduct](docs/ResponseBankingProduct.md)
 - [ResponseBankingProducts](docs/ResponseBankingProducts.md)
 - [ResponseBankingProductsData](docs/ResponseBankingProductsData.md)
 - [ResponseBankingTransactionDetail](docs/ResponseBankingTransactionDetail.md)
 - [ResponseBankingTransactionDetailData](docs/ResponseBankingTransactionDetailData.md)
 - [ResponseBankingTransactions](docs/ResponseBankingTransactions.md)
 - [ResponseBankingTransactionsData](docs/ResponseBankingTransactionsData.md)
 - [ResponseCommonCustomer](docs/ResponseCommonCustomer.md)
 - [ResponseCommonCustomerData](docs/ResponseCommonCustomerData.md)
 - [ResponseCommonCustomerDetailed](docs/ResponseCommonCustomerDetailed.md)
 - [ResponseCommonCustomerDetailedData](docs/ResponseCommonCustomerDetailedData.md)
 - [SimpleAddress](docs/SimpleAddress.md)
 - [TermDepositAccount](docs/TermDepositAccount.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionDetail](docs/TransactionDetail.md)
 - [TransactionDetailExtendedData](docs/TransactionDetailExtendedData.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


