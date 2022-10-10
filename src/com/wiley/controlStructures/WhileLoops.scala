package com.wiley.controlStructures

object WhileLoops extends App {
  var a = 0
  while (a < 101) {
    println(a)
    a += 5
  }

  do {
    println(a)
    a -= 5
  }
  while (a != 0)
}
