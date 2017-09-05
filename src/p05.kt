// 05 - What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

// if it divides by 20, it needs to divide by 1,2,4,5,10, so we can leave those out
val seq = arrayOf(3,5,6,7,8,9,11,12,13,14,15,16,17,18,19).asSequence()

fun divides(number: Long) : Boolean {
  return seq.all { number % it == 0L }
}

fun main(args: Array<String>) {
  var number = 0L

  do {
    // it needs to divide by 20, so there's no point in moving in smaller increments
    number += 20
  } while (!divides(number))

  println(number)
}
