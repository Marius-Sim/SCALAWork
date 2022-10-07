package com.wiley.objectOriented.abstractClasses

abstract class Motorbike {
  var height = 1.2
  def checkEngine(): Unit
  def showPerformance(speed:Int): Unit = {
    if (speed >= 50) {
      println("Performance is adequate")
    }
  }
}

class BMW extends Motorbike {
  override def checkEngine(): Unit = {
    println("Engine is working")
  }
  override def showPerformance(speed:Int): Unit = {
    if (speed < 50) {
      println("Performance is low")
    } else {
      super.showPerformance(speed)
    }
  }
}

object execAbs extends App {
  var motor = new BMW
  motor.checkEngine()
  motor.showPerformance(30)
}