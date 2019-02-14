package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingPayees (
  data: ResponseBankingPayees_data,
  links: LinksPaginated,
  meta: MetaPaginated
)

