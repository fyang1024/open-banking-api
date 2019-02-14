package io.swagger.server.model


/**
 * @param data 
 * @param links 
 * @param meta 
 */
case class ResponseBankingAccount (
  data: AccountDetail,
  links: Links,
  meta: Meta
)

