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

import org.openapitools.server.models.PAFAddress
import org.openapitools.server.models.SimpleAddress

/**
 * 
 * @param addressUType The type of address object present
 * @param simple 
 * @param paf 
 */
data class PhysicalAddress (
    /* The type of address object present */
    val addressUType: PhysicalAddress.AddressUType,
    val simple: SimpleAddress? = null,
    val paf: PAFAddress? = null
) {

    /**
    * The type of address object present
    * Values: simple,paf
    */
    enum class AddressUType(val value: kotlin.String){
    
        simple("simple"),
    
        paf("paf");
    
    }

}

