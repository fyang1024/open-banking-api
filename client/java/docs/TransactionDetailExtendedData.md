# TransactionDetailExtendedData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payer** | **String** | Name or description of the originating payer.  Mandatory for inbound payment |  [optional]
**payee** | **String** | Name or description of the target payee. Mandatory for an outbound payment |  [optional]
**extensionUType** | [**ExtensionUTypeEnum**](#ExtensionUTypeEnum) | Optional extended data provided specific to transaction originated via NPP |  [optional]
**extendedDescription** | **String** | An extended string description. Only present if specified by the extensionUType field |  [optional]
**serviceId** | [**ServiceIdEnum**](#ServiceIdEnum) | Identifier of the applicable NPP payment service |  [optional]

<a name="ExtensionUTypeEnum"></a>
## Enum: ExtensionUTypeEnum
Name | Value
---- | -----
EXTENDEDDESCRIPTION | &quot;extendedDescription&quot;

<a name="ServiceIdEnum"></a>
## Enum: ServiceIdEnum
Name | Value
---- | -----
_01 | &quot;X2P1.01&quot;
