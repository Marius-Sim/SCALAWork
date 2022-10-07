package com.wiley.slideActivities.extraActivities

object acc9 extends App {
  var arr = Array(1,2,null,4,5)
  show()
  for ((x,y) <- arr.zipWithIndex) {
    if (x == null) {
      arr(y) = 66
    }
  }
  show()

  def show(): Unit = {
    for (x <- arr) {
      print(x + " ")
    }
    println()
  }
}
