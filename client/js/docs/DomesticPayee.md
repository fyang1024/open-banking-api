# ConsumerDataStandards.DomesticPayee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payeeAccountUType** | **String** | Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP | 
**account** | [**DomesticPayeeAccount**](DomesticPayeeAccount.md) |  | [optional] 
**card** | [**DomesticPayeeCard**](DomesticPayeeCard.md) |  | [optional] 
**payId** | [**DomesticPayeePayId**](DomesticPayeePayId.md) |  | [optional] 


<a name="PayeeAccountUTypeEnum"></a>
## Enum: PayeeAccountUTypeEnum


* `account` (value: `"account"`)

* `card` (value: `"card"`)

* `payId` (value: `"payId"`)




