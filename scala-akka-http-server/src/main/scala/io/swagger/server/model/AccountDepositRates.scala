package io.swagger.server.model


/**
 * @param depositRateType The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
 * @param rate The rate to be applied
 * @param additionalValue Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
 * @param additionalInfo Display text providing more information on the fee
 * @param additionalInfoUri Link to a web page with more information on this fee
 */
case class AccountDepositRates (
  depositRateType: String,
  rate: String,
  additionalValue: Option[String],
  additionalInfo: Option[String],
  additionalInfoUri: Option[String]
)

