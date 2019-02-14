package io.swagger.server.model


/**
 * @param accountBalance 
 * @param availableBalance 
 * @param creditLimit 
 * @param amortisedLimit 
 */
case class LendingBalance (
  accountBalance: CurrencyAmount,
  availableBalance: CurrencyAmount,
  creditLimit: CurrencyAmount,
  amortisedLimit: Option[CurrencyAmount]
)

