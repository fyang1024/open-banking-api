# Organisation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**last_update_time** | **string** | The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data | 
**agent_first_name** | **string** | The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field | [optional] 
**agent_last_name** | **string** | The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field | 
**agent_role** | **string** | The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known | 
**business_name** | **string** | Name of the organisation | 
**legal_name** | **string** | Legal name, if different to the business name | [optional] 
**short_name** | **string** | Short name used for communication, if  different to the business name | [optional] 
**abn** | **string** | Australian Business Number for the organisation | [optional] 
**acn** | **string** | Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type | [optional] 
**is_acnc_registered** | **bool** | True if registered with the ACNC.  False if not. Absent or null if not confirmed. | [optional] 
**industry_code** | **string** | [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation. | [optional] 
**organisation_type** | **string** | Legal organisation type | 
**registered_country** | **string** | Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent | [optional] 
**establishment_date** | **string** | The date the organisation described was established | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

