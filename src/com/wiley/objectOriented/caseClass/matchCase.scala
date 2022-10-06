package com.wiley.objectOriented.caseClass

trait Car

case class Tesla() extends Car {
  val engine = "Electric"
  val typeClass = "Urban"
}
case class Jaguar() extends Car {
  val engine = "Diesel"
  val typeClass = "Luxury"
}
case class BMW() extends Car {
  val engine = "Petrol"
  val typeClass = "Sport"
}
case class McLaren() extends Car {
  val engine = "Rocket"
  val typeClass = "Race"
}
case class Dog() extends Car {
  val engine = "Food"
  val typeClass = "Not a car"
}

object matchCase extends App {

  callCase(Tesla())
  callCase(BMW())
  callCase(Jaguar())
  callCase(McLaren())
  callCase(Dog())

  def callCase(param: Car): Unit = param match {
    case Tesla() => println("Tesla - Class: " + Tesla().typeClass + " - Engine: " + Tesla().engine)
    case BMW() => println("BMW - Class: " + BMW().typeClass + " - Engine: " + BMW().engine)
    case Jaguar() => println("Jaguar - Class: " + Jaguar().typeClass + " - Engine: " + Jaguar().engine)
    case McLaren() => println("McLaren - Class: " + McLaren().typeClass + " - Engine: " + McLaren().engine)
    case _ => println("No car")
  }

}
