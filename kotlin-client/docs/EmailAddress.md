# EmailAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPreferred** | [**kotlin.Boolean**](.md) | Required for one and only one email record in the collection. Denotes the default email address | 
**purpose** | [**inline**](#PurposeEnum) | The purpose for the email, as specified by the customer (Enumeration) | 
**address** | [**kotlin.String**](.md) | A correctly formatted email address, as defined by the addr_spec format in RFC_5322 | 

<a name="PurposeEnum"></a>
## Enum: purpose
Name | Value
---- | -----
purpose | WORK, HOME, OTHER, UNSPECIFIED
