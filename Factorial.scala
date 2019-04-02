import scala.math.BigInt

object Factorial extends App {
  def factorial(h: Int): BigInt = {
    def factorial(h: Int, i: BigInt): BigInt = if (h == 0) i else factorial(h - 1, h * i)
    factorial(h, 1)
  }


  println(factorial(10000))
}
