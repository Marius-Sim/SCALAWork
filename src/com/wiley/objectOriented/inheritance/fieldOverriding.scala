package com.wiley.objectOriented.inheritance

class Vehicle {
  val speed = 60
  def show(): Unit = {
    println(speed)
  }
}

class Bike extends finalVehicle {
  override val speed = 100

  def showChanged(): Unit = {
    println(speed)
  }
}

object fieldOverriding extends App {
  var b = new finalBike
  b.show()
}
