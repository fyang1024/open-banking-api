/**
* Consumer Data Standards
* API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
*
* OpenAPI spec version: 1-oas3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.*
import io.ktor.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method
import org.openapitools.server.models.*


// NOTE: ktor-location@0.9.0 is missing extension for Route.delete. This includes it.
inline fun <reified T : Any> Route.delete(noinline body: suspend PipelineContext<Unit, ApplicationCall>.(T) -> Unit): Route {
    return location(T::class) {
        method(HttpMethod.Delete) {
            handle(body)
        }
    }
}

object Paths {
    /**
     * Get Account Detail
     * Obtain detailed information on a single account
     * @param accountId A tokenised identifier for the account which is unique but not shareable 
     */
    @Location("/banking/accounts/{accountId}") class getAccountDetail(val accountId: kotlin.String)

    /**
     * Get Transaction Detail
     * Obtain detailed information on a transaction for a specific account
     * @param accountId The account id token that is used to uniquely represent the account 
     * @param transactionId The unique identifier for the specific transaction for which details are being requested 
     */
    @Location("/banking/accounts/{accountId}/transactions/{transactionId}") class getTransactionDetail(val accountId: kotlin.String, val transactionId: kotlin.String)

    /**
     * Get Transactions For Account
     * Obtain transactions for a specific account
     * @param accountId ID of the account to get transactions for.  Must have previously been returned by one of the account list end points. 
     * @param startTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type (optional, default to null)
     * @param endTime Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type (optional, default to null)
     * @param minAmount Filter transactions to only transactions with amounts higher or equal to than this amount (optional, default to null)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to than this amount (optional, default to null)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts/{accountId}/transactions") class getTransactions(val accountId: kotlin.String, val startTime: kotlin.String, val endTime: kotlin.String, val minAmount: kotlin.String, val maxAmount: kotlin.String, val text: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Accounts
     * Obtain a list of accounts
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer (optional, default to ALL)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts") class listAccounts(val openStatus: kotlin.String, val isOwned: kotlin.String, val productCategory: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Bulk Balances
     * Obtain balances for multiple, filtered accounts
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer (optional, default to ALL)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts/balances") class listBalancesBulk(val openStatus: kotlin.String, val isOwned: kotlin.String, val productCategory: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Transactions For Multiple Accounts
     * Obtain transactions for multiple, filtered accounts
     * @param openStatus Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed (optional, default to ALL)
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer (optional, default to ALL)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional, default to null)
     * @param startTime Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type (optional, default to null)
     * @param endTime Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type (optional, default to null)
     * @param minAmount Filter transactions to only transactions with amounts higher or equal to than this amount (optional, default to null)
     * @param maxAmount Filter transactions to only transactions with amounts less than or equal to than this amount (optional, default to null)
     * @param text Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts/transactions") class listTransactionsBulk(val openStatus: kotlin.String, val isOwned: kotlin.String, val productCategory: kotlin.String, val startTime: kotlin.String, val endTime: kotlin.String, val minAmount: kotlin.String, val maxAmount: kotlin.String, val text: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Customer
     * Obtain basic information on the customer that has authorised the current session
     */
    @Location("/common/customer") class getCustomer()

    /**
     * Get Customer Detail
     * Obtain detailed information on the authorised customer within the current session.
     */
    @Location("/common/customer/detail") class getCustomerDetail()

    /**
     * Get Direct Debits For Account
     * Obtain direct debit authorisations for a specific account
     * @param accountId ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points. 
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts/{accountId}/direct-debits") class listDirectDebits(val accountId: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Bulk Direct Debits
     * Obtain direct debit authorisations for multiple, filtered accounts
     * @param isOwned Filters accounts based on whether they are owned by the authorised customer (optional, default to ALL)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/accounts/direct-debits") class listDirectDebitsBulk(val isOwned: kotlin.String, val productCategory: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Payee Detail
     * Obtain detailed information on a single payee
     * @param payeeId The ID used to locate the details of a particular payee 
     */
    @Location("/banking/payees/{payeeId}") class getPayeeDetail(val payeeId: kotlin.String)

    /**
     * Get Payees
     * Obtain a list of pre-registered payees
     * @param type Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL (optional, default to ALL)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/payees") class listPayees(val type: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

    /**
     * Get Product Detail
     * Obtain detailed information on a single product offered openly to the market
     * @param productId ID of the specific product requested 
     */
    @Location("/banking/products/{productId}") class getProductDetail(val productId: kotlin.String)

    /**
     * Get Products
     * Obtain a list of products that are currently openly offered to the market
     * @param effective Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to &#39;CURRENT&#39; (optional, default to CURRENT)
     * @param updatedSince Only include products that have been updated after the specified date and time. If absent defaults to include all products (optional, default to null)
     * @param brand Filter results based on a specific brand (optional, default to null)
     * @param productCategory Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned. (optional, default to null)
     * @param page Page of results to request (standard pagination) (optional, default to 1)
     * @param pageSize Page size to request. Default is 25 (standard pagination) (optional, default to 25)
     */
    @Location("/banking/products") class listProducts(val effective: kotlin.String, val updatedSince: kotlin.String, val brand: kotlin.String, val productCategory: kotlin.String, val page: kotlin.Int, val pageSize: kotlin.Int)

}
