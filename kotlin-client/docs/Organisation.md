# Organisation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastUpdateTime** | [**kotlin.String**](.md) | The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data | 
**agentFirstName** | [**kotlin.String**](.md) | The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field |  [optional]
**agentLastName** | [**kotlin.String**](.md) | The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field | 
**agentRole** | [**kotlin.String**](.md) | The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known | 
**businessName** | [**kotlin.String**](.md) | Name of the organisation | 
**legalName** | [**kotlin.String**](.md) | Legal name, if different to the business name |  [optional]
**shortName** | [**kotlin.String**](.md) | Short name used for communication, if  different to the business name |  [optional]
**abn** | [**kotlin.String**](.md) | Australian Business Number for the organisation |  [optional]
**acn** | [**kotlin.String**](.md) | Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type |  [optional]
**isACNCRegistered** | [**kotlin.Boolean**](.md) | True if registered with the ACNC.  False if not. Absent or null if not confirmed. |  [optional]
**industryCode** | [**kotlin.String**](.md) | [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation. |  [optional]
**organisationType** | [**inline**](#OrganisationTypeEnum) | Legal organisation type | 
**registeredCountry** | [**kotlin.String**](.md) | Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent |  [optional]
**establishmentDate** | [**kotlin.String**](.md) | The date the organisation described was established |  [optional]

<a name="OrganisationTypeEnum"></a>
## Enum: organisationType
Name | Value
---- | -----
organisationType | SOLE_TRADER, COMPANY, PARTNERSHIP, TRUST, GOVERNMENT_ENTITY, OTHER
