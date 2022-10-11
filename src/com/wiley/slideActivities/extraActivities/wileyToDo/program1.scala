package com.wiley.slideActivities.extraActivities.wileyToDo

abstract class Donut {
  var name: String
  def printName(): Unit
}

case class VanillaDonut() extends Donut {
  override var name: String = "Vanilla donut"

  override def printName(): Unit = {
    println(name)
  }
}

case class GlazedDonut() extends Donut {
  override var name: String = "Glazed donut"

  override def printName(): Unit = {
    println(name)
  }
}

class Pastry[T <: Donut] (donut:T) {
  def name(): Unit = donut match {
    case VanillaDonut() => donut.printName()
    case GlazedDonut() => donut.printName()
  }
}

object program1 extends App {
  var pastryOne = new Pastry[VanillaDonut](VanillaDonut())
  var pastryTwo = new Pastry[Donut](GlazedDonut())
  pastryOne.name()
  pastryTwo.name()
}
