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

package io.swagger.client.model


/**
 * @param accountId ID of the account for which transactions are provided
 * @param displayName The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
 * @param nickname A customer supplied nick name for the account
 * @param transaction 
 */
case class ResponseBankingTransactionDetailData (
  accountId: Option[String],
  displayName: Option[String],
  nickname: Option[String],
  transaction: Option[List[TransactionDetail]]
)
