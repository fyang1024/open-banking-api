# ConsumerDataStandards.OrganisationDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTime** | **String** | The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data | 
**agentFirstName** | **String** | The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field | [optional] 
**agentLastName** | **String** | The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field | 
**agentRole** | **String** | The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known | 
**businessName** | **String** | Name of the organisation | 
**legalName** | **String** | Legal name, if different to the business name | [optional] 
**shortName** | **String** | Short name used for communication, if  different to the business name | [optional] 
**abn** | **String** | Australian Business Number for the organisation | [optional] 
**acn** | **String** | Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type | [optional] 
**isACNCRegistered** | **Boolean** | True if registered with the ACNC.  False if not. Absent or null if not confirmed. | [optional] 
**industryCode** | **String** | [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation. | [optional] 
**organisationType** | **String** | Legal organisation type | 
**registeredCountry** | **String** | Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent | [optional] 
**establishmentDate** | **String** | The date the organisation described was established | [optional] 
**physicalAddresses** | [**[PhysicalAddressWithPurpose]**](PhysicalAddressWithPurpose.md) | Must contain at least one address. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail | 


<a name="OrganisationTypeEnum"></a>
## Enum: OrganisationTypeEnum


* `SOLE_TRADER` (value: `"SOLE_TRADER"`)

* `COMPANY` (value: `"COMPANY"`)

* `PARTNERSHIP` (value: `"PARTNERSHIP"`)

* `TRUST` (value: `"TRUST"`)

* `GOVERNMENT_ENTITY` (value: `"GOVERNMENT_ENTITY"`)

* `OTHER` (value: `"OTHER"`)




