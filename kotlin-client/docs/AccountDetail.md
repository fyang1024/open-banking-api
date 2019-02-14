# AccountDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bsb** | [**kotlin.String**](.md) | The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces |  [optional]
**accountNumber** | [**kotlin.String**](.md) | The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces |  [optional]
**bundleName** | [**kotlin.String**](.md) | Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer |  [optional]
**specificAccountUType** | [**inline**](#SpecificAccountUTypeEnum) | The type of structure to present account specific fields. |  [optional]
**termDeposit** | [**TermDepositAccount**](TermDepositAccount.md) |  |  [optional]
**creditCard** | [**CreditCardAccount**](CreditCardAccount.md) |  |  [optional]
**loan** | [**LoanAccount**](LoanAccount.md) |  |  [optional]
**features** | [**kotlin.Array&lt;AccountFeatures&gt;**](AccountFeatures.md) |  |  [optional]
**fees** | [**kotlin.Array&lt;AccountFees&gt;**](AccountFees.md) |  |  [optional]
**depositRates** | [**kotlin.Array&lt;AccountDepositRates&gt;**](AccountDepositRates.md) |  |  [optional]
**lendingRates** | [**kotlin.Array&lt;AccountLendingRates&gt;**](AccountLendingRates.md) |  |  [optional]
**address** | [**PhysicalAddress**](PhysicalAddress.md) |  |  [optional]

<a name="SpecificAccountUTypeEnum"></a>
## Enum: specificAccountUType
Name | Value
---- | -----
specificAccountUType | termDeposit, creditCard, loan
