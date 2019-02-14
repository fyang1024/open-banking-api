# AccountDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bsb** | **string** | The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces | [optional] 
**account_number** | **string** | The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces | [optional] 
**bundle_name** | **string** | Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer | [optional] 
**specific_account_u_type** | **string** | The type of structure to present account specific fields. | [optional] 
**term_deposit** | [**\Swagger\Client\Model\TermDepositAccount**](TermDepositAccount.md) |  | [optional] 
**credit_card** | [**\Swagger\Client\Model\CreditCardAccount**](CreditCardAccount.md) |  | [optional] 
**loan** | [**\Swagger\Client\Model\LoanAccount**](LoanAccount.md) |  | [optional] 
**features** | [**\Swagger\Client\Model\AccountFeatures[]**](AccountFeatures.md) |  | [optional] 
**fees** | [**\Swagger\Client\Model\AccountFees[]**](AccountFees.md) |  | [optional] 
**deposit_rates** | [**\Swagger\Client\Model\AccountDepositRates[]**](AccountDepositRates.md) |  | [optional] 
**lending_rates** | [**\Swagger\Client\Model\AccountLendingRates[]**](AccountLendingRates.md) |  | [optional] 
**address** | [**\Swagger\Client\Model\PhysicalAddress**](PhysicalAddress.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

