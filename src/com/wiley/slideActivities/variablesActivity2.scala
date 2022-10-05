package com.wiley.slideActivities
import scala.io.StdIn.{readLine, readInt}

object variablesActivity2 extends App {
  print("Enter your name: ")
  var name: String = readLine()
  print("Enter your age: ")
  var age: Int = readInt()

  println(s"Your name is $name and you are $age years old")

}
