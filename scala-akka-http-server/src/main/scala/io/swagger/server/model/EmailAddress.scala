package io.swagger.server.model


/**
 * @param isPreferred Required for one and only one email record in the collection. Denotes the default email address
 * @param purpose The purpose for the email, as specified by the customer (Enumeration)
 * @param address A correctly formatted email address, as defined by the addr_spec format in RFC_5322
 */
case class EmailAddress (
  isPreferred: Boolean,
  purpose: String,
  address: String
)

