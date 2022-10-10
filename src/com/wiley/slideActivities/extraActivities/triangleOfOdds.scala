package com.wiley.slideActivities.extraActivities

object triangleOfOdds extends App {
  var n = 13
  var previous_nums = 0
  for (x <- 1 until n) {
    previous_nums += x
  }
  var row_sum = 0
  for (x <- 1 to n) {
    row_sum += previous_nums * 2 + 1
    previous_nums += 1
  }
  println(row_sum)
}
