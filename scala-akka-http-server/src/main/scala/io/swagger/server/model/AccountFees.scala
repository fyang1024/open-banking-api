package io.swagger.server.model


/**
 * @param name Name of the fee
 * @param feeType The type of fee
 * @param amount The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
 * @param balanceRate A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
 * @param transactionRate A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
 * @param currency The currency the fee will be charged in. Assumes AUD if absent
 * @param additionalValue Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
 * @param additionalInfo Display text providing more information on the fee
 * @param additionalInfoUri Link to a web page with more information on this fee
 * @param discounts 
 */
case class AccountFees (
  name: String,
  feeType: String,
  amount: Option[String],
  balanceRate: Option[String],
  transactionRate: Option[String],
  currency: Option[String],
  additionalValue: Option[String],
  additionalInfo: Option[String],
  additionalInfoUri: Option[String],
  discounts: Option[List[AccountDiscounts]]
)

