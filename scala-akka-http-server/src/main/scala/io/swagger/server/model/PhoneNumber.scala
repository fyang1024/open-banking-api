package io.swagger.server.model


/**
 * @param isPreferred Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present
 * @param purpose The purpose of the number as specified by the customer
 * @param countryCode If absent, assumed to be Australia (+61). The + should be included
 * @param areaCode Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
 * @param number The actual phone number, with leading zeros as appropriate
 * @param extension An extension number (if applicable)
 * @param fullNumber Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
 */
case class PhoneNumber (
  isPreferred: Option[Boolean],
  purpose: String,
  countryCode: Option[String],
  areaCode: Option[String],
  number: String,
  extension: Option[String],
  fullNumber: String
)

