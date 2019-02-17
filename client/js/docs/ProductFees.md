# ConsumerDataStandards.ProductFees

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the fee | 
**feeType** | **String** | The type of fee | 
**amount** | **String** | The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**balanceRate** | **String** | A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**transactionRate** | **String** | A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory | [optional] 
**currency** | **String** | The currency the fee will be charged in. Assumes AUD if absent | [optional] 
**additionalValue** | **String** | Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType | [optional] 
**additionalInfo** | **String** | Display text providing more information on the fee | [optional] 
**additionalInfoUri** | **String** | Link to a web page with more information on this fee | [optional] 
**discounts** | [**[ProductDiscounts]**](ProductDiscounts.md) |  | [optional] 


<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum


* `PERIODIC` (value: `"PERIODIC"`)

* `TRANSACTION` (value: `"TRANSACTION"`)

* `ESTABLISHMENT` (value: `"ESTABLISHMENT"`)

* `EXIT` (value: `"EXIT"`)

* `OVERDRAW` (value: `"OVERDRAW"`)

* `MIN_BALANCE` (value: `"MIN_BALANCE"`)

* `REDRAW` (value: `"REDRAW"`)

* `CHEQUE_CASH` (value: `"CHEQUE_CASH"`)

* `CHEQUE_STOP` (value: `"CHEQUE_STOP"`)

* `CHEQUE_BOOK` (value: `"CHEQUE_BOOK"`)

* `CARD_REPLACE` (value: `"CARD_REPLACE"`)

* `PAPER_STATEMENT` (value: `"PAPER_STATEMENT"`)

* `OTHER_EVENT` (value: `"OTHER_EVENT"`)




