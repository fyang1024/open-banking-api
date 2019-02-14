package io.swagger.server.model


/**
 * @param payees The list of payees returned
 */
case class ResponseBankingPayees_data (
  payees: Option[List[Payee]]
)

