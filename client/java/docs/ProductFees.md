# ProductFees

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the fee | 
**feeType** | [**FeeTypeEnum**](#FeeTypeEnum) | The type of fee | 
**amount** | **String** | The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**balanceRate** | **String** | A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**transactionRate** | **String** | A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory |  [optional]
**currency** | **String** | The currency the fee will be charged in. Assumes AUD if absent |  [optional]
**additionalValue** | **String** | Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType |  [optional]
**additionalInfo** | **String** | Display text providing more information on the fee |  [optional]
**additionalInfoUri** | **String** | Link to a web page with more information on this fee |  [optional]
**discounts** | [**List&lt;ProductDiscounts&gt;**](ProductDiscounts.md) |  |  [optional]

<a name="FeeTypeEnum"></a>
## Enum: FeeTypeEnum
Name | Value
---- | -----
PERIODIC | &quot;PERIODIC&quot;
TRANSACTION | &quot;TRANSACTION&quot;
ESTABLISHMENT | &quot;ESTABLISHMENT&quot;
EXIT | &quot;EXIT&quot;
OVERDRAW | &quot;OVERDRAW&quot;
MIN_BALANCE | &quot;MIN_BALANCE&quot;
REDRAW | &quot;REDRAW&quot;
CHEQUE_CASH | &quot;CHEQUE_CASH&quot;
CHEQUE_STOP | &quot;CHEQUE_STOP&quot;
CHEQUE_BOOK | &quot;CHEQUE_BOOK&quot;
CARD_REPLACE | &quot;CARD_REPLACE&quot;
PAPER_STATEMENT | &quot;PAPER_STATEMENT&quot;
OTHER_EVENT | &quot;OTHER_EVENT&quot;
