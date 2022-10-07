package com.wiley.objectOriented.inheritance

class finalVehicle {
  final val somethingImmutable = "Unchanged"

  val speed = 60 //adding final will throw error on line 11 because we attempt changing value
  def show(): Unit = { //adding final will throw error on line 13 because we attempt overriding
    println(speed)
  }
}

class finalBike extends finalVehicle {
  override val speed = 100

  override def show(): Unit = {
    println(speed)
  }

}

object finalDefinition extends App {
  var b = new finalBike
  b.show()
  var v = new finalVehicle
  v.show()
}