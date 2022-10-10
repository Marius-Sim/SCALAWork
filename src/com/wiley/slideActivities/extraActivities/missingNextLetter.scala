package com.wiley.slideActivities.extraActivities

object missingNextLetter extends App {
  println(findMissingLetter(Array('O', 'Q', 'R', 'S')))
  def findMissingLetter(chars: Array[Char]): Char = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var alphabet_list:List[Char] = List()
    if (chars.head.isUpper) {
      alphabet_list = alphabet.toUpperCase().toList
    } else {
      alphabet_list = alphabet.toList
    }

    val start = alphabet_list.indexOf(chars.head)
    var count = 0
    for (x <- start until start + chars.length) {
      if (alphabet_list(x) != chars(count)) return alphabet_list(x) else count += 1
    }
    ' '
  }
}

