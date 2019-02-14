package io.swagger.server.model


/**
 * @param code The code of the error
 * @param title A displayable title of the error type
 * @param detail Detail of the error
 * @param meta Optional additional data for specific error types
 */
case class ErrorList_errors (
  code: Option[String],
  title: Option[String],
  detail: Option[String],
  meta: Option[Object]
)

