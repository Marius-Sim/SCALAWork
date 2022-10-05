package com.wiley.slideActivities

object DataTypesActivity2 extends App {

  var given_integer = 320
  var given_integers = List(12,79,80,90,120,121,200,279,280,310,320,321,500)

  for (x <- given_integers) {
    if ((x >= 100 - 20 && x <= 100 + 20) || (x >= 300 - 20 && x <= 300 + 20)) {
      println("True: " + x)
    } else {
      println("False: " + x)
    }
  }
}
