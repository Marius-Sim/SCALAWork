package com.wiley.controlstructure

object ForLoops extends App {
  for (a <- 0 to 10) {
    println(a)
  }

  for (a <- 10 until 20) {
    println(a)
  }

  for (a <- 0 to 30 if a % 5 == 0) {
    println(a)
  }

  var result = for( a<-1 to 10) yield a
  for(i<- result){
    println(i)
  }

  for (a <- 0 to 10 by 1) {
    println(a)
  }

}