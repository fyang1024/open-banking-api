
# ProductEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligibilityType** | [**EligibilityTypeEnum**](#EligibilityTypeEnum) | The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning | 
**additionalValue** | **String** | Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType |  [optional]
**additionalInfo** | **String** | Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER |  [optional]
**additionalInfoUri** | **String** | Link to a web page with more information on this eligibility criteria |  [optional]


<a name="EligibilityTypeEnum"></a>
## Enum: EligibilityTypeEnum
Name | Value
---- | -----
BUSINESS | &quot;BUSINESS&quot;
PENSION_RECIPIENT | &quot;PENSION_RECIPIENT&quot;
MIN_AGE | &quot;MIN_AGE&quot;
MAX_AGE | &quot;MAX_AGE&quot;
MIN_INCOME | &quot;MIN_INCOME&quot;
MIN_TURNOVER | &quot;MIN_TURNOVER&quot;
STAFF | &quot;STAFF&quot;
STUDENT | &quot;STUDENT&quot;
EMPLOYMENT_STATUS | &quot;EMPLOYMENT_STATUS&quot;
RESIDENCY_STATUS | &quot;RESIDENCY_STATUS&quot;
OTHER | &quot;OTHER&quot;



