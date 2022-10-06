package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.readInt

object acc6 extends App {
  print("Enter a number: ")
  var num = readInt()
  if (num < 0) {
    println("Negative number")
  } else if (num > 0) {
    println("Positive number")
  } else {
    println("Zero")
  }
}
