package io.swagger.server.model


/**
 * @param accountId A unique ID of the account adhering to the standards for ID permanence.
 * @param authorisedEntity 
 * @param lastDebitDateTime The date and time of the last debit executed under this authorisation
 * @param lastDebitAmount The amount of the last debit executed under this authorisation
 */
case class DirectDebits (
  accountId: String,
  authorisedEntity: Option[AuthorisedEntity],
  lastDebitDateTime: Option[String],
  lastDebitAmount: Option[String]
)

