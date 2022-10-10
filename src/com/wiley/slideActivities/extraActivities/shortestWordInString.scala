package com.wiley.slideActivities.extraActivities

object shortestWordInString extends App {

  var shortest = 100
  var str = "bitcoin take over the world maybe who knows perhaps"

  for (word <- str.split(" ")) {
    if (word.length < shortest) shortest = word.length
  }
  shortest

}
