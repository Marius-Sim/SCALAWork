package com.wiley.lists

object BasicLists extends App {
  var numberList = List(1,2,3,4,5,6,7,8,9)

  BasicLists.numberList.foreach(println)

  numberList.foreach((element:Int) => print(element + " "))

}
