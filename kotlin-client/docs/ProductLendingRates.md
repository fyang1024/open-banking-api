# ProductLendingRates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lendingRateType** | [**inline**](#LendingRateTypeEnum) | The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning | 
**rate** | [**kotlin.String**](.md) | The rate to be applied | 
**additionalValue** | [**kotlin.String**](.md) | Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType |  [optional]
**additionalInfo** | [**kotlin.String**](.md) | Display text providing more information on the fee. |  [optional]
**additionalInfoUri** | [**kotlin.String**](.md) | Link to a web page with more information  on this fee |  [optional]

<a name="LendingRateTypeEnum"></a>
## Enum: lendingRateType
Name | Value
---- | -----
lendingRateType | FIXED, INTRODUCTORY, DISCOUNT, PENALTY, BUNDLE_DISCOUNT, FLOATING, MARKET_LINKED, CASH_ADVANCE, VARIABLE, COMPARISON
