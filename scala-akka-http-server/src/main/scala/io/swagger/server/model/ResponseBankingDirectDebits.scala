package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingDirectDebits (
  data: ResponseBankingDirectDebits_data,
  links: LinksPaginated,
  meta: MetaPaginated
)

