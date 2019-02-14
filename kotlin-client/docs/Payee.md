# Payee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payeeId** | [**kotlin.String**](.md) | ID of the payee adhering to the rules of ID permanence | 
**nickname** | [**kotlin.String**](.md) | The short display name of the payee as provided by the customer | 
**description** | [**kotlin.String**](.md) | A description of the payee provided by the customer |  [optional]
**type** | [**inline**](#TypeEnum) | The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY | 
**creationDate** | [**kotlin.String**](.md) | The date the payee was created by the customer |  [optional]

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | DOMESTIC, INTERNATIONAL, BILLER
