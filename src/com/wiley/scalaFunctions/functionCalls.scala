package com.wiley.scalaFunctions

object functionCalls {
  def main(args: Array[String]): Unit = {
    val result = functionExamModify()
    println(result)
  }

  def functionExam(): Unit = {
    println("Simple function")
  }

  def functionExamModify(): Int = {
    val a = 10
    a
  }

  def functionExamParameters(a:Int, b:Int): Int = {
    a+b
  }

}
