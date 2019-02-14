# ProductConstraints

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraintType** | [**inline**](#ConstraintTypeEnum) | The type of constraint described.  See the next section for an overview of valid values and their meaning | 
**additionalValue** | [**kotlin.String**](.md) | Generic field containing additional information relevant to the constraintType specified.  Whether mandatory or not is dependent on the value of constraintType |  [optional]

<a name="ConstraintTypeEnum"></a>
## Enum: constraintType
Name | Value
---- | -----
constraintType | MIN_BALANCE, OPENING_BALANCE, MAX_LIMIT, MIN_LIMIT
