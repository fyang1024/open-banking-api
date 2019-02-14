package io.swagger.server.model


/**
 * @param accountId A unique ID of the account adhering to the standards for ID permanence
 * @param displayName The display name of the account. If a customer provided nickname is available that value should be returned
 * @param nickname A customer supplied nick name for the account
 * @param maskedNumber A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
 * @param openStatus Open or closed status for the account.  If not present then OPEN is assumed
 * @param isOwned Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
 * @param productCategory 
 * @param productName A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
 */
case class Account (
  accountId: String,
  displayName: String,
  nickname: Option[String],
  maskedNumber: String,
  openStatus: Option[String],
  isOwned: Option[Boolean],
  productCategory: EnumProductCategory,
  productName: String
)

