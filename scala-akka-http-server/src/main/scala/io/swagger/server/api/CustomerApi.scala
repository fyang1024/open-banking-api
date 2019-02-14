package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ResponseCommonCustomer
import io.swagger.server.model.ResponseCommonCustomerDetailed

class CustomerApi(
    customerService: CustomerApiService,
    customerMarshaller: CustomerApiMarshaller
) {
  import customerMarshaller._

  lazy val route: Route =
    path("common" / "customer") { 
      get {
        
          
            
              
                
                  customerService.getCustomer()
               
             
           
         
       
      }
    } ~
    path("common" / "customer" / "detail") { 
      get {
        
          
            
              
                
                  customerService.getCustomerDetail()
               
             
           
         
       
      }
    }
}

trait CustomerApiService {

  def getCustomer200(responseResponseCommonCustomer: ResponseCommonCustomer)(implicit toEntityMarshallerResponseCommonCustomer: ToEntityMarshaller[ResponseCommonCustomer]): Route =
    complete((200, responseResponseCommonCustomer))
  /**
   * Code: 200, Message: Success, DataType: ResponseCommonCustomer
   */
  def getCustomer()
      (implicit toEntityMarshallerResponseCommonCustomer: ToEntityMarshaller[ResponseCommonCustomer]): Route

  def getCustomerDetail200(responseResponseCommonCustomerDetailed: ResponseCommonCustomerDetailed)(implicit toEntityMarshallerResponseCommonCustomerDetailed: ToEntityMarshaller[ResponseCommonCustomerDetailed]): Route =
    complete((200, responseResponseCommonCustomerDetailed))
  /**
   * Code: 200, Message: Success, DataType: ResponseCommonCustomerDetailed
   */
  def getCustomerDetail()
      (implicit toEntityMarshallerResponseCommonCustomerDetailed: ToEntityMarshaller[ResponseCommonCustomerDetailed]): Route

}

trait CustomerApiMarshaller {

  implicit def toEntityMarshallerResponseCommonCustomer: ToEntityMarshaller[ResponseCommonCustomer]

  implicit def toEntityMarshallerResponseCommonCustomerDetailed: ToEntityMarshaller[ResponseCommonCustomerDetailed]

}

