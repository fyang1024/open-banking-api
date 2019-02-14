# PAFAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dpid** | **string** | Unique identifier for an address as defined by Australia Post.  Also known as Delivery Point Identifier | [optional] 
**thoroughfare_number1** | **int** | Thoroughfare number for a property (first number in a property ranged address) | [optional] 
**thoroughfare_number1_suffix** | **string** | Suffix for the thoroughfare number. Only relevant is thoroughfareNumber1 is populated | [optional] 
**thoroughfare_number2** | **int** | Second thoroughfare number (only used if the property has a ranged address eg 23-25) | [optional] 
**thoroughfare_number2_suffix** | **string** | Suffix for the second thoroughfare number. Only relevant is thoroughfareNumber2 is populated | [optional] 
**flat_unit_number** | **string** | Unit number (including suffix, if applicable) | [optional] 
**floor_level_number** | **string** | Floor or level number (including alpha characters) | [optional] 
**lot_number** | **int** | Allotment number for the address | [optional] 
**building_name1** | **string** | Building/Property name 1 | [optional] 
**building_name2** | **string** | Building/Property name 2 | [optional] 
**street_name** | **string** | The name of the street | [optional] 
**street_type** | **string** | The street type. Valid enumeration defined by Australia Post PAF code file | [optional] 
**street_suffix** | **string** | The street type suffix. Valid enumeration defined by Australia Post PAF code file | [optional] 
**postal_delivery_type** | **string** | Postal delivery type. (eg. PO BOX). Valid enumeration defined by Australia Post PAF code file | [optional] 
**postal_delivery_number** | **int** | Postal delivery number if the address is a postal delivery type | [optional] 
**postal_delivery_number_prefix** | **string** | Postal delivery number prefix related to the postal delivery number | [optional] 
**postal_delivery_number_suffix** | **string** | Postal delivery number suffix related to the postal delivery number | [optional] 
**locality_name** | **string** | Full name of locality | 
**postcode** | **string** | Postcode for the locality | 
**state** | **string** | State in which the address belongs. Valid enumeration defined by Australia Post PAF code file | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

