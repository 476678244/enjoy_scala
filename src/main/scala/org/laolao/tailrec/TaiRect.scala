package org.laolao.tailrec

class TaiRect {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }
    go(n, 1)
  }
}

object TaiRect extends App {
  val taiRect = new TaiRect()
  println(taiRect.factorial(5))
}
