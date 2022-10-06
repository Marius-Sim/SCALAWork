package com.wiley.objectOriented.methodOverloading

class mathsComputation {
  def add(a:Int, b:Int): Unit = {
    val sum = a + b
    println(sum)
  }

  def add(a:Int, b:Int, c:Int): Unit = {
    val sum = a + b + c
    println(sum)
  }
}

object execMaths extends App {
  new mathsComputation().add(2,2)
  new mathsComputation().add(2,2,2)
}
