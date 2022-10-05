package com.wiley.scalaFunctions

object defaultValues extends App {

  println(withDefaults(1,2))
  println(withDefaults(b=50))
  println(withDefaults(89))

  def withDefaults(a:Int = 5, b:Int = 10): Int = {
    a+b
  }

}
