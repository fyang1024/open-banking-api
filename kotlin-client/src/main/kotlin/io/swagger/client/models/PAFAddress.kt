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
 * Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)
 * @param dpid Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier
 * @param thoroughfareNumber1 Thoroughfare number for a property (first number in a property ranged address)
 * @param thoroughfareNumber1Suffix Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated
 * @param thoroughfareNumber2 Second thoroughfare number (only used if the property has a ranged address eg 23-25)
 * @param thoroughfareNumber2Suffix Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated
 * @param flatUnitNumber Unit number (including suffix, if applicable)
 * @param floorLevelNumber Floor or level number (including alpha characters)
 * @param lotNumber Allotment number for the address
 * @param buildingName1 Building/Property name 1
 * @param buildingName2 Building/Property name 2
 * @param streetName The name of the street
 * @param streetType The street type. Valid enumeration defined by Australia Post PAF code file
 * @param streetSuffix The street type suffix. Valid enumeration defined by Australia Post PAF code file
 * @param postalDeliveryType Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file
 * @param postalDeliveryNumber Postal delivery number if the address is a postal delivery type
 * @param postalDeliveryNumberPrefix Postal delivery number prefix related to the postal delivery number
 * @param postalDeliveryNumberSuffix Postal delivery number suffix related to the postal delivery number
 * @param localityName Full name of locality
 * @param postcode Postcode for the locality
 * @param state State in which the address belongs. Valid enumeration defined by Australia Post PAF code file
 */
data class PAFAddress (
    /* Full name of locality */
    val localityName: kotlin.String,
    /* Postcode for the locality */
    val postcode: kotlin.String,
    /* State in which the address belongs. Valid enumeration defined by Australia Post PAF code file */
    val state: kotlin.String
,
    /* Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier */
    val dpid: kotlin.String? = null,
    /* Thoroughfare number for a property (first number in a property ranged address) */
    val thoroughfareNumber1: kotlin.Int? = null,
    /* Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated */
    val thoroughfareNumber1Suffix: kotlin.String? = null,
    /* Second thoroughfare number (only used if the property has a ranged address eg 23-25) */
    val thoroughfareNumber2: kotlin.Int? = null,
    /* Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated */
    val thoroughfareNumber2Suffix: kotlin.String? = null,
    /* Unit number (including suffix, if applicable) */
    val flatUnitNumber: kotlin.String? = null,
    /* Floor or level number (including alpha characters) */
    val floorLevelNumber: kotlin.String? = null,
    /* Allotment number for the address */
    val lotNumber: kotlin.Int? = null,
    /* Building/Property name 1 */
    val buildingName1: kotlin.String? = null,
    /* Building/Property name 2 */
    val buildingName2: kotlin.String? = null,
    /* The name of the street */
    val streetName: kotlin.String? = null,
    /* The street type. Valid enumeration defined by Australia Post PAF code file */
    val streetType: kotlin.String? = null,
    /* The street type suffix. Valid enumeration defined by Australia Post PAF code file */
    val streetSuffix: kotlin.String? = null,
    /* Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file */
    val postalDeliveryType: kotlin.String? = null,
    /* Postal delivery number if the address is a postal delivery type */
    val postalDeliveryNumber: kotlin.Int? = null,
    /* Postal delivery number prefix related to the postal delivery number */
    val postalDeliveryNumberPrefix: kotlin.String? = null,
    /* Postal delivery number suffix related to the postal delivery number */
    val postalDeliveryNumberSuffix: kotlin.String? = null
) {
}