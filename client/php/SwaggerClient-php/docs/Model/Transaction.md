# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **string** | A unique ID of the account adhering to the standards for ID permanence | 
**transaction_id** | **string** | A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type | [optional] 
**is_detail_available** | **bool** | True if extended information is available using the transaction detail end point. False if extended data is not available | 
**type** | **string** | The type of the transaction | 
**status** | **string** | Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction | 
**description** | **string** | The transaction description as applied by the financial institution | 
**posting_date_time** | **string** | The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement | [optional] 
**value_date_time** | **string** | Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry | [optional] 
**execution_date_time** | **string** | The time the transaction was executed by the originating customer, if available | [optional] 
**amount** | **string** | The value of the transaction. Negative values mean money was outgoing from the account | [optional] 
**currency** | **string** | The currency for the transaction amount. AUD assumed if not present | [optional] 
**reference** | **string** | The reference for the transaction provided by the originating institution.  Empty string if no data provided | 
**merchant_name** | **string** | Name of the merchant for an outgoing payment to a merchant | [optional] 
**merchant_category_code** | **string** | The merchant category code (or MCC) for an outgoing payment to a merchant | [optional] 
**biller_code** | **string** | BPay Biller Code for the transaction (if available) | [optional] 
**biller_name** | **string** | Name of the BPay biller for the transaction (if available) | [optional] 
**crn** | **string** | BPay CRN for the transaction (if available) | [optional] 
**apca_number** | **string** | 6 Digit APCA number for the initiating institution | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

