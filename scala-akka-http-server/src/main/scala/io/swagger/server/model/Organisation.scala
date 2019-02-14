package io.swagger.server.model


/**
 * @param lastUpdateTime The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
 * @param agentFirstName The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
 * @param agentLastName The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
 * @param agentRole The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
 * @param businessName Name of the organisation
 * @param legalName Legal name, if different to the business name
 * @param shortName Short name used for communication, if  different to the business name
 * @param abn Australian Business Number for the organisation
 * @param acn Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
 * @param isACNCRegistered True if registered with the ACNC.  False if not. Absent or null if not confirmed.
 * @param industryCode [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
 * @param organisationType Legal organisation type
 * @param registeredCountry Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
 * @param establishmentDate The date the organisation described was established
 */
case class Organisation (
  lastUpdateTime: String,
  agentFirstName: Option[String],
  agentLastName: String,
  agentRole: String,
  businessName: String,
  legalName: Option[String],
  shortName: Option[String],
  abn: Option[String],
  acn: Option[String],
  isACNCRegistered: Option[Boolean],
  industryCode: Option[String],
  organisationType: String,
  registeredCountry: Option[String],
  establishmentDate: Option[String]
)

