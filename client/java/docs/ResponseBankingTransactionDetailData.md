
# ResponseBankingTransactionDetailData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID of the account for which transactions are provided | 
**displayName** | **String** | The display name of the account as defined by the bank.  This should not incorporate account numbers or PANs.  If it does the values should be masked according to the rules of the MaskedAccountString common type. | 
**nickname** | **String** | A customer supplied nick name for the account |  [optional]
**transaction** | [**List&lt;TransactionDetail&gt;**](TransactionDetail.md) |  | 



