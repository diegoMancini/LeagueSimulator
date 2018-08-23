package scala

abstract class Listener { def trigger}

class Listening {
  var listener: Listener = _
  def register( l: Listener) {listener = l}
  def sendNotification() {listener.trigger}
}

class Multiplier(factor: Int) {
  def apply(input: Int): Int = factor * input
}

object Test extends App {
  val tripleMe = new Multiplier(3)

  val tripled1 = tripleMe.apply(10)
  val tripled2 = tripleMe(10)

  println(tripled1)
  println(tripled2)

}
