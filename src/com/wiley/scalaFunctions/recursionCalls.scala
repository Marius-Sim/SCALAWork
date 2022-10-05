package com.wiley.scalaFunctions

object recursionCalls extends App {

  println(recursive(10,5))

  def recursive(a:Int, b:Int): Int = {
    if (b == 0) {
      1
    } else {
      a*recursive(a,b-1)
    }
  }

}
