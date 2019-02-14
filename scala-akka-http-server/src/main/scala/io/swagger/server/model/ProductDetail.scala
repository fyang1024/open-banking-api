package io.swagger.server.model


/**
 * @param productId A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
 * @param effectiveFrom The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
 * @param effectiveTo The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
 * @param lastUpdated The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
 * @param productCategory 
 * @param name The display name of the product
 * @param description A description of the product
 * @param brand A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
 * @param brandName An optional display name of the brand
 * @param applicationUri A link to the an application web page where this product can be applied for.
 * @param isTailored Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
 * @param additionalInformation 
 * @param bundles 
 * @param features 
 * @param constraints 
 * @param eligibility 
 * @param fees 
 * @param depositRates 
 * @param lendingRates 
 */
case class ProductDetail (
  productId: String,
  effectiveFrom: Option[String],
  effectiveTo: Option[String],
  lastUpdated: String,
  productCategory: EnumProductCategory,
  name: String,
  description: String,
  brand: String,
  brandName: Option[String],
  applicationUri: Option[String],
  isTailored: Boolean,
  additionalInformation: Option[Product_additionalInformation],
  bundles: Option[List[ProductBundles]],
  features: Option[List[ProductFeatures]],
  constraints: Option[List[ProductConstraints]],
  eligibility: Option[List[ProductEligibility]],
  fees: Option[List[ProductFees]],
  depositRates: Option[List[ProductDepositRates]],
  lendingRates: Option[List[ProductLendingRates]]
)

