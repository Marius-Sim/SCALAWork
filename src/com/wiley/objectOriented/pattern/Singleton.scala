package com.wiley.objectOriented.pattern

object Singleton extends App {
  CustomersOnWebsite.increaseUsers()
  CustomersOnWebsite.showUsers()
  CustomersOnWebsite.increaseUsers()
  TestSingleton.test()
  CustomersOnWebsite.increaseUsers()
  CustomersOnWebsite.showUsers()
}

object CustomersOnWebsite {
  var count = 0
  def showUsers(): Unit = {
    println(s"Customers currently on the website: $count")
  }

  def increaseUsers(): Unit = {
    count += 1
  }
}
