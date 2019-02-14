//
// ProductsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class ProductsAPI {     /**
     Get Product Detail
     - parameter productId: (path) ID of the specific product requested 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getProductDetail(productId: String, completion: @escaping ((_ data: ResponseBankingProduct?,_ error: Error?) -> Void)) {
        getProductDetailWithRequestBuilder(productId: productId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Product Detail
     - GET /banking/products/{productId}
     - Obtain detailed information on a single product offered openly to the market
     - parameter productId: (path) ID of the specific product requested 

     - returns: RequestBuilder<ResponseBankingProduct> 
     */
    open class func getProductDetailWithRequestBuilder(productId: String) -> RequestBuilder<ResponseBankingProduct> {
        var path = "/banking/products/{productId}"
        let productIdPreEscape = "\(productId)"
        let productIdPostEscape = productIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{productId}", with: productIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path        let parameters: [String:Any]? = nil

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<ResponseBankingProduct>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: )
    }


    /**
     * enum for parameter effective
     */
    public enum Effective_listProducts: String { 
        case current = "CURRENT"
        case future = "FUTURE"
        case all = "ALL"
    }

    /**
     * enum for parameter productCategory
     */
    public enum ProductCategory_listProducts: String { 
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
    /**
     Get Products
     - parameter effective: (query) Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#x27;CURRENT&#x27; (optional)     - parameter updatedSince: (query) Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)     - parameter brand: (query) Filter results based on a specific brand (optional)     - parameter productCategory: (query) Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)     - parameter page: (query) Page of results to request (standard pagination) (optional)     - parameter pageSize: (query) Page size to request. Default is 25 (standard pagination) (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listProducts(effective: Effective_listProducts? = nil, updatedSince: String? = nil, brand: String? = nil, productCategory: ProductCategory_listProducts? = nil, page: Int? = nil, pageSize: Int? = nil, completion: @escaping ((_ data: ResponseBankingProducts?,_ error: Error?) -> Void)) {
        listProductsWithRequestBuilder(effective: effective, updatedSince: updatedSince, brand: brand, productCategory: productCategory, page: page, pageSize: pageSize).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Products
     - GET /banking/products
     - Obtain a list of products that are currently openly offered to the market
     - parameter effective: () Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#x27;CURRENT&#x27; (optional)     - parameter updatedSince: () Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional)     - parameter brand: () Filter results based on a specific brand (optional)     - parameter productCategory: () Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional)     - parameter page: () Page of results to request (standard pagination) (optional)     - parameter pageSize: () Page size to request. Default is 25 (standard pagination) (optional)

     - returns: RequestBuilder<ResponseBankingProducts> 
     */
    open class func listProductsWithRequestBuilder(effective: Effective_listProducts? = nil, updatedSince: String? = nil, brand: String? = nil, productCategory: ProductCategory_listProducts? = nil, page: Int? = nil, pageSize: Int? = nil) -> RequestBuilder<ResponseBankingProducts> {
        let path = "/banking/products"
        let URLString = SwaggerClientAPI.basePath + path        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "effective": effective?.rawValue, 
        ])        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "updated-since": updatedSince, 
        ])        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "brand": brand, 
        ])        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "product-category": productCategory?.rawValue, 
        ])        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "page": page?.encodeToJSON(), 
        ])        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "page-size": pageSize?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<ResponseBankingProducts>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: )
    }

}