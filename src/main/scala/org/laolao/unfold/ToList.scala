package org.laolao.unfold

object ToList extends App with Stream[Int] {

  val s = Stream(1, 2, 3)

  println(s.toList)

}
