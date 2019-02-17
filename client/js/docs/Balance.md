# ConsumerDataStandards.Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**balanceUType** | **String** | The type of balance object provided for the account | 
**deposit** | [**DepositBalance**](DepositBalance.md) |  | [optional] 
**lending** | [**LendingBalance**](LendingBalance.md) |  | [optional] 
**purses** | [**[CurrencyAmount]**](CurrencyAmount.md) |  | [optional] 


<a name="BalanceUTypeEnum"></a>
## Enum: BalanceUTypeEnum


* `deposit` (value: `"deposit"`)

* `lending` (value: `"lending"`)

* `purses` (value: `"purses"`)




