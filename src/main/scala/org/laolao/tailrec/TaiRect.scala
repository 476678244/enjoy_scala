package org.laolao.tailrec

class TaiRect {

  def factorial(n: Int): Int = {

    @annotation.tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }
    go(n, 1)
  }


  // Exercise 1: Write a function to compute the nth fibonacci number

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(index: Int, prev: Int, cur: Int): Int = {
      if (n == 1) 0
      else if (index == n) cur
      else loop(index + 1, cur, cur + prev)
    }
    loop(2, 0, 1)
  }
}

object TaiRect extends App {
  val taiRect = new TaiRect()
  println(taiRect.factorial(5))
  println(taiRect.fib(1))
  println(taiRect.fib(2))
  println(taiRect.fib(3))
  println(taiRect.fib(4))
  println(taiRect.fib(5))
  println(taiRect.fib(6))
}
