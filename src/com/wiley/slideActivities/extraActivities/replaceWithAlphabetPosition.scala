package com.wiley.slideActivities.extraActivities

object replaceWithAlphabetPosition extends App {

  println(alphabetPosition("The sunset sets at twelve o' clock."))

  def alphabetPosition(text: String): String = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz".toList
    var newString = ""
    for (char <- text) {
      if (alphabet.contains(char.toLower)) {
        newString += (alphabet.indexOf(char.toLower)+1) + " "
      }
    }
    newString.dropRight(1)
  }
}
