package io.swagger.server.model


/**
 * @param constraintType The type of constraint described.  See the next section for an overview of valid values and their meaning
 * @param additionalValue Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType
 */
case class ProductConstraints (
  constraintType: String,
  additionalValue: Option[String]
)

