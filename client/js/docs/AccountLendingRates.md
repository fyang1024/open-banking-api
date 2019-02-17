# ConsumerDataStandards.AccountLendingRates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lendingRateType** | **String** | The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning | 
**rate** | **String** | The rate to be applied | 
**additionalValue** | **String** | Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType | [optional] 
**additionalInfo** | **String** | Display text providing more information on the fee. | [optional] 
**additionalInfoUri** | **String** | Link to a web page with more information  on this fee | [optional] 


<a name="LendingRateTypeEnum"></a>
## Enum: LendingRateTypeEnum


* `FIXED` (value: `"FIXED"`)

* `INTRODUCTORY` (value: `"INTRODUCTORY"`)

* `DISCOUNT` (value: `"DISCOUNT"`)

* `PENALTY` (value: `"PENALTY"`)

* `BUNDLE_DISCOUNT` (value: `"BUNDLE_DISCOUNT"`)

* `FLOATING` (value: `"FLOATING"`)

* `MARKET_LINKED` (value: `"MARKET_LINKED"`)

* `CASH_ADVANCE` (value: `"CASH_ADVANCE"`)

* `VARIABLE` (value: `"VARIABLE"`)

* `COMPARISON` (value: `"COMPARISON"`)




