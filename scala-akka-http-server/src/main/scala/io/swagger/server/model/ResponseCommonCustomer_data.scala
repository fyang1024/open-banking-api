package io.swagger.server.model


/**
 * @param customerUType The type of customer object that is present
 * @param person 
 * @param organisation 
 */
case class ResponseCommonCustomer_data (
  customerUType: Option[String],
  person: Option[Person],
  organisation: Option[Organisation]
)

