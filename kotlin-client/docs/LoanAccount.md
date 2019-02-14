# LoanAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originalStartDate** | [**kotlin.String**](.md) | Optional original start date for the loan |  [optional]
**originalLoanAmount** | [**kotlin.String**](.md) | Optional original loan value |  [optional]
**originalLoanCurrency** | [**kotlin.String**](.md) | If absent assumes AUD |  [optional]
**loanEndDate** | [**kotlin.String**](.md) | Date that the loan is due to be repaid in full |  [optional]
**nextInstalmentDate** | [**kotlin.String**](.md) | Next date that an instalment is required |  [optional]
**minInstalmentAmount** | [**kotlin.String**](.md) | Minimum amount of next instalment |  [optional]
**minInstalmentCurrency** | [**kotlin.String**](.md) | If absent assumes AUD |  [optional]
**maxRedraw** | [**kotlin.String**](.md) | Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account |  [optional]
**maxRedrawCurrency** | [**kotlin.String**](.md) | If absent assumes AUD |  [optional]
**minRedraw** | [**kotlin.String**](.md) | Minimum redraw amount |  [optional]
**minRedrawCurrency** | [**kotlin.String**](.md) | If absent assumes AUD |  [optional]
**offsetAccountEnabled** | [**kotlin.Boolean**](.md) | Set to true if one or more offset accounts are configured for this loan account |  [optional]
**offsetAccountIds** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accesses under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation |  [optional]
**repaymentFrequency** | [**kotlin.String**](.md) | The expected or required repayment frequency. Formatted according to ISO 8601 Durations |  [optional]
**repaymentType** | [**inline**](#RepaymentTypeEnum) | Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST |  [optional]

<a name="RepaymentTypeEnum"></a>
## Enum: repaymentType
Name | Value
---- | -----
repaymentType | INTEREST_ONLY, PRINCIPAL_AND_INTEREST
