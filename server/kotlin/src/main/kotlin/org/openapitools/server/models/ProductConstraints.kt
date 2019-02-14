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
 * @param constraintType The type of constraint described.  See the next section for an overview of valid values and their meaning
 * @param additionalValue Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType
 */
data class ProductConstraints (
    /* The type of constraint described.  See the next section for an overview of valid values and their meaning */
    val constraintType: ProductConstraints.ConstraintType,
    /* Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType */
    val additionalValue: kotlin.String? = null
) {

    /**
    * The type of constraint described.  See the next section for an overview of valid values and their meaning
    * Values: mINBALANCE,oPENINGBALANCE,mAXLIMIT,mINLIMIT
    */
    enum class ConstraintType(val value: kotlin.String){
    
        mINBALANCE("MIN_BALANCE"),
    
        oPENINGBALANCE("OPENING_BALANCE"),
    
        mAXLIMIT("MAX_LIMIT"),
    
        mINLIMIT("MIN_LIMIT");
    
    }

}

