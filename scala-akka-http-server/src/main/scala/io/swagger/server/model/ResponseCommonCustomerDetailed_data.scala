package io.swagger.server.model


/**
 * @param customerUType The type of customer object that is present
 * @param person 
 * @param organisation 
 */
case class ResponseCommonCustomerDetailed_data (
  customerUType: Option[String],
  person: Option[PersonDetail],
  organisation: Option[OrganisationDetail]
)

