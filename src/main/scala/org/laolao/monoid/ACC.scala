package org.laolao.monoid

object ACC extends App {

  trait Monoid[A] {
    def append(a: A, b: A): A
    def zero: A
  }

  def acc[T](list: List[T])(implicit m: Monoid[T]) = {
    list.foldLeft(m.zero)(m.append)
  }

  implicit val IntMonoid: Monoid[Int] = new Monoid[Int] {
    def append(a: Int, b: Int): Int = a + b
    def zero = 0
  }

  implicit val StrMonoid: Monoid[String] = new Monoid[String] {
    def append(a: String, b: String): String = a + b
    def zero = ""
  }

  println(acc(List(1,2,3)))

  println(acc(List("A","B","C")))
}
