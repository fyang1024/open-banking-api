# InternationalPayeeBankDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | Country of the recipient institution. A valid ISO 3166 Alpha-3 country code |  [optional]
**accountNumber** | **String** | Account Targeted for payment |  [optional]
**bankAddress** | [**InternationalPayeeBankDetailsBankAddress**](InternationalPayeeBankDetailsBankAddress.md) |  |  [optional]
**beneficiaryBankBIC** | **String** | Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html) |  [optional]
**fedWireNumber** | **String** | Number for Fedwire payment (Federal Reserve Wire Network) |  [optional]
**sortCode** | **String** | Sort code used for account identification in some jurisdictions |  [optional]
**chipNumber** | **String** | Number for the Clearing House Interbank Payments System |  [optional]
**routingNumber** | **String** | International bank routing number |  [optional]
**legalEntityIdentifier** | **String** | The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html) |  [optional]
