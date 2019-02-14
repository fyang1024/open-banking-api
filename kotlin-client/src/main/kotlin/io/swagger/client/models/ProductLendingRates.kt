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
 * @param lendingRateType The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
 * @param rate The rate to be applied
 * @param additionalValue Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType
 * @param additionalInfo Display text providing more information on the fee.
 * @param additionalInfoUri Link to a web page with more information  on this fee
 */
data class ProductLendingRates (
    /* The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning */
    val lendingRateType: ProductLendingRates.LendingRateType,
    /* The rate to be applied */
    val rate: kotlin.String
,
    /* Information relevant to the lendingRateType specified.  Whether mandatory or not is dependent on the Generic field containing additional information relevant to the lendingRateType specified. Whether mandatory or not is dependent on the value of lendingRateType */
    val additionalValue: kotlin.String? = null,
    /* Display text providing more information on the fee. */
    val additionalInfo: kotlin.String? = null,
    /* Link to a web page with more information  on this fee */
    val additionalInfoUri: kotlin.String? = null
) {
    /**
    * The type of rate (fixed, variable, etc). See the next section for an overview of valid values and their meaning
    * Values: fIXED,iNTRODUCTORY,dISCOUNT,pENALTY,bUNDLEDISCOUNT,fLOATING,mARKETLINKED,cASHADVANCE,vARIABLE,cOMPARISON
    */
    enum class LendingRateType(val value: kotlin.String){
        fIXED("FIXED"),
        iNTRODUCTORY("INTRODUCTORY"),
        dISCOUNT("DISCOUNT"),
        pENALTY("PENALTY"),
        bUNDLEDISCOUNT("BUNDLE_DISCOUNT"),
        fLOATING("FLOATING"),
        mARKETLINKED("MARKET_LINKED"),
        cASHADVANCE("CASH_ADVANCE"),
        vARIABLE("VARIABLE"),
        cOMPARISON("COMPARISON");
    }
}