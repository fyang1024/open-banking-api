# AccountDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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

<a name="SpecificAccountUTypeEnum"></a>
## Enum: SpecificAccountUTypeEnum
Name | Value
---- | -----
TERMDEPOSIT | &quot;termDeposit&quot;
CREDITCARD | &quot;creditCard&quot;
LOAN | &quot;loan&quot;
