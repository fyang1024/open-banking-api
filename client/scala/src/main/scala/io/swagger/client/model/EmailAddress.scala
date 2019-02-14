/**
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


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

