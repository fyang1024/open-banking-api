# TransactionDetailExtendedData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payer** | [**kotlin.String**](.md) | Name or description of the originating payer.  Mandatory for inbound payment |  [optional]
**payee** | [**kotlin.String**](.md) | Name or description of the target payee. Mandatory for an outbound payment |  [optional]
**extensionUType** | [**inline**](#ExtensionUTypeEnum) | Optional extended data provided specific to transaction originated via NPP |  [optional]
**extendedDescription** | [**kotlin.String**](.md) | An extended string description. Only present if specified by the extensionUType field |  [optional]
**serviceId** | [**inline**](#ServiceIdEnum) | Identifier of the applicable NPP payment service |  [optional]

<a name="ExtensionUTypeEnum"></a>
## Enum: extensionUType
Name | Value
---- | -----
extensionUType | extendedDescription

<a name="ServiceIdEnum"></a>
## Enum: serviceId
Name | Value
---- | -----
serviceId | X2P1.01
