package io.swagger.server.model


/**
 * @param accountName Name of the account to pay to
 * @param bsb BSB of the account to pay to
 * @param accountNumber Number of the account to pay to
 */
case class DomesticPayeeAccount (
  accountName: String,
  bsb: String,
  accountNumber: String
)

