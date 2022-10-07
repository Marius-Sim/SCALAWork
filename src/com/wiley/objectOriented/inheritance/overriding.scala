package com.wiley.objectOriented.inheritance

class Bank {
  var rate = 1.05
  def calcInterest(x: Int, standard:Boolean): Double = {
    if (standard) {
      println("Standard interest")
      x * getRate
    } else {0.0}
  }
  def getRate: Double = {
    rate
  }
}

class BofA extends Bank {
  var bofa_rate = 1.10
  override def calcInterest(x: Int, standard:Boolean): Double = {
    if (standard) {
      println("BofA giving standard rate")
      x * super.getRate
    } else {
      println("BofA giving own rate")
      x * bofa_rate
    }
  }
}

class NatWest extends Bank {
  var nat_rate = 1.20
  override def calcInterest(x:Int, standard:Boolean): Double = {
    if (standard) {
      println("NatWest giving standard rate")
      x * getRate
    } else {
      println("NatWest giving own rate")
      x * nat_rate
    }
  }
}

object overriding extends App {
  var person = new NatWest
  println(person.calcInterest(100,standard = true))
  println(person.calcInterest(100,standard = false))
  var second_person = new BofA
  println(second_person.calcInterest(100,standard = true))
  println(second_person.calcInterest(100,standard = false))

}
