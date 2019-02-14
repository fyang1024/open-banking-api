# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**kotlin.String**](.md) | A unique ID of the account adhering to the standards for ID permanence | 
**transactionId** | [**kotlin.String**](.md) | A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type |  [optional]
**isDetailAvailable** | [**kotlin.Boolean**](.md) | True if extended information is available using the transaction detail end point. False if extended data is not available | 
**type** | [**inline**](#TypeEnum) | The type of the transaction | 
**status** | [**inline**](#StatusEnum) | Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction | 
**description** | [**kotlin.String**](.md) | The transaction description as applied by the financial institution | 
**postingDateTime** | [**kotlin.String**](.md) | The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement |  [optional]
**valueDateTime** | [**kotlin.String**](.md) | Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry |  [optional]
**executionDateTime** | [**kotlin.String**](.md) | The time the transaction was executed by the originating customer, if available |  [optional]
**amount** | [**kotlin.String**](.md) | The value of the transaction. Negative values mean money was outgoing from the account |  [optional]
**currency** | [**kotlin.String**](.md) | The currency for the transaction amount. AUD assumed if not present |  [optional]
**reference** | [**kotlin.String**](.md) | The reference for the transaction provided by the originating institution.  Empty string if no data provided | 
**merchantName** | [**kotlin.String**](.md) | Name of the merchant for an outgoing payment to a merchant |  [optional]
**merchantCategoryCode** | [**kotlin.String**](.md) | The merchant category code (or MCC) for an outgoing payment to a merchant |  [optional]
**billerCode** | [**kotlin.String**](.md) | BPay Biller Code for the transaction (if available) |  [optional]
**billerName** | [**kotlin.String**](.md) | Name of the BPay biller for the transaction (if available) |  [optional]
**crn** | [**kotlin.String**](.md) | BPay CRN for the transaction (if available) |  [optional]
**apcaNumber** | [**kotlin.String**](.md) | 6 Digit APCA number for the initiating institution |  [optional]

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | FEE, INTEREST_CHARGED, INTEREST_PAID, TRANSFER_OUTGOING, TRANSFER_INCOMING, PAYMENT, OTHER

<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | PENDING, POSTED
