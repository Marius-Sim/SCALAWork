package com.wiley.patternMatching

object MatchNumbers extends App {
  var num = 0
  if (num > 0) {
    num = 1
  } else if (num < 0) {
    num = -1
  } else {
    num = 0
  }

  num match {
    case -1 => println("Negative")
    case 1 => println("Positive")
    case _ => println("Zero")
  }
}
