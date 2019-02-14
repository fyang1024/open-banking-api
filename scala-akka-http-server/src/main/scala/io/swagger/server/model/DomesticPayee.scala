package io.swagger.server.model


/**
 * @param payeeAccountUType Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
 * @param account 
 * @param card 
 * @param payId 
 */
case class DomesticPayee (
  payeeAccountUType: String,
  account: Option[DomesticPayeeAccount],
  card: Option[DomesticPayeeCard],
  payId: Option[DomesticPayeePayId]
)

