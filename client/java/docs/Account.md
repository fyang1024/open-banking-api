# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**displayName** | **String** | The display name of the account. If a customer provided nickname is available that value should be returned | 
**nickname** | **String** | A customer supplied nick name for the account |  [optional]
**maskedNumber** | **String** | A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked | 
**openStatus** | [**OpenStatusEnum**](#OpenStatusEnum) | Open or closed status for the account.  If not present then OPEN is assumed |  [optional]
**isOwned** | **Boolean** | Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#x27;true&#x27; is assumed |  [optional]
**productCategory** | [**EnumProductCategory**](EnumProductCategory.md) |  | 
**productName** | **String** | A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display | 

<a name="OpenStatusEnum"></a>
## Enum: OpenStatusEnum
Name | Value
---- | -----
OPEN | &quot;OPEN&quot;
CLOSED | &quot;CLOSED&quot;
