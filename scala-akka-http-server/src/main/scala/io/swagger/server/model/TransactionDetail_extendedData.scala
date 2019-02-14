package io.swagger.server.model


/**
 * @param payer Name or description of the originating payer.  Mandatory for inbound payment
 * @param payee Name or description of the target payee. Mandatory for an outbound payment
 * @param extensionUType Optional extended data provided specific to transaction originated via NPP
 * @param extendedDescription An extended string description. Only present if specified by the extensionUType field
 * @param serviceId Identifier of the applicable NPP payment service
 */
case class TransactionDetail_extendedData (
  payer: Option[String],
  payee: Option[String],
  extensionUType: Option[String],
  extendedDescription: Option[String],
  serviceId: Option[String]
)

