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
 * @param lodgementDate The lodgement date of the original deposit
 * @param maturityDate Maturity date for the term deposit
 * @param maturityAmount Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
 * @param maturityCurrency If absent assumes AUD
 * @param maturityInstructions Current instructions on action to be taken at maturity
 */
data class TermDepositAccount (
    /* The lodgement date of the original deposit */
    val lodgementDate: kotlin.String,
    /* Maturity date for the term deposit */
    val maturityDate: kotlin.String,
    /* Current instructions on action to be taken at maturity */
    val maturityInstructions: TermDepositAccount.MaturityInstructions,
    /* Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated */
    val maturityAmount: kotlin.String? = null,
    /* If absent assumes AUD */
    val maturityCurrency: kotlin.String? = null
) {

    /**
    * Current instructions on action to be taken at maturity
    * Values: rOLLEDOVER,pAIDOUTATMATURITY
    */
    enum class MaturityInstructions(val value: kotlin.String){
    
        rOLLEDOVER("ROLLED_OVER"),
    
        pAIDOUTATMATURITY("PAID_OUT_AT_MATURITY");
    
    }

}

