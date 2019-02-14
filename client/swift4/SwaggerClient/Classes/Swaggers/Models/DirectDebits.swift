//
// DirectDebits.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct DirectDebits: Codable {


    /** A unique ID of the account adhering to the standards for ID permanence. */
    public var accountId: String

    public var authorisedEntity: AuthorisedEntity?

    /** The date and time of the last debit executed under this authorisation */
    public var lastDebitDateTime: String?

    /** The amount of the last debit executed under this authorisation */
    public var lastDebitAmount: String?
    public init(accountId: String, authorisedEntity: AuthorisedEntity?, lastDebitDateTime: String?, lastDebitAmount: String?) { 
        self.accountId = accountId
        self.authorisedEntity = authorisedEntity
        self.lastDebitDateTime = lastDebitDateTime
        self.lastDebitAmount = lastDebitAmount
    }

}