# PAFAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dpid** | **String** | Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier |  [optional]
**thoroughfareNumber1** | **Integer** | Thoroughfare number for a property (first number in a property ranged address) |  [optional]
**thoroughfareNumber1Suffix** | **String** | Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated |  [optional]
**thoroughfareNumber2** | **Integer** | Second thoroughfare number (only used if the property has a ranged address eg 23-25) |  [optional]
**thoroughfareNumber2Suffix** | **String** | Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated |  [optional]
**flatUnitNumber** | **String** | Unit number (including suffix, if applicable) |  [optional]
**floorLevelNumber** | **String** | Floor or level number (including alpha characters) |  [optional]
**lotNumber** | **Integer** | Allotment number for the address |  [optional]
**buildingName1** | **String** | Building/Property name 1 |  [optional]
**buildingName2** | **String** | Building/Property name 2 |  [optional]
**streetName** | **String** | The name of the street |  [optional]
**streetType** | **String** | The street type. Valid enumeration defined by Australia Post PAF code file |  [optional]
**streetSuffix** | **String** | The street type suffix. Valid enumeration defined by Australia Post PAF code file |  [optional]
**postalDeliveryType** | **String** | Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file |  [optional]
**postalDeliveryNumber** | **Integer** | Postal delivery number if the address is a postal delivery type |  [optional]
**postalDeliveryNumberPrefix** | **String** | Postal delivery number prefix related to the postal delivery number |  [optional]
**postalDeliveryNumberSuffix** | **String** | Postal delivery number suffix related to the postal delivery number |  [optional]
**localityName** | **String** | Full name of locality | 
**postcode** | **String** | Postcode for the locality | 
**state** | **String** | State in which the address belongs. Valid enumeration defined by Australia Post PAF code file | 
