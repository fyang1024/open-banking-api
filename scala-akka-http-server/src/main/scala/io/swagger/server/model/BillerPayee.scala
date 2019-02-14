package io.swagger.server.model


/**
 * @param billerCode BPay Biller Code of the Biller
 * @param crn BPay CRN of the Biller. If the contents of the CRN match the format of a Credit Card PAN then it should be masked using the rules applicable for the MaskedPANString common type
 * @param billerName Name of the Biller
 */
case class BillerPayee (
  billerCode: String,
  crn: Option[String],
  billerName: String
)

