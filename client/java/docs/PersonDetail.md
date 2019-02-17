
# PersonDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTime** | **String** | The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data | 
**firstName** | **String** | For people with single names this field need not be present.  The single name should be in the lastName field |  [optional]
**lastName** | **String** | For people with single names the single name should be in this field | 
**middleNames** | **List&lt;String&gt;** | Field is mandatory but array may be empty | 
**prefix** | **String** | Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc) |  [optional]
**suffix** | **String** | Used for a trailing suffix to the name (e.g. Jr) |  [optional]
**occupationCode** | **String** | Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification. |  [optional]
**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) | At least one record is required | 
**emailAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) | May be empty | 
**physicalAddresses** | [**List&lt;PhysicalAddressWithPurpose&gt;**](PhysicalAddressWithPurpose.md) | Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail | 



