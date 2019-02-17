# ConsumerDataStandards.ProductDiscounts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the discount | 
**discountType** | **String** | The type of discount. See the next section for an overview of valid values and their meaning | 
**amount** | **String** | Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself | 
**additionalValue** | **String** | Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType | [optional] 


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum


* `BALANCE` (value: `"BALANCE"`)

* `DEPOSITS` (value: `"DEPOSITS"`)

* `PAYMENTS` (value: `"PAYMENTS"`)

* `BUNDLE` (value: `"BUNDLE"`)




