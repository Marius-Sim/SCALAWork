package com.wiley.objectOriented.constructors

object lazyEvaluation extends App {
  //add/remove lazy from line 5 to see the difference
  lazy val x = {println("foo");10} //with lazy, x is not assigned its value yet so this line will not be printed
  println("bar")
  print(x) //x is being used for something here, so line 5 will get computed

}
