
# DomesticPayee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payeeAccountUType** | [**PayeeAccountUTypeEnum**](#PayeeAccountUTypeEnum) | Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP | 
**account** | [**DomesticPayeeAccount**](DomesticPayeeAccount.md) |  |  [optional]
**card** | [**DomesticPayeeCard**](DomesticPayeeCard.md) |  |  [optional]
**payId** | [**DomesticPayeePayId**](DomesticPayeePayId.md) |  |  [optional]


<a name="PayeeAccountUTypeEnum"></a>
## Enum: PayeeAccountUTypeEnum
Name | Value
---- | -----
ACCOUNT | &quot;account&quot;
CARD | &quot;card&quot;
PAYID | &quot;payId&quot;



