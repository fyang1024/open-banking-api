package io.swagger.server.model


/**
 * @param lodgementDate The lodgement date of the original deposit
 * @param maturityDate Maturity date for the term deposit
 * @param maturityAmount Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
 * @param maturityCurrency If absent assumes AUD
 * @param maturityInstructions Current instructions on action to be taken at maturity
 */
case class TermDepositAccount (
  lodgementDate: String,
  maturityDate: String,
  maturityAmount: Option[String],
  maturityCurrency: Option[String],
  maturityInstructions: String
)

