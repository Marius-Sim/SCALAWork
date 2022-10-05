package com.wiley.higherOrderFunctions

object higherOrderPractice1 extends App {
  val funcObj = com.wiley.scalaFunctions.functionCalls
  higherOrderCall(5,funcObj.functionExamParameters)

  def higherOrderCall(a:Int, g:(Int,Int)=>Int): Unit = {
    println(a + g(20,10))
  }

}
