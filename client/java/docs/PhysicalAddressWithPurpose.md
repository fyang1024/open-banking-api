
# PhysicalAddressWithPurpose

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressUType** | [**AddressUTypeEnum**](#AddressUTypeEnum) | The type of address object present | 
**simple** | [**SimpleAddress**](SimpleAddress.md) |  |  [optional]
**paf** | [**PAFAddress**](PAFAddress.md) |  |  [optional]
**purpose** | [**PurposeEnum**](#PurposeEnum) | Enumeration of values indicating the purpose of the physical address | 


<a name="AddressUTypeEnum"></a>
## Enum: AddressUTypeEnum
Name | Value
---- | -----
SIMPLE | &quot;simple&quot;
PAF | &quot;paf&quot;


<a name="PurposeEnum"></a>
## Enum: PurposeEnum
Name | Value
---- | -----
REGISTERED | &quot;REGISTERED&quot;
MAIL | &quot;MAIL&quot;
PHYSICAL | &quot;PHYSICAL&quot;
WORK | &quot;WORK&quot;
OTHER | &quot;OTHER&quot;



