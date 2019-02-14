package io.swagger.server.model


/**
 * @param country Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
 * @param accountNumber Account Targeted for payment
 * @param bankAddress 
 * @param beneficiaryBankBIC Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
 * @param fedWireNumber Number for Fedwire payment (Federal Reserve Wire Network)
 * @param sortCode Sort code used for account identification in some jurisdictions
 * @param chipNumber Number for the Clearing House Interbank Payments System
 * @param routingNumber International bank routing number
 * @param legalEntityIdentifier The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
 */
case class InternationalPayee_bankDetails (
  country: Option[String],
  accountNumber: Option[String],
  bankAddress: Option[InternationalPayee_bankDetails_bankAddress],
  beneficiaryBankBIC: Option[String],
  fedWireNumber: Option[String],
  sortCode: Option[String],
  chipNumber: Option[String],
  routingNumber: Option[String],
  legalEntityIdentifier: Option[String]
)

