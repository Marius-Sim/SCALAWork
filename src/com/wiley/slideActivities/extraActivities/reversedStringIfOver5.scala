package com.wiley.slideActivities.extraActivities

object reversedStringIfOver5 extends App {

  println(spinWords("emocleW"))

  def spinWords(sentence: String): String = {
    var new_string = ""
    for (word <- sentence.split(" ")) {
      if (word.length > 4) {
        new_string += word.reverse + " "
      } else {
        new_string += word + " "
      }
    }
    new_string.dropRight(1)
  }
}
