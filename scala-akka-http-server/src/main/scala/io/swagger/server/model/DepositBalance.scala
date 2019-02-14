package io.swagger.server.model


/**
 * @param currentBalance 
 * @param availableBalance 
 */
case class DepositBalance (
  currentBalance: CurrencyAmount,
  availableBalance: CurrencyAmount
)

