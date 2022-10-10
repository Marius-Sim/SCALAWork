package com.wiley.slideActivities.extraActivities

object removeDuplicatesFromIntArray extends App {
  var numbers:Array[Int] = Array(0,0,1,1,1,2,2,3,3,4)

  var k = removeDuplicates(numbers)
  println(k)

  def removeDuplicates(nums: Array[Int]): (Int, Array[Int]) = {
    var ints = 0
    for ((x,y) <- nums.zipWithIndex) {
      if (nums.indexOf(x) == y) {
        nums(ints) = x
        ints += 1
      }
    }
    (ints, nums)
//    println(ints)
//    println(nums.mkString("Array(", ", ", ")"))
  }
}
