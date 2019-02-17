# ConsumerDataStandards.LoanAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalStartDate** | **String** | Optional original start date for the loan | [optional] 
**originalLoanAmount** | **String** | Optional original loan value | [optional] 
**originalLoanCurrency** | **String** | If absent assumes AUD | [optional] 
**loanEndDate** | **String** | Date that the loan is due to be repaid in full | [optional] 
**nextInstalmentDate** | **String** | Next date that an instalment is required | [optional] 
**minInstalmentAmount** | **String** | Minimum amount of next instalment | [optional] 
**minInstalmentCurrency** | **String** | If absent assumes AUD | [optional] 
**maxRedraw** | **String** | Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account | [optional] 
**maxRedrawCurrency** | **String** | If absent assumes AUD | [optional] 
**minRedraw** | **String** | Minimum redraw amount | [optional] 
**minRedrawCurrency** | **String** | If absent assumes AUD | [optional] 
**offsetAccountEnabled** | **Boolean** | Set to true if one or more offset accounts are configured for this loan account | [optional] 
**offsetAccountIds** | **[String]** | The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation | [optional] 
**repaymentFrequency** | **String** | The expected or required repayment frequency. Formatted according to ISO 8601 Durations | [optional] 
**repaymentType** | **String** | Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST | [optional] 


<a name="RepaymentTypeEnum"></a>
## Enum: RepaymentTypeEnum


* `INTEREST_ONLY` (value: `"INTEREST_ONLY"`)

* `PRINCIPAL_AND_INTEREST` (value: `"PRINCIPAL_AND_INTEREST"`)




