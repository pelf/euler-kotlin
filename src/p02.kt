// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

fun main(args: Array<String>) {
  fun fib(): Sequence<Int> {
    var a = 0
    var b = 1

    return generateSequence {
      val f = a + b
      a = b
      b = f
      f
    }
  }

  val result = fib().takeWhile { it <= 4000000 }.filter { it % 2 == 0 }.sum()

  println(result)
}
