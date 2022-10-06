package com.wiley.slideActivities.extraActivities

//I used the python code from
//https://www.javatpoint.com/program-to-find-all-permutations-of-a-string
//And translated it to Scala

object allPossiblePermutations extends App {

  var string = "ABC"
  var n = string.length
  getPermutation(string,0,n)

  def getPermutation(s:String, start:Int, end:Int): Unit = {
    if (start == end-1) {
      println(s)
    } else {
      for (current <- start until end) {
        var x = s.toList
        var temp = x(start)
        x = x.updated(start, x(current))
        x = x.updated(current, temp)
        getPermutation(x.mkString, start+1,end)
        temp = x(start)
        x = x.updated(start,x(current))
        x = x.updated(current, temp)
      }
    }
  }
}
