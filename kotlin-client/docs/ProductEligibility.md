# ProductEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligibilityType** | [**inline**](#EligibilityTypeEnum) | The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning | 
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType |  [optional]
**additionalInfo** | [**kotlin.String**](.md) | Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER |  [optional]
**additionalInfoUri** | [**kotlin.String**](.md) | Link to a web page with more information on this eligibility criteria |  [optional]

<a name="EligibilityTypeEnum"></a>
## Enum: eligibilityType
Name | Value
---- | -----
eligibilityType | BUSINESS, PENSION_RECIPIENT, MIN_AGE, MAX_AGE, MIN_INCOME, MIN_TURNOVER, STAFF, STUDENT, EMPLOYMENT_STATUS, RESIDENCY_STATUS, OTHER
