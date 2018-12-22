package org.concurrency.basic

object factorial extends App {
  val num = 5
  (1 to num).foreach(x => println("The factorial of " + x + " is " + (1 to x).product))
}
