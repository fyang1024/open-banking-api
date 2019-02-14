# ProductFees

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Name of the fee | 
**fee_type** | **string** | The type of fee | 
**amount** | **string** | The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**balance_rate** | **string** | A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**transaction_rate** | **string** | A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**currency** | **string** | The currency the fee will be charged in. Assumes AUD if absent | [optional] 
**additional_value** | **string** | Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType | [optional] 
**additional_info** | **string** | Display text providing more information on the fee | [optional] 
**additional_info_uri** | **string** | Link to a web page with more information on this fee | [optional] 
**discounts** | [**\Swagger\Client\Model\ProductDiscounts[]**](ProductDiscounts.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

