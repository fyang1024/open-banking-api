# AccountFeatures

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**featureType** | [**inline**](#FeatureTypeEnum) | The type of feature described | 
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType |  [optional]

<a name="FeatureTypeEnum"></a>
## Enum: featureType
Name | Value
---- | -----
featureType | CARD_ACCESS, ADDITIONAL_CARDS, UNLIMITED_TXNS, FREE_TXNS, FREE_TXNS_ALLOWANCE, LOYALTY_PROGRAM, OFFSET, OVERDRAFT, REDRAW, INSURANCE, BALANCE_TRANSFERS, INTEREST_FREE, INTEREST_FREE_TRANSFERS, DIGITAL_WALLET, DIGITAL_BANKING, NPP_PAYID, NPP_ENABLED, DONATE_INTEREST, BILL_PAYMENT
