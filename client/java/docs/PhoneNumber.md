
# PhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isPreferred** | **Boolean** | Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#39;false&#39; if not present |  [optional]
**purpose** | [**PurposeEnum**](#PurposeEnum) | The purpose of the number as specified by the customer | 
**countryCode** | **String** | If absent, assumed to be Australia (+61). The + should be included |  [optional]
**areaCode** | **String** | Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted. |  [optional]
**number** | **String** | The actual phone number, with leading zeros as appropriate | 
**extension** | **String** | An extension number (if applicable) |  [optional]
**fullNumber** | **String** | Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966 | 


<a name="PurposeEnum"></a>
## Enum: PurposeEnum
Name | Value
---- | -----
MOBILE | &quot;MOBILE&quot;
HOME | &quot;HOME&quot;
WORK | &quot;WORK&quot;
OTHER | &quot;OTHER&quot;
INTERNATIONAL | &quot;INTERNATIONAL&quot;
UNSPECIFIED | &quot;UNSPECIFIED&quot;



