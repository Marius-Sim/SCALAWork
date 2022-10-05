package com.wiley.operators

object OperatorsPractice extends App {
  var a = 20
  var b = 3
  var c = true
  var d = false

  //Arithmetic operators
  println("Addition: " + (a + b))

  println("Subtraction: " + (a - b))

  //Relational operators
  if (a == b) {
    println("values are the same")
  } else if (a != b) {
    println("values are different")
  }

  //Logical OR
  println("Logical OR of c || d: " + (c || d))

  //Logical AND
  println("Logical AND of c && d: " + (c && d))

  //Bitwise AND
  println("Bitwise AND of a & b: " + (a & b))

}
