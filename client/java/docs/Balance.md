
# Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**balanceUType** | [**BalanceUTypeEnum**](#BalanceUTypeEnum) | The type of balance object provided for the account | 
**deposit** | [**DepositBalance**](DepositBalance.md) |  |  [optional]
**lending** | [**LendingBalance**](LendingBalance.md) |  |  [optional]
**purses** | [**List&lt;CurrencyAmount&gt;**](CurrencyAmount.md) |  |  [optional]


<a name="BalanceUTypeEnum"></a>
## Enum: BalanceUTypeEnum
Name | Value
---- | -----
DEPOSIT | &quot;deposit&quot;
LENDING | &quot;lending&quot;
PURSES | &quot;purses&quot;



