# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **string** | A unique ID of the account adhering to the standards for ID permanence | 
**display_name** | **string** | The display name of the account. If a customer provided nickname is available that value should be returned | 
**nickname** | **string** | A customer supplied nick name for the account | [optional] 
**masked_number** | **string** | A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked | 
**open_status** | **string** | Open or closed status for the account.  If not present then OPEN is assumed | [optional] [default to 'OPEN']
**is_owned** | **bool** | Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then &#x27;true&#x27; is assumed | [optional] [default to true]
**product_category** | [**\Swagger\Client\Model\EnumProductCategory**](EnumProductCategory.md) |  | 
**product_name** | **string** | A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

