package io.swagger.server.model


/**
 * @param mailingName Name of the individual or business formatted for inclusion in an address used for physical mail
 * @param addressLine1 First line of the standard address object
 * @param addressLine2 Second line of the standard address object
 * @param addressLine3 Third line of the standard address object
 * @param postcode Mandatory for Australian addresses
 * @param city Name of the city or locality
 * @param state Free text if the country is not Australia. If country is Australia then must be one of the values defined by the ISO 3166:AU standard
 * @param country A valid ISO 3166 Alpha-3 country code
 */
case class SimpleAddress (
  mailingName: Option[String],
  addressLine1: String,
  addressLine2: Option[String],
  addressLine3: Option[String],
  postcode: Option[String],
  city: String,
  state: String,
  country: Option[String]
)

