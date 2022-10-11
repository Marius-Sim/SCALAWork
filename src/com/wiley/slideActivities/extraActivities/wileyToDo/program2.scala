package com.wiley.slideActivities.extraActivities.wileyToDo

abstract class Vehicle {
  var make: String
}

case class Car(s:String) extends Vehicle {
  override var make: String = s
}

case class Bike(s:String) extends Vehicle {
  override var make: String = s
}

object VehicleReport extends App {

  var vehicles:List[Vehicle] = List()
  vehicles ::= Car("BMW 3 Series")
  vehicles ::= Car("VW Golf")
  vehicles ::= Bike("BMW g310 R Bike")
  vehicles ::= Bike("Fire Storm Bike")

  printVehicle(vehicles)

  def printVehicle(vehicleTypes: List[Vehicle]): Unit = {
    for (x <- vehicleTypes) {
      println(x.make)
    }
  }
}
