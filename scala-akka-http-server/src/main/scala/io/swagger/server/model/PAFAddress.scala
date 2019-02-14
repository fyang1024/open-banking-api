package io.swagger.server.model


/**
 * Australian address formatted according to the file format defined by the [PAF file format](https://auspost.com.au/content/dam/auspost_corp/media/documents/australia-post-data-guide.pdf)
 *
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
case class PAFAddress (
  dpid: Option[String],
  thoroughfareNumber1: Option[Int],
  thoroughfareNumber1Suffix: Option[String],
  thoroughfareNumber2: Option[Int],
  thoroughfareNumber2Suffix: Option[String],
  flatUnitNumber: Option[String],
  floorLevelNumber: Option[String],
  lotNumber: Option[Int],
  buildingName1: Option[String],
  buildingName2: Option[String],
  streetName: Option[String],
  streetType: Option[String],
  streetSuffix: Option[String],
  postalDeliveryType: Option[String],
  postalDeliveryNumber: Option[Int],
  postalDeliveryNumberPrefix: Option[String],
  postalDeliveryNumberSuffix: Option[String],
  localityName: String,
  postcode: String,
  state: String
)

