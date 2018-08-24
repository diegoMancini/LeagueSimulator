package scala.s99exercises

import scala.s99exercises.Exercise1.test

object Exercise2 extends App {

/*
P02 (*) Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
  ==========================================================================================================
*/

  val test = 1::2::3::4::5::Nil

  println("\n------------------------------------------------------")
  println(s"The test-list is $test")
  println(s"The last but one item in $test is --> ${lastButOne(test)}")
  println(s"The last but one item in $test is --> ${lastButOneRecursive(test)}")
  println("------------------------------------------------------\n")

  //default approach with scala libraries
  def lastButOne[a](intList: List[a]) : a = {
    if (intList.isEmpty) throw new NoSuchElementException
    else intList.init.last
  }

  //functional approach with pattern matching
  def lastButOneRecursive[a](intList:List[a]) : a = {
    intList match {
      case res :: _ :: Nil => res
      case _ :: notLast  => lastButOneRecursive(notLast)
      case _          => throw new NoSuchElementException
    }
  }

  // Just for fun, let's look at making a generic lastNth function.

  // An obvious modification of the builtin solution works.
  def lastNthBuiltin[A](n: Int, ls: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head
  }

  // Here's one approach to a non-builtin solution.
  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil              => resultList.head
        case _ :: tail        =>
          lastNthR(count - 1,
            if (count > 0) resultList else resultList.tail,
            tail)
      }
    if (n <= 0) throw new IllegalArgumentException
    else lastNthR(n, ls, ls)
  }


}
