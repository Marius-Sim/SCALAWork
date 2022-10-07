package com.wiley.slideActivities.extraActivities

object whichLetterWasAdded extends App {
  var s = "looping".toBuffer
  var t = "lonoping".toBuffer

  println(findLetter())

  def findLetter(): Char = {
    for (x <- t) {
      if (!s.contains(x)) {
        return x
      } else {
        s -= x
      }
    }
    ' '
  }

}
