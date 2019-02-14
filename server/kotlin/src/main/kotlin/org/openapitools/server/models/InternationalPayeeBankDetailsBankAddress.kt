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


/**
 * 
 * @param name Name of the recipient Bank
 * @param address Address of the recipient Bank
 */
data class InternationalPayeeBankDetailsBankAddress (
    /* Name of the recipient Bank */
    val name: kotlin.String,
    /* Address of the recipient Bank */
    val address: kotlin.String
) {

}

