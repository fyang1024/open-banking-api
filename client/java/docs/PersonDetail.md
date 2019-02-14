# PersonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) | At least one record is required | 
**emailAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) | May be empty | 
**physicalAddresses** | [**List&lt;PhysicalAddressWithPurpose&gt;**](PhysicalAddressWithPurpose.md) | Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail | 
