//
// AccountDepositRates.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct AccountDepositRates: Codable {

    public enum DepositRateType: String, Codable { 
        case fixed = "FIXED"
        case bonus = "BONUS"
        case bundleBonus = "BUNDLE_BONUS"
        case variable = "VARIABLE"
        case introductory = "INTRODUCTORY"
    }    /** The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning */
    public var depositRateType: DepositRateType

    /** The rate to be applied */
    public var rate: String

    /** Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType */
    public var additionalValue: String?

    /** Display text providing more information on the fee */
    public var additionalInfo: String?

    /** Link to a web page with more information on this fee */
    public var additionalInfoUri: String?
    public init(depositRateType: DepositRateType, rate: String, additionalValue: String?, additionalInfo: String?, additionalInfoUri: String?) { 
        self.depositRateType = depositRateType
        self.rate = rate
        self.additionalValue = additionalValue
        self.additionalInfo = additionalInfo
        self.additionalInfoUri = additionalInfoUri
    }

}
