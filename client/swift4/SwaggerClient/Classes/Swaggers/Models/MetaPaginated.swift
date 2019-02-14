//
// MetaPaginated.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct MetaPaginated: Codable {


    /** The total number of records in the full set */
    public var totalRecords: Int?

    /** The total number of pages in the full set */
    public var totalPages: Int?
    public init(totalRecords: Int?, totalPages: Int?) { 
        self.totalRecords = totalRecords
        self.totalPages = totalPages
    }

}
