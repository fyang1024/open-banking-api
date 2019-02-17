
# EmailAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPreferred** | **Boolean** | Required for one and only one email record in the collection. Denotes the default email address | 
**purpose** | [**PurposeEnum**](#PurposeEnum) | The purpose for the email, as specified by the customer (Enumeration) | 
**address** | **String** | A correctly formatted email address, as defined by the addr_spec format in RFC_5322 | 


<a name="PurposeEnum"></a>
## Enum: PurposeEnum
Name | Value
---- | -----
WORK | &quot;WORK&quot;
HOME | &quot;HOME&quot;
OTHER | &quot;OTHER&quot;
UNSPECIFIED | &quot;UNSPECIFIED&quot;



