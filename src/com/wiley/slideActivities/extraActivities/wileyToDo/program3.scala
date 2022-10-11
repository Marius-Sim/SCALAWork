package com.wiley.slideActivities.extraActivities.wileyToDo

case class Lollipop() {
  var name: String = _
}

class ShoppingCart {
  def addCartItem[T>:VanillaDonut] (item: T): Unit = {
    println("Added " + item + " to the cart")
  }
}

object program3 extends App {
  var cart = new ShoppingCart()
  cart.addCartItem(VanillaDonut)
  cart.addCartItem(GlazedDonut)
  cart.addCartItem(Lollipop)
  cart.addCartItem("Coffee")

}
