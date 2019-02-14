/**
* Consumer Data Standards
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
*
* OpenAPI spec version: 1-oas3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.LinksPaginated
import org.openapitools.server.models.MetaPaginated
import org.openapitools.server.models.ResponseBankingPayeesData

/**
 * 
 * @param &#x60;data&#x60; 
 * @param links 
 * @param meta 
 */
data class ResponseBankingPayees (
    val `data`: ResponseBankingPayeesData,
    val links: LinksPaginated,
    val meta: MetaPaginated
) {

}

