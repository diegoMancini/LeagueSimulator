import java.math.BigInteger

import scala.collection.mutable

val msg = "Mi nombre es Diego Mancini"
msg.foreach(arg => println(arg))
msg.foreach(println)

for(arg <- msg) println(arg)

val big = new BigInteger("12345")
var num = 12345

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = " , "
greetStrings(2) = "World!"

greetStrings.foreach(print)
val numNames = Array("Zero", "One", "Two")

val oneTwoThree = List(1,2,3)

var oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated")
println("Therefore, " + oneTwoThreeFour + " is a new list.")

val twoThree = List(2,3)
val twoThreeOne = 1 :: twoThree
twoThreeOne :+ 4

val listita = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

val thrill = "Will" :: "Fill" :: "Until" :: "Nil" :: Nil

thrill.count(s => s.length == 4) // How many words with 4 of length

thrill.drop(1) //deletes that amount of elements
thrill.dropRight(1) //deletes that amount of elements from the right

//tuplas
val pair = (1, "two", 3)
pair._1
pair._2
pair._3

var jetset = Set("Boeing", "Airbus")
jetset += "Lear"
jetset.+=("Cessna")
println(jetset.contains("Cessna"))

val treasureMap = mutable.Map(1 -> "Go to island", 2 -> "Find big X on ground", 3 -> "Dig", 4 -> "Be a Maverick")
val romanNumbers = Map(1->"I", 5 -> "V" , 10 -> "X")
romanNumbers.foreach(index => println(index))
romanNumbers.foreach(index => println(index._1))
romanNumbers.foreach(index => println(index._2))

//imperative java style

def printArgsJava(args: Array[String]) : Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i+=1
  }
}

//semi-functional scala style

def printArgsScala(args : Array[String]) : Unit = {
  args.foreach(println)
}

//fully-functional scala style

def formatArgs(args:  List[String]) = args.mkString("\n")
val nameList = List("Diego", "Nicole")
println(formatArgs(nameList))

val result = formatArgs(nameList)
assert(result == "Diego\nNicole")

nameList(1) indexOf 'i'


val oneThird = new Rational(1,3)
val oneFifth = new Rational(1,5)
val rationalNew = oneFifth + oneThird


new Rational(66,42)

//






