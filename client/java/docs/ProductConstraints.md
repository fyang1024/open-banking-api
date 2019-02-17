
# ProductConstraints

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraintType** | [**ConstraintTypeEnum**](#ConstraintTypeEnum) | The type of constraint described.  See the next section for an overview of valid values and their meaning | 
**additionalValue** | **String** | Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType |  [optional]


<a name="ConstraintTypeEnum"></a>
## Enum: ConstraintTypeEnum
Name | Value
---- | -----
MIN_BALANCE | &quot;MIN_BALANCE&quot;
OPENING_BALANCE | &quot;OPENING_BALANCE&quot;
MAX_LIMIT | &quot;MAX_LIMIT&quot;
MIN_LIMIT | &quot;MIN_LIMIT&quot;



