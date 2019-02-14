package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingTransactions (
  data: ResponseBankingTransactions_data,
  links: LinksPaginated,
  meta: MetaPaginated
)

