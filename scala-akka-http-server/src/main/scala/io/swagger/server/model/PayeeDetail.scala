package io.swagger.server.model


/**
 * @param payeeId ID of the payee adhering to the rules of ID permanence
 * @param nickname The short display name of the payee as provided by the customer
 * @param description A description of the payee provided by the customer
 * @param `type` The type of payee. DOMESTIC means a registered payee for domestic payments including NPP. INTERNATIONAL means a registered payee for international payments. BILLER means a registered payee for BPAY
 * @param creationDate The date the payee was created by the customer
 * @param payeeUType Type of object included that describes the payee in detail
 * @param domestic 
 * @param biller 
 * @param international 
 */
case class PayeeDetail (
  payeeId: String,
  nickname: String,
  description: Option[String],
  `type`: String,
  creationDate: Option[String],
  payeeUType: String,
  domestic: Option[DomesticPayee],
  biller: Option[BillerPayee],
  international: Option[InternationalPayee]
)

