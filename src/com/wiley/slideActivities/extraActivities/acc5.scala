package com.wiley.slideActivities.extraActivities
import scala.io.StdIn.{readLine, readChar}

object acc5 extends App {
  print("Character counting \n Enter a sentence: ")
  var sentence: String = readLine()
  print("Enter character to be counter: ")
  var char_to_count: Char = readChar()

  var count = 0
  for (x <- sentence) {
    if (char_to_count == x) {
      count += 1
    }
  }
  print(s"The character: $char_to_count occurred $count times")
}
