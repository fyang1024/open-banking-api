# LoanAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**original_start_date** | **string** | Optional original start date for the loan | [optional] 
**original_loan_amount** | **string** | Optional original loan value | [optional] 
**original_loan_currency** | **string** | If absent assumes AUD | [optional] 
**loan_end_date** | **string** | Date that the loan is due to be repaid in full | [optional] 
**next_instalment_date** | **string** | Next date that an instalment is required | [optional] 
**min_instalment_amount** | **string** | Minimum amount of next instalment | [optional] 
**min_instalment_currency** | **string** | If absent assumes AUD | [optional] 
**max_redraw** | **string** | Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account | [optional] 
**max_redraw_currency** | **string** | If absent assumes AUD | [optional] 
**min_redraw** | **string** | Minimum redraw amount | [optional] 
**min_redraw_currency** | **string** | If absent assumes AUD | [optional] 
**offset_account_enabled** | **bool** | Set to true if one or more offset accounts are configured for this loan account | [optional] 
**offset_account_ids** | **string[]** | The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation | [optional] 
**repayment_frequency** | **string** | The expected or required repayment frequency. Formatted according to ISO 8601 Durations | [optional] 
**repayment_type** | **string** | Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

