package io.swagger.server.model


/**
 * @param originalStartDate Optional original start date for the loan
 * @param originalLoanAmount Optional original loan value
 * @param originalLoanCurrency If absent assumes AUD
 * @param loanEndDate Date that the loan is due to be repaid in full
 * @param nextInstalmentDate Next date that an instalment is required
 * @param minInstalmentAmount Minimum amount of next instalment
 * @param minInstalmentCurrency If absent assumes AUD
 * @param maxRedraw Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
 * @param maxRedrawCurrency If absent assumes AUD
 * @param minRedraw Minimum redraw amount
 * @param minRedrawCurrency If absent assumes AUD
 * @param offsetAccountEnabled Set to true if one or more offset accounts are configured for this loan account
 * @param offsetAccountIds The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
 * @param repaymentFrequency The expected or required repayment frequency. Formatted according to ISO 8601 Durations
 * @param repaymentType Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
 */
case class LoanAccount (
  originalStartDate: Option[String],
  originalLoanAmount: Option[String],
  originalLoanCurrency: Option[String],
  loanEndDate: Option[String],
  nextInstalmentDate: Option[String],
  minInstalmentAmount: Option[String],
  minInstalmentCurrency: Option[String],
  maxRedraw: Option[String],
  maxRedrawCurrency: Option[String],
  minRedraw: Option[String],
  minRedrawCurrency: Option[String],
  offsetAccountEnabled: Option[Boolean],
  offsetAccountIds: Option[List[String]],
  repaymentFrequency: Option[String],
  repaymentType: Option[String]
)

