package io.swagger.server.model


/**
 * @param name Name of the authorised entity
 * @param financialInstitution Name of the financial institution through which the direct debit will be executed
 * @param abn Australian Business Number for the authorised entity
 * @param acn Australian Business Number for the authorised entity
 * @param arbn Australian Registered Body Number for the authorised entity
 */
case class AuthorisedEntity (
  name: String,
  financialInstitution: String,
  abn: Option[String],
  acn: Option[String],
  arbn: Option[String]
)

