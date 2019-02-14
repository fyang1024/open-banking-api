package io.swagger.server.model


/**
 * @param name The name assigned to the PayID by the owner of the PayID
 * @param identifier The identifier of the PayID (dependent on type)
 * @param `type` The type of the PayID
 */
case class DomesticPayeePayId (
  name: Option[String],
  identifier: String,
  `type`: String
)

