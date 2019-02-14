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
package io.swagger.client.models


/**
 * 
 * @param depositRateType The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
 * @param rate The rate to be applied
 * @param additionalValue Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType
 * @param additionalInfo Display text providing more information on the fee
 * @param additionalInfoUri Link to a web page with more information on this fee
 */
data class ProductDepositRates (
    /* The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning */
    val depositRateType: ProductDepositRates.DepositRateType,
    /* The rate to be applied */
    val rate: kotlin.String
,
    /* Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType */
    val additionalValue: kotlin.String? = null,
    /* Display text providing more information on the fee */
    val additionalInfo: kotlin.String? = null,
    /* Link to a web page with more information on this fee */
    val additionalInfoUri: kotlin.String? = null
) {
    /**
    * The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning
    * Values: fIXED,bONUS,bUNDLEBONUS,vARIABLE,iNTRODUCTORY
    */
    enum class DepositRateType(val value: kotlin.String){
        fIXED("FIXED"),
        bONUS("BONUS"),
        bUNDLEBONUS("BUNDLE_BONUS"),
        vARIABLE("VARIABLE"),
        iNTRODUCTORY("INTRODUCTORY");
    }
}