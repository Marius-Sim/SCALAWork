package com.wiley.objectOriented.constructors

import com.wiley.objectOriented.constructors.execThreeConstructs.obj1

class threeConstructors() {
  var first:String = "Empty"
  var last:String = "Empty"
  var age:Int = 0

  def this(first_name:String) {
    this()
    first = first_name
  }

  def this(first_name:String, last_name:String) {
    this()
    first = first_name
    last = last_name
  }

  def this(first_name:String, last_name:String, agee:Int) {
    this()
    first = first_name
    last = last_name
    age = agee
  }

  def show(): Unit = {
    println(first + " " + last + " " + age)
  }

}

object execThreeConstructs extends App {
  var obj1 = new threeConstructors()
  obj1.show()
  var obj2 = new threeConstructors("Marius")
  obj2.show()
  var obj3 = new threeConstructors("Marius", "Simion")
  obj3.show()
  var obj4 = new threeConstructors("Marius", "Simion", 22)
  obj4.show()
}
