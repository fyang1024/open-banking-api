package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.ResponseBankingProduct
import io.swagger.server.model.ResponseBankingProducts

class ProductsApi(
    productsService: ProductsApiService,
    productsMarshaller: ProductsApiMarshaller
) {
  import productsMarshaller._

  lazy val route: Route =
    path("banking" / "products" / Segment) { (productId) => 
      get {
        
          
            
              
                
                  productsService.getProductDetail(productId = productId)
               
             
           
         
       
      }
    } ~
    path("banking" / "products") { 
      get {
        parameters("effective".as[String].?, "updated-since".as[String].?, "brand".as[String].?, "product-category".as[String].?, "page".as[Int].?, "page-size".as[Int].?) { (effective, updatedSince, brand, productCategory, page, pageSize) =>
          
            
              
                
                  productsService.listProducts(effective = effective, updatedSince = updatedSince, brand = brand, productCategory = productCategory, page = page, pageSize = pageSize)
               
             
           
         
        }
      }
    }
}

trait ProductsApiService {

  def getProductDetail200(responseResponseBankingProduct: ResponseBankingProduct)(implicit toEntityMarshallerResponseBankingProduct: ToEntityMarshaller[ResponseBankingProduct]): Route =
    complete((200, responseResponseBankingProduct))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingProduct
   */
  def getProductDetail(productId: String)
      (implicit toEntityMarshallerResponseBankingProduct: ToEntityMarshaller[ResponseBankingProduct]): Route

  def listProducts200(responseResponseBankingProducts: ResponseBankingProducts)(implicit toEntityMarshallerResponseBankingProducts: ToEntityMarshaller[ResponseBankingProducts]): Route =
    complete((200, responseResponseBankingProducts))
  /**
   * Code: 200, Message: Success, DataType: ResponseBankingProducts
   */
  def listProducts(effective: Option[String], updatedSince: Option[String], brand: Option[String], productCategory: Option[String], page: Option[Int], pageSize: Option[Int])
      (implicit toEntityMarshallerResponseBankingProducts: ToEntityMarshaller[ResponseBankingProducts]): Route

}

trait ProductsApiMarshaller {

  implicit def toEntityMarshallerResponseBankingProduct: ToEntityMarshaller[ResponseBankingProduct]

  implicit def toEntityMarshallerResponseBankingProducts: ToEntityMarshaller[ResponseBankingProducts]

}

