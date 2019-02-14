# ProductDepositRates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositRateType** | [**inline**](#DepositRateTypeEnum) | The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning | 
**rate** | [**kotlin.String**](.md) | The rate to be applied | 
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType |  [optional]
**additionalInfo** | [**kotlin.String**](.md) | Display text providing more information on the fee |  [optional]
**additionalInfoUri** | [**kotlin.String**](.md) | Link to a web page with more information on this fee |  [optional]

<a name="DepositRateTypeEnum"></a>
## Enum: depositRateType
Name | Value
---- | -----
depositRateType | FIXED, BONUS, BUNDLE_BONUS, VARIABLE, INTRODUCTORY
