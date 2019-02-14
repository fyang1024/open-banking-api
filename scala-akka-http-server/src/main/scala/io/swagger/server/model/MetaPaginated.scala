package io.swagger.server.model


/**
 * @param totalRecords The total number of records in the full set
 * @param totalPages The total number of pages in the full set
 */
case class MetaPaginated (
  totalRecords: Option[Int],
  totalPages: Option[Int]
)

