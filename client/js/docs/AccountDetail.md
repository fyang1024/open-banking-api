# ConsumerDataStandards.AccountDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**displayName** | **String** | The display name of the account. If a customer provided nickname is available that value should be returned | 
**nickname** | **String** | A customer supplied nick name for the account | [optional] 
**maskedNumber** | **String** | A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked | 
**openStatus** | **String** | Open or closed status for the account.  If not present then OPEN is assumed | [optional] [default to &#39;OPEN&#39;]
**isOwned** | **Boolean** | Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#39;true&#39; is assumed | [optional] [default to true]
**productCategory** | [**EnumProductCategory**](EnumProductCategory.md) |  | 
**productName** | **String** | A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display | 
**bsb** | **String** | The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces | [optional] 
**accountNumber** | **String** | The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces | [optional] 
**bundleName** | **String** | Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer | [optional] 
**specificAccountUType** | **String** | The type of structure to present account specific fields. | [optional] 
**termDeposit** | [**TermDepositAccount**](TermDepositAccount.md) |  | [optional] 
**creditCard** | [**CreditCardAccount**](CreditCardAccount.md) |  | [optional] 
**loan** | [**LoanAccount**](LoanAccount.md) |  | [optional] 
**features** | [**[AccountFeatures]**](AccountFeatures.md) |  | [optional] 
**fees** | [**[AccountFees]**](AccountFees.md) |  | [optional] 
**depositRates** | [**[AccountDepositRates]**](AccountDepositRates.md) |  | [optional] 
**lendingRates** | [**[AccountLendingRates]**](AccountLendingRates.md) |  | [optional] 
**address** | [**PhysicalAddress**](PhysicalAddress.md) |  | [optional] 


<a name="OpenStatusEnum"></a>
## Enum: OpenStatusEnum


* `OPEN` (value: `"OPEN"`)

* `CLOSED` (value: `"CLOSED"`)




<a name="SpecificAccountUTypeEnum"></a>
## Enum: SpecificAccountUTypeEnum


* `termDeposit` (value: `"termDeposit"`)

* `creditCard` (value: `"creditCard"`)

* `loan` (value: `"loan"`)




