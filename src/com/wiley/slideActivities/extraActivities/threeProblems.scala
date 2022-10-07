package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.readLine

abstract class Restaurant {
  var menuItems:List[String]
  var order:List[Int] = List()

  def printMenu(): Unit = {
    for ((x,y) <- menuItems.zipWithIndex) {
      print(s"$y: $x\n")
    }
  }

  def addToOrder(item:Int): Unit = {
    order ::= item
  }
}

class KFC extends Restaurant {
  override var menuItems: List[String] = List("Chicken strips", "Burger", "Coke")
}

class Gaucho extends Restaurant {
  override var menuItems: List[String] = List("Steak", "Wedges", "Wine")
}

class PizzaHut extends Restaurant {
  override var menuItems: List[String] = List("Pan crust pizza", "Stuffed crust pizza", "Sprite")
}

object threeProblems extends App {
  var restaurants = List("Gaucho", "KFC", "PizzaHut")

  var finished_order = false
  while (!finished_order) {
    for (r_name <- restaurants) {
      print(r_name + " ")
    }
    println()
    print("Enter the restaurant you want to order from: ")
    val r_choice = readLine()

    var choice:Restaurant = null
    r_choice match {
      case "Gaucho" => choice = new Gaucho
      case "KFC" => choice = new KFC
      case "PizzaHut" => choice = new PizzaHut
    }
    choice.printMenu()
    var stillOrdering = true
    println("Enter the integer of the item you wish to order")
    println("Or enter \"Done\" if finished: ")
    while (stillOrdering) {
      var order_input = readLine()
      order_input match {
        case "0" => choice.addToOrder(0)
        case "1" => choice.addToOrder(1)
        case "2" => choice.addToOrder(2)
        case "Done" => stillOrdering = false
      }
    }
    println("You have ordered: ")
    for (item <- choice.order) {
      println(choice.menuItems(item))
    }
    finished_order = true

  }
}
