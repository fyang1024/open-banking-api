package io.swagger.server.model


/**
 * @param lendingRateType The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
 * @param rate The rate to be applied
 * @param additionalValue Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
 * @param additionalInfo Display text providing more information on the fee.
 * @param additionalInfoUri Link to a web page with more information  on this fee
 */
case class ProductLendingRates (
  lendingRateType: String,
  rate: String,
  additionalValue: Option[String],
  additionalInfo: Option[String],
  additionalInfoUri: Option[String]
)

