package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingAccounts (
  data: ResponseBankingAccounts_data,
  links: LinksPaginated,
  meta: MetaPaginated
)

