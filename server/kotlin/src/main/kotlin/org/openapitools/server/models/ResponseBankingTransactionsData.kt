/**
* Consumer Data Standards
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
*
* OpenAPI spec version: 1-oas3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.Transaction

/**
 * 
 * @param accountId ID of the account for which transactions are provided
 * @param displayName The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
 * @param nickname A customer supplied nick name for the account
 * @param transactions 
 */
data class ResponseBankingTransactionsData (
    val transactions: kotlin.Array<Transaction>,
    /* ID of the account for which transactions are provided */
    val accountId: kotlin.String? = null,
    /* The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type. */
    val displayName: kotlin.String? = null,
    /* A customer supplied nick name for the account */
    val nickname: kotlin.String? = null
) {

}

