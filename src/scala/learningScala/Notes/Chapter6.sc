import java.util

import collection.JavaConverters._


val numbers = List(32,95, 24, 21, 17)
val colors = List("Red", "Green", "Blue")
println(s"I have ${colors.size} colors: $colors")
print(colors.head)
print(colors.tail)
print(colors(0))
print(colors(1))
print(colors(2))
for (color <- colors) println(color)

var total = 0
for (i <- numbers) total += i

colors.foreach( (color : String) => println(color))
val sizes = colors.map( (color: String) => color.size)

val total2 = numbers.reduce( (a: Int, b: Int) => a+b )
val total3 = numbers.sum

val unique = Set(10,20,30,20,20,10)

val sum = unique.reduce( (a: Int, b: Int) => a+b)
val sum2 = unique.sum

val colorMap = Map("Red" -> 0xFF0000, "Green" -> 0xFF00 , "Blue" -> 0xFF )

val redRGB = colorMap("Red")
val cyanRGB = colorMap("Green") | colorMap("Blue")
val hasWhite = colorMap.contains("White")

for (pairs <- colorMap) println(pairs)

val oddsAndEvens = List( List(1,3,5), List(2,4,6) )

val keyValues = List( ('A', 65) , ('B', 66) , ('C' , 67) )

val primes = List(2,3,5,7,11,13)
val first = primes(0)
val fourth = primes(3)
val first2 = primes.head
val remaining = primes.tail

var i = primes
while (! i.isEmpty) { print(i.head + ", "); i = i.tail }

def visit (i: List[Int]): Unit = {
  if (i.nonEmpty) { print(i.head + ", "); visit(i.tail) }
}
visit(primes)

var i2= primes
while (i2 != Nil) { print(i2.head + ", "); i= i2.tail }

val l: List[Int] = List()
l == Nil
val m : List[String] = List("a")
m.head
m.tail == Nil

val ls =  1::2::3::Nil
val first3 = Nil.::(1)
val second = 2 :: first3


// List's arithmetic operations examples
val createsList = 1 :: 2 :: 3 :: Nil
val addsLists = List(1,2) ::: List(3,4)
val addsLists2 = List(1,2) ++ List(3,4)
val equals = List(1,2) == List(2,2)
val noDuplicates = List(3,5,4,3,4).distinct
val sustractFirstNElements = List("a", "b", "c", "d", "e") drop 2
val filters = List(23,8,5,1,3,15).filter(_>5)
val convertToSingleList = List(List(1,2) , List(3,4)).flatten
val separateWithConditional = List(1,2,3,4,5,6).partition(_<3)
val reversedList = List(1,2,3).reverse
val segmentFromNToK = List(2,3,5,7).slice(1,3) //From index 1 to 3 excluded
val sortByConditional = List("apple", "to").sortBy(_.size)
val sortNaturalValue = List("apple", "to").sorted
val splitsList = List(1,2,3,4,5).splitAt(2)
val extractsFirstNOfList = List(1,2,3,4,5,6,7,8).take(3)
val zipList = List(1,2) zip List("a", "b")

val appendList = List(1,2,3,4,5)
val suffix = appendList takeRight 3
val middle = appendList dropRight 2

val retainsCondition = List(0,1,0,1,1,0).collect {case 1 => "OK"}
val flatMap = List("Milk" , "Tea").flatMap(_ split ',')
val transformsEachElement = List("milk", "tea").map(_ toUpperCase)

// Math reduction operations examples
val maxValue = List(10,5,15,2).max
val minValue = List(10,5,15,2).min
val productValues = List(10,5,15,2).product
val sumValues = List(10,5,15,2).sum
println(sumValues)

// Boolean reduction operations
val containsList = List(34, 25, 12, 13) contains 12
val endsWith = List(0,4,2,1) endsWith List(2,1) // Same with startsWith
val exists = List(24,12,321) exists(_ < 15)
val forAll = List(123,14,4) forall(_ < 50)

val validations = List(true, true, false, true, true, true)
val valid1 = !(validations contains false)
val valid2 = validations forall(_ == true)
val valid3 = !validations.exists(_ == false)

// Not optimal
def contains (x: Int, l: List[Int]): Boolean = {
  var a: Boolean = false
  for (i <- l) {if (!a) a = i == x}
  a
}

def reduceOP[A,B] (list: List[A], start: B) (f: (B,A) => B) : B = {
  var a = start
  for (i <- list) a = f(a, i)
  a
}

val included = reduceOP(List(60,23,52), false) { (accumulator,currentElement) => if (accumulator) accumulator else currentElement == 23 }

val answer = reduceOP(List(11.3, 23.5, 7.2) , 0.0) (_+_)


// Generic List reduction operations
val fold = List(4,5,6).fold(0)(_ * _) //Reduces the list given a starting value and a reduction function, with foldLeft and foldRight
val reduceList = List(1,2,3).reduce(_ + _) //Same with reduceLeft, reduceRight
val scanList = List(1,2,3).scan(0)(_ + _) //Same with scanLeft, scanRight

val included2 = List(2,4,6,7).foldLeft(false) { (a,i) => if (a) a else i == 4 }
val answer2 = List(1,2,3).reduceLeft(_ + _)


// Operations to convert collections

val makeString = List(1,2,3).mkString(", ")
val bufferList = List('f', 't').toBuffer //Converts from immutable to mutable
val colToList = Set('a' -> 1, 'b' -> 2, 'c' ->3).toList
val colToMap = List(1 -> true, 2 -> false, 3-> true).toMap //Needs length 2 tuples
val colToSet = List(2,5,5,3,2).toSet
val toStringExercise = List(2,3,5,6,1,23).toString


//Java and Scala collection compatibility ==> import collection.JavaConverters._
val asJava = List(12,23).asJava
val asScala = new util.ArrayList(5).asScala


// Pattern matching with collections

val statuses = List(500,400,404)
// Match expressions
val msg = statuses.head match{
  case x if x < 500 => "OK"
  case _ => "ERROR"
}
// Matching with pattern guards
val msg2 = statuses match {
  case x if x contains 500 => "ERROR"
  case _ => "OK"
}
//Matching collection-to-collection
val msg3 = statuses match {
  case List(500,400,405) => "OK"
  case List(100,500) => "Error"
  case _ => "??????"
}
// Matching with wildcard patterns (value binding)
val msg4 = statuses match {
  case List(500, x, y) => s"Error followed by $x or $y"
  case List(x,y,z) => s"$x was followed by $y or $z"
}
//Matching head and tail/tails
val head = List('r','g','b') match {
  case x :: xs => x
  case Nil => ' '
}
// Matching patterns with tuples
val code = ('h', 204, true) match {
  case (_, _, false) => 501
  case ('c', _, true) => 302
  case ('h', x, true) => x
  case (c, x, true) => {println(s"Did not expect code $c");x}

}


