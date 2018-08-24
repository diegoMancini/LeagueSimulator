package scala.s99exercises

import java.util.NoSuchElementException

import scala.s99exercises.Exercise2.{lastButOne, lastButOneRecursive}

object Exercise3 extends App {

/*
P03 (*) Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
  ==========================================================================================================
*/

  val test = 1::2::3::4::5::6::7::8::9::10::Nil

  val index = util.Random.nextInt(10)

  println("\n------------------------------------------------------")
  println(s"The test-list is $test")
  println(s"The index value is $index")
  println(s"The nth item in $test is --> ${nthElement(test, index)}")
  println(s"The nth item in $test is --> ${nthElementRecursive(index, test)}")
  println("------------------------------------------------------\n")

  def nthElement[A](list: List[A], index: Int) : A = {
    if (index >= 0) list(index)
    else throw new NoSuchElementException
  }

  def nthElementRecursive[A](index: Int, list: List[A]) : A = {
    (index, list) match {
      case (0, h :: _  ) => h
      case (index, _ :: tail) => nthElementRecursive(index-1, tail)
      case ( _ , Nil ) => throw new NoSuchElementException
    }
  }


}
