package com.wiley.higherOrderFunctions

object variableLengthParameters extends App {

  var letters = add("h","e","l","l","o")
  println(letters)

  def add(args: String*): String = {
    var builtString = ""
    for (x <- args) {
      builtString += x
    }
    builtString
  }
}
