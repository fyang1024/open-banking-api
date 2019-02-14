package io.swagger.server.model


/**
 * @param name Name of the bundle
 * @param description Description of the bundle
 * @param additionalInfoUri Link to a web page with more information on the bundle criteria and benefits
 * @param productIds Array of product IDs for products included in the bundle
 */
case class ProductBundles (
  name: String,
  description: String,
  additionalInfoUri: Option[String],
  productIds: List[String]
)

