package core

import other.Other

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = Other.greeting
}
