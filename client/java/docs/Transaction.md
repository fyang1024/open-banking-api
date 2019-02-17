
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique ID of the account adhering to the standards for ID permanence | 
**transactionId** | **String** | A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type |  [optional]
**isDetailAvailable** | **Boolean** | True if extended information is available using the transaction detail end point. False if extended data is not available | 
**type** | [**TypeEnum**](#TypeEnum) | The type of the transaction | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction | 
**description** | **String** | The transaction description as applied by the financial institution | 
**postingDateTime** | **String** | The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement |  [optional]
**valueDateTime** | **String** | Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry |  [optional]
**executionDateTime** | **String** | The time the transaction was executed by the originating customer, if available |  [optional]
**amount** | **String** | The value of the transaction. Negative values mean money was outgoing from the account |  [optional]
**currency** | **String** | The currency for the transaction amount. AUD assumed if not present |  [optional]
**reference** | **String** | The reference for the transaction provided by the originating institution.  Empty string if no data provided | 
**merchantName** | **String** | Name of the merchant for an outgoing payment to a merchant |  [optional]
**merchantCategoryCode** | **String** | The merchant category code (or MCC) for an outgoing payment to a merchant |  [optional]
**billerCode** | **String** | BPay Biller Code for the transaction (if available) |  [optional]
**billerName** | **String** | Name of the BPay biller for the transaction (if available) |  [optional]
**crn** | **String** | BPay CRN for the transaction (if available) |  [optional]
**apcaNumber** | **String** | 6 Digit APCA number for the initiating institution |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FEE | &quot;FEE&quot;
INTEREST_CHARGED | &quot;INTEREST_CHARGED&quot;
INTEREST_PAID | &quot;INTEREST_PAID&quot;
TRANSFER_OUTGOING | &quot;TRANSFER_OUTGOING&quot;
TRANSFER_INCOMING | &quot;TRANSFER_INCOMING&quot;
PAYMENT | &quot;PAYMENT&quot;
OTHER | &quot;OTHER&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
POSTED | &quot;POSTED&quot;



