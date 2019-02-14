# PhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPreferred** | [**kotlin.Boolean**](.md) | Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#x27;false&#x27; if not present |  [optional]
**purpose** | [**inline**](#PurposeEnum) | The purpose of the number as specified by the customer | 
**countryCode** | [**kotlin.String**](.md) | If absent, assumed to be Australia (+61). The + should be included |  [optional]
**areaCode** | [**kotlin.String**](.md) | Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted. |  [optional]
**number** | [**kotlin.String**](.md) | The actual phone number, with leading zeros as appropriate | 
**extension** | [**kotlin.String**](.md) | An extension number (if applicable) |  [optional]
**fullNumber** | [**kotlin.String**](.md) | Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966 | 

<a name="PurposeEnum"></a>
## Enum: purpose
Name | Value
---- | -----
purpose | MOBILE, HOME, WORK, OTHER, INTERNATIONAL, UNSPECIFIED
