# ResponseBankingTransactionsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **string** | ID of the account for which transactions are provided | [optional] 
**display_name** | **string** | The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type. | [optional] 
**nickname** | **string** | A customer supplied nick name for the account | [optional] 
**transactions** | [**\Swagger\Client\Model\Transaction[]**](Transaction.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

