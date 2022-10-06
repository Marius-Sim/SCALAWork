package com.wiley.objectOriented.inheritance

class Employee {
  var salary: Int = 5000

}

class Programmer extends Employee {
  var bonus: Int = 1000
}

object execInheritance extends App {
  var person = new Programmer()
  var total_income = person.salary + person.bonus
  println(s"Total income: $total_income")
}
