# PayeeDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payeeUType** | [**PayeeUTypeEnum**](#PayeeUTypeEnum) | Type of object included that describes the payee in detail | 
**domestic** | [**DomesticPayee**](DomesticPayee.md) |  |  [optional]
**biller** | [**BillerPayee**](BillerPayee.md) |  |  [optional]
**international** | [**InternationalPayee**](InternationalPayee.md) |  |  [optional]

<a name="PayeeUTypeEnum"></a>
## Enum: PayeeUTypeEnum
Name | Value
---- | -----
DOMESTIC | &quot;domestic&quot;
BILLER | &quot;biller&quot;
INTERNATIONAL | &quot;international&quot;
