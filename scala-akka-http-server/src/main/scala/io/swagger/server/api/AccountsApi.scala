package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ErrorList
import io.swagger.server.model.RequestAccountIds
import io.swagger.server.model.ResponseBankingAccount
import io.swagger.server.model.ResponseBankingAccounts
import io.swagger.server.model.ResponseBankingAccountsBalances
import io.swagger.server.model.ResponseBankingTransactionDetail
import io.swagger.server.model.ResponseBankingTransactions

class AccountsApi(
    accountsService: AccountsApiService,
    accountsMarshaller: AccountsApiMarshaller
) {
  import accountsMarshaller._

  lazy val route: Route =
    path("banking" / "accounts" / Segment) { (accountId) => 
      get {
        
          
            
              
                
                  accountsService.getAccountDetail(accountId = accountId)
               
             
           
         
       
      }
    } ~
    path("banking" / "accounts" / Segment / "transactions" / Segment) { (accountId, transactionId) => 
      get {
        
          
            
              
                
                  accountsService.getTransactionDetail(accountId = accountId, transactionId = transactionId)
               
             
           
         
       
      }
    } ~
    path("banking" / "accounts" / Segment / "transactions") { (accountId) => 
      get {
        parameters("start-time".as[String].?, "end-time".as[String].?, "min-amount".as[String].?, "max-amount".as[String].?, "text".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (startTime, endTime, minAmount, maxAmount, text, page, pageSize) =>
          
            
              
                
                  accountsService.getTransactions(accountId = accountId, startTime = startTime, endTime = endTime, minAmount = minAmount, maxAmount = maxAmount, text = text, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts") { 
      get {
        parameters("open-status".as[String].?, "is-owned".as[String].?, "product-category".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (openStatus, isOwned, productCategory, page, pageSize) =>
          
            
              
                
                  accountsService.listAccounts(openStatus = openStatus, isOwned = isOwned, productCategory = productCategory, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts" / "balances") { 
      get {
        parameters("open-status".as[String].?, "is-owned".as[String].?, "product-category".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (openStatus, isOwned, productCategory, page, pageSize) =>
          
            
              
                
                  accountsService.listBalancesBulk(openStatus = openStatus, isOwned = isOwned, productCategory = productCategory, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts" / "balances") { 
      post {
        
          
            
              
                entity(as[RequestAccountIds]){ body =>
                  accountsService.listBalancesSpecificAccounts(body = body)
                }
             
           
         
       
      }
    } ~
    path("banking" / "accounts" / "transactions") { 
      get {
        parameters("open-status".as[String].?, "is-owned".as[String].?, "product-category".as[String].?, "start-time".as[String].?, "end-time".as[String].?, "min-amount".as[String].?, "max-amount".as[String].?, "text".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize) =>
          
            
              
                
                  accountsService.listTransactionsBulk(openStatus = openStatus, isOwned = isOwned, productCategory = productCategory, startTime = startTime, endTime = endTime, minAmount = minAmount, maxAmount = maxAmount, text = text, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts" / "transactions") { 
      post {
        parameters("start-time".as[String].?, "end-time".as[String].?, "min-amount".as[String].?, "max-amount".as[String].?, "text".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (startTime, endTime, minAmount, maxAmount, text, page, pageSize) =>
          
            
              
                entity(as[RequestAccountIds]){ body =>
                  accountsService.listTransactionsSpecificAccounts(body = bodystartTime = startTime, endTime = endTime, minAmount = minAmount, maxAmount = maxAmount, text = text, page = page, pageSize = pageSize)
                }
             
           
         
        }
      }
    }
}

trait AccountsApiService {

  def getAccountDetail200(responseResponseBankingAccount: ResponseBankingAccount)(implicit toEntityMarshallerResponseBankingAccount: ToEntityMarshaller[ResponseBankingAccount]): Route =
    complete((200, responseResponseBankingAccount))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingAccount
   */
  def getAccountDetail(accountId: String)
      (implicit toEntityMarshallerResponseBankingAccount: ToEntityMarshaller[ResponseBankingAccount]): Route

  def getTransactionDetail200(responseResponseBankingTransactionDetail: ResponseBankingTransactionDetail)(implicit toEntityMarshallerResponseBankingTransactionDetail: ToEntityMarshaller[ResponseBankingTransactionDetail]): Route =
    complete((200, responseResponseBankingTransactionDetail))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingTransactionDetail
   */
  def getTransactionDetail(accountId: String, transactionId: String)
      (implicit toEntityMarshallerResponseBankingTransactionDetail: ToEntityMarshaller[ResponseBankingTransactionDetail]): Route

  def getTransactions200(responseResponseBankingTransactions: ResponseBankingTransactions)(implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]): Route =
    complete((200, responseResponseBankingTransactions))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingTransactions
   */
  def getTransactions(accountId: String, startTime: Option[String], endTime: Option[String], minAmount: Option[String], maxAmount: Option[String], text: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]): Route

  def listAccounts200(responseResponseBankingAccounts: ResponseBankingAccounts)(implicit toEntityMarshallerResponseBankingAccounts: ToEntityMarshaller[ResponseBankingAccounts]): Route =
    complete((200, responseResponseBankingAccounts))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingAccounts
   */
  def listAccounts(openStatus: Option[String], isOwned: Option[String], productCategory: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingAccounts: ToEntityMarshaller[ResponseBankingAccounts]): Route

  def listBalancesBulk200(responseResponseBankingAccountsBalances: ResponseBankingAccountsBalances)(implicit toEntityMarshallerResponseBankingAccountsBalances: ToEntityMarshaller[ResponseBankingAccountsBalances]): Route =
    complete((200, responseResponseBankingAccountsBalances))
  /**
   * Code: 200, Message: resource listing the financial balances for the account, DataType: ResponseBankingAccountsBalances
   */
  def listBalancesBulk(openStatus: Option[String], isOwned: Option[String], productCategory: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingAccountsBalances: ToEntityMarshaller[ResponseBankingAccountsBalances]): Route

  def listBalancesSpecificAccounts200(responseResponseBankingAccountsBalances: ResponseBankingAccountsBalances)(implicit toEntityMarshallerResponseBankingAccountsBalances: ToEntityMarshaller[ResponseBankingAccountsBalances]): Route =
    complete((200, responseResponseBankingAccountsBalances))
  def listBalancesSpecificAccounts422(responseErrorList: ErrorList)(implicit toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]): Route =
    complete((422, responseErrorList))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingAccountsBalances
   * Code: 422, Message: The request was well formed but was unable to be processed due to business logic specific to the request, DataType: ErrorList
   */
  def listBalancesSpecificAccounts(body: RequestAccountIds)
      (implicit toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList], toEntityMarshallerResponseBankingAccountsBalances: ToEntityMarshaller[ResponseBankingAccountsBalances]): Route

  def listTransactionsBulk200(responseResponseBankingTransactions: ResponseBankingTransactions)(implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]): Route =
    complete((200, responseResponseBankingTransactions))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingTransactions
   */
  def listTransactionsBulk(openStatus: Option[String], isOwned: Option[String], productCategory: Option[String], startTime: Option[String], endTime: Option[String], minAmount: Option[String], maxAmount: Option[String], text: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]): Route

  def listTransactionsSpecificAccounts200(responseResponseBankingTransactions: ResponseBankingTransactions)(implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]): Route =
    complete((200, responseResponseBankingTransactions))
  def listTransactionsSpecificAccounts422(responseErrorList: ErrorList)(implicit toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]): Route =
    complete((422, responseErrorList))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingTransactions
   * Code: 422, Message: The request was well formed but was unable to be processed due to business logic specific to the request, DataType: ErrorList
   */
  def listTransactionsSpecificAccounts(body: RequestAccountIdsstartTime: Option[String], endTime: Option[String], minAmount: Option[String], maxAmount: Option[String], text: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions], toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]): Route

}

trait AccountsApiMarshaller {
  implicit def fromRequestUnmarshallerRequestAccountIds: FromRequestUnmarshaller[RequestAccountIds]


  implicit def toEntityMarshallerResponseBankingAccounts: ToEntityMarshaller[ResponseBankingAccounts]

  implicit def toEntityMarshallerResponseBankingTransactions: ToEntityMarshaller[ResponseBankingTransactions]

  implicit def toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]

  implicit def toEntityMarshallerResponseBankingAccount: ToEntityMarshaller[ResponseBankingAccount]

  implicit def toEntityMarshallerResponseBankingTransactionDetail: ToEntityMarshaller[ResponseBankingTransactionDetail]

  implicit def toEntityMarshallerResponseBankingAccountsBalances: ToEntityMarshaller[ResponseBankingAccountsBalances]

}

