package io.swagger.server.model


/**
 * @param self Fully qualified link to this API call
 * @param first URI to the first page of this set. Mandatory if this response is not the first page
 * @param prev URI to the first previous page of this set. Mandatory if this response is not the first page
 * @param next URI to the first next page of this set. Mandatory if this response is not the last page
 * @param last URI to the first last page of this set. Mandatory if this response is not the last page
 */
case class LinksPaginated (
  self: Option[String],
  first: Option[String],
  prev: Option[String],
  next: Option[String],
  last: Option[String]
)

