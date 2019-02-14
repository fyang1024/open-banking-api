# PAFAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dpid** | [**kotlin.String**](.md) | Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier |  [optional]
**thoroughfareNumber1** | [**kotlin.Int**](.md) | Thoroughfare number for a property (first number in a property ranged address) |  [optional]
**thoroughfareNumber1Suffix** | [**kotlin.String**](.md) | Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated |  [optional]
**thoroughfareNumber2** | [**kotlin.Int**](.md) | Second thoroughfare number (only used if the property has a ranged address eg 23-25) |  [optional]
**thoroughfareNumber2Suffix** | [**kotlin.String**](.md) | Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated |  [optional]
**flatUnitNumber** | [**kotlin.String**](.md) | Unit number (including suffix, if applicable) |  [optional]
**floorLevelNumber** | [**kotlin.String**](.md) | Floor or level number (including alpha characters) |  [optional]
**lotNumber** | [**kotlin.Int**](.md) | Allotment number for the address |  [optional]
**buildingName1** | [**kotlin.String**](.md) | Building/Property name 1 |  [optional]
**buildingName2** | [**kotlin.String**](.md) | Building/Property name 2 |  [optional]
**streetName** | [**kotlin.String**](.md) | The name of the street |  [optional]
**streetType** | [**kotlin.String**](.md) | The street type. Valid enumeration defined by Australia Post PAF code file |  [optional]
**streetSuffix** | [**kotlin.String**](.md) | The street type suffix. Valid enumeration defined by Australia Post PAF code file |  [optional]
**postalDeliveryType** | [**kotlin.String**](.md) | Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file |  [optional]
**postalDeliveryNumber** | [**kotlin.Int**](.md) | Postal delivery number if the address is a postal delivery type |  [optional]
**postalDeliveryNumberPrefix** | [**kotlin.String**](.md) | Postal delivery number prefix related to the postal delivery number |  [optional]
**postalDeliveryNumberSuffix** | [**kotlin.String**](.md) | Postal delivery number suffix related to the postal delivery number |  [optional]
**localityName** | [**kotlin.String**](.md) | Full name of locality | 
**postcode** | [**kotlin.String**](.md) | Postcode for the locality | 
**state** | [**kotlin.String**](.md) | State in which the address belongs. Valid enumeration defined by Australia Post PAF code file | 
