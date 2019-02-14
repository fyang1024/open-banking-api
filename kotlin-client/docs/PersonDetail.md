# PersonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumbers** | [**kotlin.Array&lt;PhoneNumber&gt;**](PhoneNumber.md) | At least one record is required | 
**emailAddresses** | [**kotlin.Array&lt;EmailAddress&gt;**](EmailAddress.md) | May be empty | 
**physicalAddresses** | [**kotlin.Array&lt;PhysicalAddressWithPurpose&gt;**](PhysicalAddressWithPurpose.md) | Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail | 
