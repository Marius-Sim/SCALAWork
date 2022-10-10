package com.wiley.slideActivities.extraActivities

object digitEureka extends App {

  println(sumDigPow(1,100))

  def sumDigPow(a: Long, b: Long): List[Long] = {
    var outcome:List[Long] = List()
    for (x <- a until b) {
      var count:Double = 1
      var sum:Double = 0
      for (char <- x.toString) {
        sum += scala.math.pow(char.asDigit, count)
        count += 1
      }
      if (sum == x) outcome = outcome :+ x
    }
    outcome
  }
}
