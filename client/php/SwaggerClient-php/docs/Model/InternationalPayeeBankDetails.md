# InternationalPayeeBankDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **string** | Country of the recipient institution. A valid ISO 3166 Alpha-3 country code | [optional] 
**account_number** | **string** | Account Targeted for payment | [optional] 
**bank_address** | [**\Swagger\Client\Model\InternationalPayeeBankDetailsBankAddress**](InternationalPayeeBankDetailsBankAddress.md) |  | [optional] 
**beneficiary_bank_bic** | **string** | Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html) | [optional] 
**fed_wire_number** | **string** | Number for Fedwire payment (Federal Reserve Wire Network) | [optional] 
**sort_code** | **string** | Sort code used for account identification in some jurisdictions | [optional] 
**chip_number** | **string** | Number for the Clearing House Interbank Payments System | [optional] 
**routing_number** | **string** | International bank routing number | [optional] 
**legal_entity_identifier** | **string** | The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

