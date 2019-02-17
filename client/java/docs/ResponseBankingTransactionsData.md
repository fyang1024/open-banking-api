
# ResponseBankingTransactionsData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account for which transactions are provided |  [optional]
**displayName** | **String** | The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type. |  [optional]
**nickname** | **String** | A customer supplied nick name for the account |  [optional]
**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) |  | 



