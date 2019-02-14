# TransactionDetailExtendedData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payer** | **string** | Name or description of the originating payer.  Mandatory for inbound payment | [optional] 
**payee** | **string** | Name or description of the target payee. Mandatory for an outbound payment | [optional] 
**extension_u_type** | **string** | Optional extended data provided specific to transaction originated via NPP | [optional] 
**extended_description** | **string** | An extended string description. Only present if specified by the extensionUType field | [optional] 
**service_id** | **string** | Identifier of the applicable NPP payment service | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

