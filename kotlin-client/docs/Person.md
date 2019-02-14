# Person

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTime** | [**kotlin.String**](.md) | The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data | 
**firstName** | [**kotlin.String**](.md) | For people with single names this field need not be present.  The single name should be in the lastName field |  [optional]
**lastName** | [**kotlin.String**](.md) | For people with single names the single name should be in this field | 
**middleNames** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | Field is mandatory but array may be empty | 
**prefix** | [**kotlin.String**](.md) | Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc) |  [optional]
**suffix** | [**kotlin.String**](.md) | Used for a trailing suffix to the name (e.g. Jr) |  [optional]
**occupationCode** | [**kotlin.String**](.md) | Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification. |  [optional]
