package io.swagger.server.model


/**
 * @param accountId A unique ID of the account adhering to the standards for ID permanence
 * @param transactionId A unique ID of the transaction adhering to the standards for ID permanence. This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
 * @param isDetailAvailable True if extended information is available using the transaction detail end point. False if extended data is not available
 * @param `type` The type of the transaction
 * @param status Status of the transaction whether pending or posted.  Note that there is currently no provision in the standards to gaurantee the ability to correlate a pending transaction with an associated posted transaction
 * @param description The transaction description as applied by the financial institution
 * @param postingDateTime The time the transaction was posted. This field is mandatory if the transaction has status POSTED. This is the time that appears on a standard statement
 * @param valueDateTime Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
 * @param executionDateTime The time the transaction was executed by the originating customer, if available
 * @param amount The value of the transaction. Negative values mean money was outgoing from the account
 * @param currency The currency for the transaction amount. AUD assumed if not present
 * @param reference The reference for the transaction provided by the originating institution.  Empty string if no data provided
 * @param merchantName Name of the merchant for an outgoing payment to a merchant
 * @param merchantCategoryCode The merchant category code (or MCC) for an outgoing payment to a merchant
 * @param billerCode BPay Biller Code for the transaction (if available)
 * @param billerName Name of the BPay biller for the transaction (if available)
 * @param crn BPay CRN for the transaction (if available)
 * @param apcaNumber 6 Digit APCA number for the initiating institution
 * @param extendedData 
 */
case class TransactionDetail (
  accountId: String,
  transactionId: Option[String],
  isDetailAvailable: Boolean,
  `type`: String,
  status: String,
  description: String,
  postingDateTime: Option[String],
  valueDateTime: Option[String],
  executionDateTime: Option[String],
  amount: Option[String],
  currency: Option[String],
  reference: String,
  merchantName: Option[String],
  merchantCategoryCode: Option[String],
  billerCode: Option[String],
  billerName: Option[String],
  crn: Option[String],
  apcaNumber: Option[String],
  extendedData: TransactionDetail_extendedData
)

