package io.swagger.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import io.swagger.server.api.AccountsApi
import io.swagger.server.api.CustomerApi
import io.swagger.server.api.DirectDebitsApi
import io.swagger.server.api.PayeesApi
import io.swagger.server.api.ProductsApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(accounts: AccountsApi, customer: CustomerApi, directDebits: DirectDebitsApi, payees: PayeesApi, products: ProductsApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = accounts.route ~ customer.route ~ directDebits.route ~ payees.route ~ products.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}