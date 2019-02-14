//
// EnumProductCategory.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

/** The list of available product categories for categorising products and accounts */public enum EnumProductCategory: String, Codable {
    case persAtCallDeposits = "PERS_AT_CALL_DEPOSITS"
    case busAtCallDeposits = "BUS_AT_CALL_DEPOSITS"
    case termDeposits = "TERM_DEPOSITS"
    case residentialMortgages = "RESIDENTIAL_MORTGAGES"
    case persCredAndChrgCards = "PERS_CRED_AND_CHRG_CARDS"
    case busCredAndChrgCards = "BUS_CRED_AND_CHRG_CARDS"
    case persLoans = "PERS_LOANS"
    case persLeasing = "PERS_LEASING"
    case busLeasing = "BUS_LEASING"
    case tradeFinance = "TRADE_FINANCE"
    case persOverdraft = "PERS_OVERDRAFT"
    case busOverdraft = "BUS_OVERDRAFT"
    case busLoans = "BUS_LOANS"
    case foreignCurrAtCallDeposits = "FOREIGN_CURR_AT_CALL_DEPOSITS"
    case foreignCurrTermDeposits = "FOREIGN_CURR_TERM_DEPOSITS"
    case foreignCurrLoan = "FOREIGN_CURR_LOAN"
    case foreignCurrrenctOverdraft = "FOREIGN_CURRRENCT_OVERDRAFT"
    case travelCard = "TRAVEL_CARD"
}