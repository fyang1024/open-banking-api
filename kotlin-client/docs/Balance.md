# Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**kotlin.String**](.md) | A unique ID of the account adhering to the standards for ID permanence | 
**balanceUType** | [**inline**](#BalanceUTypeEnum) | The type of balance object provided for the account | 
**deposit** | [**DepositBalance**](DepositBalance.md) |  |  [optional]
**lending** | [**LendingBalance**](LendingBalance.md) |  |  [optional]
**purses** | [**kotlin.Array&lt;CurrencyAmount&gt;**](CurrencyAmount.md) |  |  [optional]

<a name="BalanceUTypeEnum"></a>
## Enum: balanceUType
Name | Value
---- | -----
balanceUType | deposit, lending, purses
