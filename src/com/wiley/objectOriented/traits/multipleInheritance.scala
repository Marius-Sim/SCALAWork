package com.wiley.objectOriented.traits

trait Printable {
  def showPrintable(): Unit = {
    println("Can be printed")
  }
}

trait Viewable {
  def showViewable(): Unit = {
    println("Can be viewed")
  }
}

class inheritFromMore extends Printable with Viewable {
  def lastFunc(): Unit = {
    println("This is last")
  }
}

object multipleInheritance extends App {
  var multi = new inheritFromMore
  multi.showViewable()
  multi.showPrintable()
  multi.lastFunc()
}
