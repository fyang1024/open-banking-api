
# Payee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payeeId** | **String** | ID of the payee adhering to the rules of ID permanence | 
**nickname** | **String** | The short display name of the payee as provided by the customer | 
**description** | **String** | A description of the payee provided by the customer |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY | 
**creationDate** | **String** | The date the payee was created by the customer |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DOMESTIC | &quot;DOMESTIC&quot;
INTERNATIONAL | &quot;INTERNATIONAL&quot;
BILLER | &quot;BILLER&quot;



