package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.readLine

object acc4 extends App {
  print("String concatenation \n Input first string: ")
    var first_string: String = readLine()
    print("Input second string: ")
    var second_string: String = readLine()
    var concatenated = first_string + second_string
    print(s"Concatenated strings: $concatenated")

}
