# Person

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**last_update_time** | **string** | The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data | 
**first_name** | **string** | For people with single names this field need not be present.  The single name should be in the lastName field | [optional] 
**last_name** | **string** | For people with single names the single name should be in this field | 
**middle_names** | **string[]** | Field is mandatory but array may be empty | 
**prefix** | **string** | Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc) | [optional] 
**suffix** | **string** | Used for a trailing suffix to the name (e.g. Jr) | [optional] 
**occupation_code** | **string** | Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

