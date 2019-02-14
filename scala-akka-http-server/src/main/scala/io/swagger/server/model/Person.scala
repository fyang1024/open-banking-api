package io.swagger.server.model


/**
 * @param lastUpdateTime The date and time that this record was last updated by the customer.  If no update has occurred then this date should reflect the initial creation date for the data
 * @param firstName For people with single names this field need not be present.  The single name should be in the lastName field
 * @param lastName For people with single names the single name should be in this field
 * @param middleNames Field is mandatory but array may be empty
 * @param prefix Also known as title or salutation.  The prefix to the name (e.g. Mr, Mrs, Ms, Miss, Sir, etc)
 * @param suffix Used for a trailing suffix to the name (e.g. Jr)
 * @param occupationCode Value is a valid [ANZCO v1.2](http://www.abs.gov.au/ANZSCO) Standard Occupation classification.
 */
case class Person (
  lastUpdateTime: String,
  firstName: Option[String],
  lastName: String,
  middleNames: List[String],
  prefix: Option[String],
  suffix: Option[String],
  occupationCode: Option[String]
)

