package com.wiley.objectOriented.constructors

class secondaryConstructor(id:Int, name:String) {
  //parameters passed to the class are immutable and cannot be changed
  var age = 0
  var property: String = ""
  var finalParam: String = ""

  def showDetails(): Unit = {
    println(id + " - " + name + " - " + age + " - " + property + " - " + finalParam)
  }
  def this(id:Int, name:String, age:Int) {
    this(id,name)
    this.age = age
  }
  //Constructor overloading
  def this(id:Int, name:String, age:Int, property:String) {
    this(id,name)
    this.age = age
    this.property = property
  }
  def this(id:Int, name:String, age:Int, property:String, anotherParam:String) {
    this(id,name)
    this.age = age
    this.property = property
    this.finalParam = anotherParam
  }
  def increaseAge(): Unit = {
    age += 1
  }
  def changeProperty(s:String): Unit = {
    property = s
  }
//  This would not work because we are trying to change an immutable value ("id")
//  def increaseID(): Unit = {
//    id += 1
//  }
}

object execSecondary extends App {
  var first = new secondaryConstructor(1, "Marius", 22)
  first.showDetails()
  first.increaseAge()
  first.showDetails()
  var second = new secondaryConstructor(2,"Marius", 22, "Unemployed")
  second.showDetails()
  second.increaseAge()
  second.changeProperty("Software Developer")
  second.showDetails()
  var third = new secondaryConstructor(3, "Marius", 22, "Unemployed", "Contractor")
  third.showDetails()
  third.increaseAge()
  third.changeProperty("Programmer")
  third.showDetails()

  for (x <- List(first,second,third)) {

  }

}
