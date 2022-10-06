package com.wiley.objectOriented
import scala.io.StdIn.{readInt, readLine}

class Student(id:Int, name:String) {
  def show(): Unit = {
    println(s"$id --> $name")
  }
}

object execSecondStudent extends App{
  print("How many students: ")
  var num = readInt()

  var students = List[Student]()

  for (x <- 1 to num) {
    print("Enter student name: ")
    val name = readLine()
    students = students :+ new Student(x, name)
  }

  showStudents()

  def showStudents(): Unit = {
    for (student <- students) {
      student.show()
    }
  }
}