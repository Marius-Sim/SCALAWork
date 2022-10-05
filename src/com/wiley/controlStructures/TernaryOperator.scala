package com.wiley.controlStructures

object TernaryOperator {
  def main(args:Array[String]): Unit ={
    val result = check(2)
    println(result)
  }

  def check(a:Int):Int = if(a>=0) 1 else -1

}
