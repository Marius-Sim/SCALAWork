package com.wiley.objectOriented.constructors

class primaryConstructors(i: Int, name: String) {
  def showDetails(): Unit = {
    println(i + " - " + name)
  }
}

object execPrimary extends App {
  new primaryConstructors(1,"Hello").showDetails()
}
