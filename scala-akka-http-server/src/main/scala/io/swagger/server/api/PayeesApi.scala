package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ResponseBankingPayeeDetails
import io.swagger.server.model.ResponseBankingPayees

class PayeesApi(
    payeesService: PayeesApiService,
    payeesMarshaller: PayeesApiMarshaller
) {
  import payeesMarshaller._

  lazy val route: Route =
    path("banking" / "payees" / Segment) { (payeeId) => 
      get {
        
          
            
              
                
                  payeesService.getPayeeDetail(payeeId = payeeId)
               
             
           
         
       
      }
    } ~
    path("banking" / "payees") { 
      get {
        parameters("type".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (`type`, page, pageSize) =>
          
            
              
                
                  payeesService.listPayees(`type` = `type`, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    }
}

trait PayeesApiService {

  def getPayeeDetail200(responseResponseBankingPayeeDetails: ResponseBankingPayeeDetails)(implicit toEntityMarshallerResponseBankingPayeeDetails: ToEntityMarshaller[ResponseBankingPayeeDetails]): Route =
    complete((200, responseResponseBankingPayeeDetails))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingPayeeDetails
   */
  def getPayeeDetail(payeeId: String)
      (implicit toEntityMarshallerResponseBankingPayeeDetails: ToEntityMarshaller[ResponseBankingPayeeDetails]): Route

  def listPayees200(responseResponseBankingPayees: ResponseBankingPayees)(implicit toEntityMarshallerResponseBankingPayees: ToEntityMarshaller[ResponseBankingPayees]): Route =
    complete((200, responseResponseBankingPayees))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingPayees
   */
  def listPayees(`type`: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingPayees: ToEntityMarshaller[ResponseBankingPayees]): Route

}

trait PayeesApiMarshaller {

  implicit def toEntityMarshallerResponseBankingPayees: ToEntityMarshaller[ResponseBankingPayees]

  implicit def toEntityMarshallerResponseBankingPayeeDetails: ToEntityMarshaller[ResponseBankingPayeeDetails]

}

