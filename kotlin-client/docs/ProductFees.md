# ProductFees

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.String**](.md) | Name of the fee | 
**feeType** | [**inline**](#FeeTypeEnum) | The type of fee | 
**amount** | [**kotlin.String**](.md) | The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**balanceRate** | [**kotlin.String**](.md) | A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**transactionRate** | [**kotlin.String**](.md) | A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**currency** | [**kotlin.String**](.md) | The currency the fee will be charged in. Assumes AUD if absent |  [optional]
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType |  [optional]
**additionalInfo** | [**kotlin.String**](.md) | Display text providing more information on the fee |  [optional]
**additionalInfoUri** | [**kotlin.String**](.md) | Link to a web page with more information on this fee |  [optional]
**discounts** | [**kotlin.Array&lt;ProductDiscounts&gt;**](ProductDiscounts.md) |  |  [optional]

<a name="FeeTypeEnum"></a>
## Enum: feeType
Name | Value
---- | -----
feeType | PERIODIC, TRANSACTION, ESTABLISHMENT, EXIT, OVERDRAW, MIN_BALANCE, REDRAW, CHEQUE_CASH, CHEQUE_STOP, CHEQUE_BOOK, CARD_REPLACE, PAPER_STATEMENT, OTHER_EVENT
