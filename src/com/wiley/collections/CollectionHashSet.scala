package com.wiley.collections

import scala.collection.mutable

object CollectionHashSet extends App {
  var hashSet:mutable.HashSet[String] = mutable.HashSet("3 Pilaka Ruchitha",
    "4 Sugandha Dhanawade",
    "5 Marius Simion",
    "6 Irfan Khan Patan",
    "7 Vaibhav Kemani",
    "8 Sumukh Jadhav"
  )
  hashSet.foreach((element:String) => {
    val string = "ID: " + element.split(" ")(0) + "\nFirst name: " + element.split(" ")(1) + "\nLast name: " + element.split(" ")(2) + "\n"
    println(string)
  })
}
