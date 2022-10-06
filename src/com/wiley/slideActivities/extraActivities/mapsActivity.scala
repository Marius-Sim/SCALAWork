package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.readInt

object mapsActivity extends App {
  var freq: Map[Char,Int] = Map()

  print("Enter a number: ")
  var num = readInt()

  countFrequency(num)
  printMap(freq)

  def countFrequency(number:Int): Unit = {
    for (c <- number.toString) {
      if (freq.contains(c)) {
        freq = freq + (c -> (freq(c)+1))
      } else {
        freq = freq + (c -> 1)
      }
    }
  }

  def printMap(dict:Map[Char,Int]): Unit = {
    for ((key, value) <- dict) {
      println(s"Digit: $key Counted: $value")
    }
  }
}
