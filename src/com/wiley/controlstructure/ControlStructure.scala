package com.wiley.controlstructure

object ControlStructure extends App {
  var number: Int = 20
  if (number % 2 == 0) {
    println("even")
  } else {
    println("odd")
  }

  var score:Int = 79
  if (score >= 0 && score < 50) {
    println("fail")
  } else if (score >= 50 && score < 60) {
    println("D Grade")
  } else if (score >= 60 && score < 70) {
    println("C Grade")
  } else if (score >= 70 && score < 80) {
    println("B Grade")
  } else {
    println("A Grade")
  }
}
