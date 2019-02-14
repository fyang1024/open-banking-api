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
 * @param description Description of the discount
 * @param discountType The type of discount. See the next section for an overview of valid values and their meaning
 * @param amount Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
 * @param additionalValue Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
 */
data class ProductDiscounts (
    /* Description of the discount */
    val description: kotlin.String,
    /* The type of discount. See the next section for an overview of valid values and their meaning */
    val discountType: ProductDiscounts.DiscountType,
    /* Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself */
    val amount: kotlin.String,
    /* Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType */
    val additionalValue: kotlin.String? = null
) {

    /**
    * The type of discount. See the next section for an overview of valid values and their meaning
    * Values: bALANCE,dEPOSITS,pAYMENTS,bUNDLE
    */
    enum class DiscountType(val value: kotlin.String){
    
        bALANCE("BALANCE"),
    
        dEPOSITS("DEPOSITS"),
    
        pAYMENTS("PAYMENTS"),
    
        bUNDLE("BUNDLE");
    
    }

}

