//
// Organisation.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct Organisation: Codable {

    public enum OrganisationType: String, Codable { 
        case soleTrader = "SOLE_TRADER"
        case company = "COMPANY"
        case partnership = "PARTNERSHIP"
        case trust = "TRUST"
        case governmentEntity = "GOVERNMENT_ENTITY"
        case other = "OTHER"
    }
    /** The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data */
    public var lastUpdateTime: String

    /** The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field */
    public var agentFirstName: String?

    /** The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field */
    public var agentLastName: String

    /** The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known */
    public var agentRole: String

    /** Name of the organisation */
    public var businessName: String

    /** Legal name, if different to the business name */
    public var legalName: String?

    /** Short name used for communication, if  different to the business name */
    public var shortName: String?

    /** Australian Business Number for the organisation */
    public var abn: String?

    /** Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type */
    public var acn: String?

    /** True if registered with the ACNC.  False if not. Absent or null if not confirmed. */
    public var isACNCRegistered: Bool?

    /** [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation. */
    public var industryCode: String?
    /** Legal organisation type */
    public var organisationType: OrganisationType

    /** Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent */
    public var registeredCountry: String?

    /** The date the organisation described was established */
    public var establishmentDate: String?
    public init(lastUpdateTime: String, agentFirstName: String?, agentLastName: String, agentRole: String, businessName: String, legalName: String?, shortName: String?, abn: String?, acn: String?, isACNCRegistered: Bool?, industryCode: String?, organisationType: OrganisationType, registeredCountry: String?, establishmentDate: String?) { 
        self.lastUpdateTime = lastUpdateTime
        self.agentFirstName = agentFirstName
        self.agentLastName = agentLastName
        self.agentRole = agentRole
        self.businessName = businessName
        self.legalName = legalName
        self.shortName = shortName
        self.abn = abn
        self.acn = acn
        self.isACNCRegistered = isACNCRegistered
        self.industryCode = industryCode
        self.organisationType = organisationType
        self.registeredCountry = registeredCountry
        self.establishmentDate = establishmentDate
    }

}