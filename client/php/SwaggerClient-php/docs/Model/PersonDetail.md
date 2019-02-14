# PersonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phone_numbers** | [**\Swagger\Client\Model\PhoneNumber[]**](PhoneNumber.md) | At least one record is required | 
**email_addresses** | [**\Swagger\Client\Model\EmailAddress[]**](EmailAddress.md) | May be empty | 
**physical_addresses** | [**\Swagger\Client\Model\PhysicalAddressWithPurpose[]**](PhysicalAddressWithPurpose.md) | Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

