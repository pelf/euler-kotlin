// 06 - Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

import java.math.BigInteger

fun Long.toBigInt() = BigInteger.valueOf(this)
fun Int.toBigInt() = BigInteger.valueOf(toLong())

fun main(args: Array<String>) {
  val sosq = (1..100).map { it.toBigInt() * it.toBigInt() }.fold(0.toBigInt()) { t, i -> t + i }
  val sum = (1..100).sum()
  val sqos = sum.toBigInt() * sum.toBigInt()

  println(sqos - sosq)
}
