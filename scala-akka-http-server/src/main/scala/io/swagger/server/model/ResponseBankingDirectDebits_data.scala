package io.swagger.server.model


/**
 * @param directDebitAuthorisations The list of authorisations returned
 */
case class ResponseBankingDirectDebits_data (
  directDebitAuthorisations: Option[List[DirectDebits]]
)

