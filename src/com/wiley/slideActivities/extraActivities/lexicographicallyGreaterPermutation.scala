package com.wiley.slideActivities.extraActivities

object lexicographicallyGreaterPermutation extends App {

  var numbers:List[Int] = List(2,1,3)

  println(getPermutations(numbers))

  def getPermutations(nums:List[Int]): List[Int] = {
    val perms = nums.permutations.toList
    var next_biggest = Double.PositiveInfinity
    for (x <- perms) {
      val xx = x.mkString.toInt
      if (xx > nums.mkString.toInt && xx < next_biggest) {
        next_biggest = xx
      }
    }

    next_biggest.toInt.toString.map(_.asDigit).toList
  }

}
