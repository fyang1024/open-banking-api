# InternationalPayeeBankDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**kotlin.String**](.md) | Country of the recipient institution. A valid ISO 3166 Alpha-3 country code |  [optional]
**accountNumber** | [**kotlin.String**](.md) | Account Targeted for payment |  [optional]
**bankAddress** | [**InternationalPayeeBankDetailsBankAddress**](InternationalPayeeBankDetailsBankAddress.md) |  |  [optional]
**beneficiaryBankBIC** | [**kotlin.String**](.md) | Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html) |  [optional]
**fedWireNumber** | [**kotlin.String**](.md) | Number for Fedwire payment (Federal Reserve Wire Network) |  [optional]
**sortCode** | [**kotlin.String**](.md) | Sort code used for account identification in some jurisdictions |  [optional]
**chipNumber** | [**kotlin.String**](.md) | Number for the Clearing House Interbank Payments System |  [optional]
**routingNumber** | [**kotlin.String**](.md) | International bank routing number |  [optional]
**legalEntityIdentifier** | [**kotlin.String**](.md) | The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html) |  [optional]
