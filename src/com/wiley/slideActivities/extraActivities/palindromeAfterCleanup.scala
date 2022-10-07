package com.wiley.slideActivities.extraActivities

object palindromeAfterCleanup extends App {
  var alphabet = "abcdefghijklmnopqrstuvxyz".toList
  var input_string = "A man, a plan, a canal: Panama"
//  input_string = "race a car"
//  input_string = " "

  var clean_string = ""
  var reversed_string = ""

  for (x <- input_string.toLowerCase) {
    if (alphabet.contains(x)) clean_string += x
  }

  for (x <- clean_string.length-1 to 0 by -1) {
    reversed_string += clean_string(x)
  }

  if (reversed_string == clean_string) println("true") else println("false")

}
