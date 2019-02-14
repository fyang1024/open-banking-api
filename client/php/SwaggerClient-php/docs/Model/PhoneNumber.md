# PhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_preferred** | **bool** | Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#x27;false&#x27; if not present | [optional] 
**purpose** | **string** | The purpose of the number as specified by the customer | 
**country_code** | **string** | If absent, assumed to be Australia (+61). The + should be included | [optional] 
**area_code** | **string** | Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted. | [optional] 
**number** | **string** | The actual phone number, with leading zeros as appropriate | 
**extension** | **string** | An extension number (if applicable) | [optional] 
**full_number** | **string** | Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966 | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

