package org.laolao.generic

class IsSorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    as.indices.map(index => {
      if (index >= as.length - 1) true
      else ordered(as(index), as(index + 1))
    }).reduce(_ && _)
    true
  }
}

object IsSorted extends App {
  val obj = new IsSorted()
  val as = Array(1, 2, 3, 4)
  val result = obj.isSorted[Int](as, (as1, as2) => {as1 < as2})
  print(result)
}
