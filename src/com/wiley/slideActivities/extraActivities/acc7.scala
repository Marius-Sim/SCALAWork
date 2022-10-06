package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.readInt

object acc7 extends App {
  print("Enter a number: ")
  var num = readInt()
  println(isPrime(num))

  def isPrime(x: Int): Boolean = {
    if (x <= 1) return false
    for (i <- 2 until x) {
      if (x % i == 0) return false
    }
    true
  }
}
