package scala.programmingInScala

object Main extends App {

  println(CheckSumAccumulator.calculate("Jorge tiene una cabra"))

  val someNumbers = -10 :: -5 :: -1 :: 0 :: 1 :: 5 :: 10 :: Nil

  println("Before Filter")
  someNumbers.foreach((x: Int) => println(x))
  println("After filter") // Example of how you can connect different methods
  someNumbers.filter((x: Int) => x > 0).reverse.reverse.tail.reverse.foreach((x: Int) => println(x))
  someNumbers.filter(x => x > 0)
  someNumbers.filter(_ > 0)

  val f = (_ : Int) + (_ : Int)
  someNumbers.foreach(println)

  def sum(x: Int, y: Int, z: Int) = x+y+z

  val a = sum _
  println(a(1, 2, 3))
  val b = sum(1, _: Int , 10)
  println(b(10))
  println(b(5))

  val one = 1
  val closureSum = (x : Int) => x + one

  var addition = 0
  val someNumbers2 = -10 :: -5 :: -1 :: 0 :: 1 :: 5 :: 10 :: Nil

  someNumbers2.foreach(addition += _)

  println(addition)

  def makeIncreaser(more: Int) = (x: Int) => x + more

  val inc1 = makeIncreaser(1)(20)
  val inc5 = makeIncreaser(5)
  val inc9999 = makeIncreaser(9999)
  println(inc1)
  println(inc5(158))
  println(inc9999(1))

  // Repeated parameters
  def echo(args: String*) = for (arg <- args) println(arg)
  println(echo())
  println(echo("ONE"))
  println(echo("Hello,", "World!"))
  val arr = Array("What's", "up", "doc?")
  echo(arr : _*)

  //Named arguments
  def speed(distance: Float, time: Float): Float = distance / time
  println(speed(time = 10, distance = 25))
  println(speed(25, 10))

  // Tail recursion => when the recursive call is the last line of the block
  def boom(x: Int) : Int = {
    if (x == 0) throw new Exception("BOOM!")
    else boom(x-1)
  }

}
