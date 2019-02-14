package io.swagger.server.model


/**
 * @param minPaymentAmount The minimum payment amount due for the next card payment
 * @param paymentDueAmount The amount due for the next card payment
 * @param paymentCurrency If absent assumes AUD
 * @param paymentDueDate Date that the next payment for the card is due
 */
case class CreditCardAccount (
  minPaymentAmount: String,
  paymentDueAmount: String,
  paymentCurrency: Option[String],
  paymentDueDate: String
)

