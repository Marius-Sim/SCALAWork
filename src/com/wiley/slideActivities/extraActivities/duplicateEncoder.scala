package com.wiley.slideActivities.extraActivities

object duplicateEncoder extends App {

  println(duplicateEncode("recede"))
  def duplicateEncode(word: String): String = {
    var newString = ""
    val smallWord = word.toLowerCase()
    for (char <- smallWord) {
      if (smallWord.count(_ == char) > 1) newString += ")" else newString += "("
    }
    newString
  }
}
