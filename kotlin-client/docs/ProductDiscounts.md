# ProductDiscounts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | [**kotlin.String**](.md) | Description of the discount | 
**discountType** | [**inline**](#DiscountTypeEnum) | The type of discount. See the next section for an overview of valid values and their meaning | 
**amount** | [**kotlin.String**](.md) | Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself | 
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType |  [optional]

<a name="DiscountTypeEnum"></a>
## Enum: discountType
Name | Value
---- | -----
discountType | BALANCE, DEPOSITS, PAYMENTS, BUNDLE
