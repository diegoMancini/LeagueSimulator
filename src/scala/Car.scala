package scala

abstract class Car {
  val make : String
  val year : Int
  val automatic: Boolean
  def color: String
}

class Honda (val year: Int, val color : String, val automatic: Boolean) extends Car {
  val make : String = "Honda"
}

object Execute extends App {
  println(new Honda(2015, "Red", true).make)

}
