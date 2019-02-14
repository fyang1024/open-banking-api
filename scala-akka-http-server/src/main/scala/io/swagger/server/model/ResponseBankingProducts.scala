package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingProducts (
  data: ResponseBankingProducts_data,
  links: LinksPaginated,
  meta: MetaPaginated
)

