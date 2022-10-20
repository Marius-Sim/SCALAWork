package com.wiley.collections

import scala.collection.immutable._

object Queues extends App {
  var queue = Queue(3, 34, 5, 43, 2, 5, 21, 5, 156, 1, 5)
  var queue2: Queue[Int] = Queue(89, 23, 4, 12, 54, 12, 1, 4, 6, 1)
  println(queue)
  println(queue.head)
  println(queue.front)
  println(queue.last)
  println(queue)
  var enq = queue.enqueue(100)
  println(enq)
  var deq = queue.dequeue
  println(deq._1)
  println(deq._2)
  var reversedQueue = deq._2.reverse
  println(reversedQueue)
  println(queue2)
  println(queue2.sorted)
  var queue3 = queue2.toList
  println(queue3)
}
