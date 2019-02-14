# TermDepositAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lodgementDate** | [**kotlin.String**](.md) | The lodgement date of the original deposit | 
**maturityDate** | [**kotlin.String**](.md) | Maturity date for the term deposit | 
**maturityAmount** | [**kotlin.String**](.md) | Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated |  [optional]
**maturityCurrency** | [**kotlin.String**](.md) | If absent assumes AUD |  [optional]
**maturityInstructions** | [**inline**](#MaturityInstructionsEnum) | Current instructions on action to be taken at maturity | 

<a name="MaturityInstructionsEnum"></a>
## Enum: maturityInstructions
Name | Value
---- | -----
maturityInstructions | ROLLED_OVER, PAID_OUT_AT_MATURITY
