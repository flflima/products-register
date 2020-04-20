package br.com.productsregister

import org.scalatra.test.scalatest._

class ProductsRegisterTests extends ScalatraFunSuite {

  addServlet(classOf[ProductsRegister], "/*")

  test("GET / on ProductsRegister should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
