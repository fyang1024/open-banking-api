# ProductLendingRates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lendingRateType** | [**LendingRateTypeEnum**](#LendingRateTypeEnum) | The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning | 
**rate** | **String** | The rate to be applied | 
**additionalValue** | **String** | Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType |  [optional]
**additionalInfo** | **String** | Display text providing more information on the fee. |  [optional]
**additionalInfoUri** | **String** | Link to a web page with more information  on this fee |  [optional]

<a name="LendingRateTypeEnum"></a>
## Enum: LendingRateTypeEnum
Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
INTRODUCTORY | &quot;INTRODUCTORY&quot;
DISCOUNT | &quot;DISCOUNT&quot;
PENALTY | &quot;PENALTY&quot;
BUNDLE_DISCOUNT | &quot;BUNDLE_DISCOUNT&quot;
FLOATING | &quot;FLOATING&quot;
MARKET_LINKED | &quot;MARKET_LINKED&quot;
CASH_ADVANCE | &quot;CASH_ADVANCE&quot;
VARIABLE | &quot;VARIABLE&quot;
COMPARISON | &quot;COMPARISON&quot;
