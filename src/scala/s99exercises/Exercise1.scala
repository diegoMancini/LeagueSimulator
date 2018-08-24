package scala.s99exercises

object Exercise1 extends App {

/*
  P01 (*) Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8

  ==========================================================================================================
*/

    val test = 1::2::3::4::5::Nil

    println("\n------------------------------------------------------")
    println(s"The test-list is $test")
    println(s"The last item in $test is --> ${last(test)}")
    println(s"The last item in $test is --> ${lastRecursive(test)}")
    println("------------------------------------------------------\n")

  //default approach
  def last[a](intList: List[a]) : a = {intList.last}

  //functional approach
  def lastRecursive[a](intList:List[a]) : a = {
    intList match {
      case tail :: Nil => tail
      case n :: notLast => lastRecursive(notLast)
      case n => throw new NoSuchElementException
    }
  }

}
