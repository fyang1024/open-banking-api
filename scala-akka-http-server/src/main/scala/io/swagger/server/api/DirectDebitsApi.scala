package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ErrorList
import io.swagger.server.model.RequestAccountIds
import io.swagger.server.model.ResponseBankingDirectDebits

class DirectDebitsApi(
    directDebitsService: DirectDebitsApiService,
    directDebitsMarshaller: DirectDebitsApiMarshaller
) {
  import directDebitsMarshaller._

  lazy val route: Route =
    path("banking" / "accounts" / Segment / "direct-debits") { (accountId) => 
      get {
        parameters("page".as[Int].?, "page-size".as[Int].?) { (page, pageSize) =>
          
            
              
                
                  directDebitsService.listDirectDebits(accountId = accountId, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts" / "direct-debits") { 
      get {
        parameters("is-owned".as[String].?, "product-category".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (isOwned, productCategory, page, pageSize) =>
          
            
              
                
                  directDebitsService.listDirectDebitsBulk(isOwned = isOwned, productCategory = productCategory, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    } ~
    path("banking" / "accounts" / "direct-debits") { 
      post {
        
          
            
              
                entity(as[RequestAccountIds]){ body =>
                  directDebitsService.listDirectDebitsSpecificAccounts(body = body)
                }
             
           
         
       
      }
    }
}

trait DirectDebitsApiService {

  def listDirectDebits200(responseResponseBankingDirectDebits: ResponseBankingDirectDebits)(implicit toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route =
    complete((200, responseResponseBankingDirectDebits))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingDirectDebits
   */
  def listDirectDebits(accountId: String, page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route

  def listDirectDebitsBulk200(responseResponseBankingDirectDebits: ResponseBankingDirectDebits)(implicit toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route =
    complete((200, responseResponseBankingDirectDebits))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingDirectDebits
   */
  def listDirectDebitsBulk(isOwned: Option[String], productCategory: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route

  def listDirectDebitsSpecificAccounts200(responseResponseBankingDirectDebits: ResponseBankingDirectDebits)(implicit toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route =
    complete((200, responseResponseBankingDirectDebits))
  def listDirectDebitsSpecificAccounts422(responseErrorList: ErrorList)(implicit toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]): Route =
    complete((422, responseErrorList))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingDirectDebits
   * Code: 422, Message: The request was well formed but was unable to be processed due to business logic specific to the request, DataType: ErrorList
   */
  def listDirectDebitsSpecificAccounts(body: RequestAccountIds)
      (implicit toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList], toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]): Route

}

trait DirectDebitsApiMarshaller {
  implicit def fromRequestUnmarshallerRequestAccountIds: FromRequestUnmarshaller[RequestAccountIds]


  implicit def toEntityMarshallerErrorList: ToEntityMarshaller[ErrorList]

  implicit def toEntityMarshallerResponseBankingDirectDebits: ToEntityMarshaller[ResponseBankingDirectDebits]

}

