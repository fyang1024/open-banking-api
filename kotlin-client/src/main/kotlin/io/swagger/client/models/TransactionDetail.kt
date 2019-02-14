/**
* Consumer Data Standards
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
*
* OpenAPI spec version: 1-oas3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.Transaction
import io.swagger.client.models.TransactionDetailExtendedData

/**
 * 
 * @param extendedData 
 */
data class TransactionDetail (
    val extendedData: TransactionDetailExtendedData,
    /* A unique ID of the account adhering to the standards for ID permanence */
    val accountId: kotlin.String,
    /* True if extended information is available using the transaction detail end point. False if extended data is not available */
    val isDetailAvailable: kotlin.Boolean,
    /* The type of the transaction */
    val type: TransactionDetail.Type,
    /* Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction */
    val status: TransactionDetail.Status,
    /* The transaction description as applied by the financial institution */
    val description: kotlin.String,
    /* The reference for the transaction provided by the originating institution.  Empty string if no data provided */
    val reference: kotlin.String
,
    /* A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type */
    val transactionId: kotlin.String? = null,
    /* The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement */
    val postingDateTime: kotlin.String? = null,
    /* Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry */
    val valueDateTime: kotlin.String? = null,
    /* The time the transaction was executed by the originating customer, if available */
    val executionDateTime: kotlin.String? = null,
    /* The value of the transaction. Negative values mean money was outgoing from the account */
    val amount: kotlin.String? = null,
    /* The currency for the transaction amount. AUD assumed if not present */
    val currency: kotlin.String? = null,
    /* Name of the merchant for an outgoing payment to a merchant */
    val merchantName: kotlin.String? = null,
    /* The merchant category code (or MCC) for an outgoing payment to a merchant */
    val merchantCategoryCode: kotlin.String? = null,
    /* BPay Biller Code for the transaction (if available) */
    val billerCode: kotlin.String? = null,
    /* Name of the BPay biller for the transaction (if available) */
    val billerName: kotlin.String? = null,
    /* BPay CRN for the transaction (if available) */
    val crn: kotlin.String? = null,
    /* 6 Digit APCA number for the initiating institution */
    val apcaNumber: kotlin.String? = null
) {
}