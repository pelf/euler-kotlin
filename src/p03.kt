// What is the largest prime factor of the number 600851475143 ?

// import java.math.BigInteger

fun main(args: Array<String>) {
  val number = 600851475143
  var f = 2L
  var n = number

  // stop when we're past the square root
  while (f * f <= number) {
    // if it's a divisor
    if (n % f == 0L) {
      println(f)
      // divide by it and try the same divisor again
      // exhausting the divisor guarantees all found divisors will be prime
      n = n / f
    // if it's not a divisor
    } else {
      // try next number as divisor
      f++
    }
  }
}
