package io.swagger.server.model


/**
 * @param amount The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking
 * @param currency If not present assumes AUD
 */
case class CurrencyAmount (
  amount: String,
  currency: Option[String]
)

