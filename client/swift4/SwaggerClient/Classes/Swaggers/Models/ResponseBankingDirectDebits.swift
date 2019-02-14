//
// ResponseBankingDirectDebits.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct ResponseBankingDirectDebits: Codable {


    public var data: ResponseBankingDirectDebitsData

    public var links: LinksPaginated

    public var meta: MetaPaginated
    public init(data: ResponseBankingDirectDebitsData, links: LinksPaginated, meta: MetaPaginated) { 
        self.data = data
        self.links = links
        self.meta = meta
    }

}
