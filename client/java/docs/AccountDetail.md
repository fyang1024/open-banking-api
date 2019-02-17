
# AccountDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**displayName** | **String** | The display name of the account. If a customer provided nickname is available that value should be returned | 
**nickname** | **String** | A customer supplied nick name for the account |  [optional]
**maskedNumber** | **String** | A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked | 
**openStatus** | [**OpenStatusEnum**](#OpenStatusEnum) | Open or closed status for the account.  If not present then OPEN is assumed |  [optional]
**isOwned** | **Boolean** | Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#39;true&#39; is assumed |  [optional]
**productCategory** | [**EnumProductCategory**](EnumProductCategory.md) |  | 
**productName** | **String** | A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display | 
**bsb** | **String** | The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces |  [optional]
**accountNumber** | **String** | The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces |  [optional]
**bundleName** | **String** | Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer |  [optional]
**specificAccountUType** | [**SpecificAccountUTypeEnum**](#SpecificAccountUTypeEnum) | The type of structure to present account specific fields. |  [optional]
**termDeposit** | [**TermDepositAccount**](TermDepositAccount.md) |  |  [optional]
**creditCard** | [**CreditCardAccount**](CreditCardAccount.md) |  |  [optional]
**loan** | [**LoanAccount**](LoanAccount.md) |  |  [optional]
**features** | [**List&lt;AccountFeatures&gt;**](AccountFeatures.md) |  |  [optional]
**fees** | [**List&lt;AccountFees&gt;**](AccountFees.md) |  |  [optional]
**depositRates** | [**List&lt;AccountDepositRates&gt;**](AccountDepositRates.md) |  |  [optional]
**lendingRates** | [**List&lt;AccountLendingRates&gt;**](AccountLendingRates.md) |  |  [optional]
**address** | [**PhysicalAddress**](PhysicalAddress.md) |  |  [optional]


<a name="OpenStatusEnum"></a>
## Enum: OpenStatusEnum
Name | Value
---- | -----
OPEN | &quot;OPEN&quot;
CLOSED | &quot;CLOSED&quot;


<a name="SpecificAccountUTypeEnum"></a>
## Enum: SpecificAccountUTypeEnum
Name | Value
---- | -----
TERMDEPOSIT | &quot;termDeposit&quot;
CREDITCARD | &quot;creditCard&quot;
LOAN | &quot;loan&quot;



