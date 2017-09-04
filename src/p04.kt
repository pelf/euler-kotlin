// Find the largest palindrome made from the product of two 3-digit numbers.

import java.math.BigInteger

fun isPal(number: Int) : Boolean {
  val ns = number.toString()
  return ns.equals(ns.reversed())
}

fun main(args: Array<String>) {
  var max = 0

  for (x in (100..999)) {
    for (y in (x..999)) {
      val mult = x * y
      if (isPal(mult) && mult > max) {
        max = mult
      }
    }
  }

  println(max)
}
