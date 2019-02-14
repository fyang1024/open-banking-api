package io.swagger.server.model


/**
 * @param accountId ID of the account for which transactions are provided
 * @param displayName The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type.
 * @param nickname A customer supplied nick name for the account
 * @param transactions 
 */
case class ResponseBankingTransactions_data (
  accountId: Option[String],
  displayName: Option[String],
  nickname: Option[String],
  transactions: Option[List[Transaction]]
)

