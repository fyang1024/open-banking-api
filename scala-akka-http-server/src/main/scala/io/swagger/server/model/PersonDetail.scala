package io.swagger.server.model


/**
 * @param lastUpdateTime The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
 * @param firstName For people with single names this field need not be present.  The single name should be in the lastName field
 * @param lastName For people with single names the single name should be in this field
 * @param middleNames Field is mandatory but array may be empty
 * @param prefix Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
 * @param suffix Used for a trailing suffix to the name (e.g. Jr)
 * @param occupationCode Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.
 * @param phoneNumbers At least one record is required
 * @param emailAddresses May be empty
 * @param physicalAddresses Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
 */
case class PersonDetail (
  lastUpdateTime: String,
  firstName: Option[String],
  lastName: String,
  middleNames: List[String],
  prefix: Option[String],
  suffix: Option[String],
  occupationCode: Option[String],
  phoneNumbers: List[PhoneNumber],
  emailAddresses: List[EmailAddress],
  physicalAddresses: List[PhysicalAddressWithPurpose]
)

