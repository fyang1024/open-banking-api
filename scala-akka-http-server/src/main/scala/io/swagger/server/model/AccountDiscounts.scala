package io.swagger.server.model


/**
 * @param description Description of the discount
 * @param discountType The type of discount. See the next section for an overview of valid values and their meaning
 * @param amount Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
 * @param additionalValue Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
 */
case class AccountDiscounts (
  description: String,
  discountType: String,
  amount: String,
  additionalValue: Option[String]
)

