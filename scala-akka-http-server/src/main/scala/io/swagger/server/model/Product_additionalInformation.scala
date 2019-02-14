package io.swagger.server.model


/**
 * @param overviewUri General overview of the product
 * @param termsUri Terms and conditions for the product
 * @param eligibilityUri Eligibility rules and criteria for the product
 * @param feesAndPricingUri Description of fees, pricing, discounts, exemptions and bonuses for the product
 * @param bundleUri Description of a bundle that this product can be part of
 */
case class Product_additionalInformation (
  overviewUri: Option[String],
  termsUri: Option[String],
  eligibilityUri: Option[String],
  feesAndPricingUri: Option[String],
  bundleUri: Option[String]
)

