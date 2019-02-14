package io.swagger.server.model


/**
 * @param name Name of the beneficiary
 * @param country Country where the beneficiary resides. A valid ISO 3166 Alpha-3 country code
 * @param message Response message for the payment
 */
case class InternationalPayee_beneficiaryDetails (
  name: Option[String],
  country: Option[String],
  message: Option[String]
)

