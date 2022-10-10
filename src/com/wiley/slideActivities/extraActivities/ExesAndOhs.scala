package com.wiley.slideActivities.extraActivities

object ExesAndOhs extends App {
  var str: String = "xxxoo"

  var o_count = 0
  var x_count = 0

  for (char <- str.toLowerCase) {
    if (char == 'x') x_count += 1 else if (char == 'o') o_count += 1
  }
  if (o_count == x_count) 1 else 0

}
