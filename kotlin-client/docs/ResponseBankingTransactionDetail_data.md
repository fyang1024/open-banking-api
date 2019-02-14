# ResponseBankingTransactionDetailData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**kotlin.String**](.md) | ID of the account for which transactions are provided |  [optional]
**displayName** | [**kotlin.String**](.md) | The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type. |  [optional]
**nickname** | [**kotlin.String**](.md) | A customer supplied nick name for the account |  [optional]
**transaction** | [**kotlin.Array&lt;TransactionDetail&gt;**](TransactionDetail.md) |  |  [optional]
