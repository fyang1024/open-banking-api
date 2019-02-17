# ConsumerDataStandards.PhysicalAddressWithPurpose

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressUType** | **String** | The type of address object present | 
**simple** | [**SimpleAddress**](SimpleAddress.md) |  | [optional] 
**paf** | [**PAFAddress**](PAFAddress.md) |  | [optional] 
**purpose** | **String** | Enumeration of values indicating the purpose of the physical address | 


<a name="AddressUTypeEnum"></a>
## Enum: AddressUTypeEnum


* `simple` (value: `"simple"`)

* `paf` (value: `"paf"`)




<a name="PurposeEnum"></a>
## Enum: PurposeEnum


* `REGISTERED` (value: `"REGISTERED"`)

* `MAIL` (value: `"MAIL"`)

* `PHYSICAL` (value: `"PHYSICAL"`)

* `WORK` (value: `"WORK"`)

* `OTHER` (value: `"OTHER"`)




