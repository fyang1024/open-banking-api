package io.swagger.server.model


/**
 * @param eligibilityType The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
 * @param additionalValue Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType
 * @param additionalInfo Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER
 * @param additionalInfoUri Link to a web page with more information on this eligibility criteria
 */
case class ProductEligibility (
  eligibilityType: String,
  additionalValue: Option[String],
  additionalInfo: Option[String],
  additionalInfoUri: Option[String]
)

