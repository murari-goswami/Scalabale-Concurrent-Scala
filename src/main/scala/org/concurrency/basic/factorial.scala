package org.concurrency.basic

object factorial extends App {
  val num = 10
//  (1 to num).foreach(x => println("The factorial of " + x + " is " + (1 to x).product))
  println("Factorial of " + num + " is " + (1 to num).product)
}