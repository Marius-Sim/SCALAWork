package com.wiley.higherOrderFunctions

object anonymousFunction extends App {

  var anon = (a:String, b:String) => a + b

  println(anon("He","llo"))

  var anon2 = (_:Int) + (_:Int)

  println(anon2(5, 7))

}
