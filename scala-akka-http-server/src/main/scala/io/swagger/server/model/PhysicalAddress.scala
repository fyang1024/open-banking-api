package io.swagger.server.model


/**
 * @param addressUType The type of address object present
 * @param simple 
 * @param paf 
 */
case class PhysicalAddress (
  addressUType: String,
  simple: Option[SimpleAddress],
  paf: Option[PAFAddress]
)

