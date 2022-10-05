package com.wiley.higherOrderFunctions

object functionComposition extends App {

  println(multiply(add(3)))

  def add(a:Int): Int = {
    a + 5
  }

  def multiply(a:Int): Int = {
    a * 5
  }

}
