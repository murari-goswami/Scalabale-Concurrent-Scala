package org.concurrency.basic

import scala.annotation.tailrec

object recursiveFactorial extends App {
  val num = 1000

  @tailrec
  private def factorial(number: Int, result: BigInt = 1): BigInt = {
    if (number == 0) result
    else factorial(number - 1, result * number)
  }

  println("Factorial of " + num + " is " + factorial(num))
}
