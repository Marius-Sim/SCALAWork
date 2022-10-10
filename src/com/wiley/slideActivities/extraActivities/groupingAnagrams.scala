package com.wiley.slideActivities.extraActivities

import scala.collection.mutable.ListBuffer

object groupingAnagrams extends App {
  var strs:ListBuffer[String] = ListBuffer("eat","tea","tan","ate","nat","bat")
  var output:ListBuffer[ListBuffer[String]] = ListBuffer.fill(strs.length)(ListBuffer())

  println(getOutput.filter(_.nonEmpty).mkString(", "))

  def getOutput: ListBuffer[ListBuffer[String]] = {
    var arr_count = 0

    for (str <- strs) {
      if (!skip(str)) {
        for (x <- str.permutations) {
          if (strs.contains(x) && !output(arr_count).contains(x)) {
            output(arr_count) += x
          }
        }
        arr_count += 1
      }
    }
    output
  }

  def skip(s:String): Boolean = {
    for (x <- output) {
      if (x.contains(s)) {
        return true
      }
    }
    false
  }

}
