package io.swagger.server.model


/**
 * @param featureType The type of feature described
 * @param additionalValue Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType
 */
case class AccountFeatures (
  featureType: String,
  additionalValue: Option[String]
)

