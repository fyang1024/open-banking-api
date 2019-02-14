package io.swagger.server.model


/**
 * @param accountId A unique ID of the account adhering to the standards for ID permanence
 * @param balanceUType The type of balance object provided for the account
 * @param deposit 
 * @param lending 
 * @param purses 
 */
case class Balance (
  accountId: String,
  balanceUType: String,
  deposit: Option[DepositBalance],
  lending: Option[LendingBalance],
  purses: Option[List[CurrencyAmount]]
)

