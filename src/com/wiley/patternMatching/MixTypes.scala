package com.wiley.patternMatching

object MixTypes extends App {
  println(search("Two"))

  def search(a:Any):Any = a match {
    case 1 => println("One"); 1
    case "Two" => println("String 2"); 2
    case 5.66 => println("Float"); 5.66
  }
}
