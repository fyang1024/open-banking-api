package io.swagger.server.model


/**
 * @param beneficiaryDetails 
 * @param bankDetails 
 */
case class InternationalPayee (
  beneficiaryDetails: InternationalPayee_beneficiaryDetails,
  bankDetails: InternationalPayee_bankDetails
)

