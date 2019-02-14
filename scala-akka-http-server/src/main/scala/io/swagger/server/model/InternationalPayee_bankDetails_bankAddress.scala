package io.swagger.server.model


/**
 * @param name Name of the recipient Bank
 * @param address Address of the recipient Bank
 */
case class InternationalPayee_bankDetails_bankAddress (
  name: Option[String],
  address: Option[String]
)

