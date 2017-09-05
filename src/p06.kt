// 06 - Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

import java.math.BigInteger

fun main(args: Array<String>) {
  val sosq = (1L..100L).map { BigInteger.valueOf(it) * BigInteger.valueOf(it) }.fold(BigInteger.valueOf(0L)) { t, i -> t + i }
  val sum = (1L..100L).sum()
  val sqos = BigInteger.valueOf(sum) * BigInteger.valueOf(sum)

  println(sqos - sosq)
}
