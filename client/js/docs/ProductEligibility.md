# ConsumerDataStandards.ProductEligibility

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligibilityType** | **String** | The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning | 
**additionalValue** | **String** | Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType | [optional] 
**additionalInfo** | **String** | Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER | [optional] 
**additionalInfoUri** | **String** | Link to a web page with more information on this eligibility criteria | [optional] 


<a name="EligibilityTypeEnum"></a>
## Enum: EligibilityTypeEnum


* `BUSINESS` (value: `"BUSINESS"`)

* `PENSION_RECIPIENT` (value: `"PENSION_RECIPIENT"`)

* `MIN_AGE` (value: `"MIN_AGE"`)

* `MAX_AGE` (value: `"MAX_AGE"`)

* `MIN_INCOME` (value: `"MIN_INCOME"`)

* `MIN_TURNOVER` (value: `"MIN_TURNOVER"`)

* `STAFF` (value: `"STAFF"`)

* `STUDENT` (value: `"STUDENT"`)

* `EMPLOYMENT_STATUS` (value: `"EMPLOYMENT_STATUS"`)

* `RESIDENCY_STATUS` (value: `"RESIDENCY_STATUS"`)

* `OTHER` (value: `"OTHER"`)




