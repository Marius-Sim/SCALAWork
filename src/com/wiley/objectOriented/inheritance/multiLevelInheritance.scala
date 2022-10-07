package com.wiley.objectOriented.inheritance

class A {
  var salary = 1000
}

class B extends A{
  var bonus = 500
}

class C extends B {
  def show(): Unit = {
    println(s"Salary: $salary and Bonus: $bonus")
  }
}

object multiLevelInheritance extends App {
  var c = new C
  c.show()
}
