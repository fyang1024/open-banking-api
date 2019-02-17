# ConsumerDataStandards.ProductDepositRates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositRateType** | **String** | The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning | 
**rate** | **String** | The rate to be applied | 
**additionalValue** | **String** | Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType | [optional] 
**additionalInfo** | **String** | Display text providing more information on the fee | [optional] 
**additionalInfoUri** | **String** | Link to a web page with more information on this fee | [optional] 


<a name="DepositRateTypeEnum"></a>
## Enum: DepositRateTypeEnum


* `FIXED` (value: `"FIXED"`)

* `BONUS` (value: `"BONUS"`)

* `BUNDLE_BONUS` (value: `"BUNDLE_BONUS"`)

* `VARIABLE` (value: `"VARIABLE"`)

* `INTRODUCTORY` (value: `"INTRODUCTORY"`)




