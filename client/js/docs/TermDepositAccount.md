# ConsumerDataStandards.TermDepositAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lodgementDate** | **String** | The lodgement date of the original deposit | 
**maturityDate** | **String** | Maturity date for the term deposit | 
**maturityAmount** | **String** | Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated | [optional] 
**maturityCurrency** | **String** | If absent assumes AUD | [optional] 
**maturityInstructions** | **String** | Current instructions on action to be taken at maturity | 


<a name="MaturityInstructionsEnum"></a>
## Enum: MaturityInstructionsEnum


* `ROLLED_OVER` (value: `"ROLLED_OVER"`)

* `PAID_OUT_AT_MATURITY` (value: `"PAID_OUT_AT_MATURITY"`)




