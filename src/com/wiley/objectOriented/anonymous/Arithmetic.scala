package com.wiley.objectOriented.anonymous

class Arithmetic() {
  def add(a:Int, b:Int): Unit = {
    val sum = a + b
    println(s"Sum = $sum")
  }
}

object callArithmetic extends App {
  new Arithmetic().add(10,20)
  var obj: Unit = new Arithmetic().add(5,10)
//  obj.add(1,2) // does not work because it is not an instance, rather a method call
  var obj2 = new Arithmetic()
  obj2.add(1,3)
}