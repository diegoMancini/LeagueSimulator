package scala.learningScala.Exercises

import concurrent.ExecutionContext.Implicits.global

object Chapter6Exercises extends App {

  //Exercise 1
  val list20LongNumbersForLoop = for(i <- 0L to 9L; j = i*2+1) yield j
  val list20LongNumbersFilter = 0L to 20L filter(_ % 2 == 1)
  val list20LongNumbersMap = 0L to 9L map(_ * 2 + 1)
  val oddNumbersListsPrinted = List(list20LongNumbersForLoop,list20LongNumbersFilter,list20LongNumbersMap)
  println(oddNumbersListsPrinted)

  //Exercise 2

  def factorsOfValue(i: Int) = {
    2 until i filter(i % _ == 0)
  }

  def factorsOfList(seq: Seq[Int]) = {
    seq flatMap factorsOfValue
  }

  val uniqueFactor = factorsOfList(List(2,4,6,10,15,27))

  println(uniqueFactor)

  //Exercise 3

  def firstLazy[A](items: List[A], count: Int) : List[A] = items take count

  def firstForLoop[A](items: List[A], count: Int) : List[A] = {
    val result = for (i <- 0 until count) yield items(i)
    result.toList
  }

//  def firstFoldLeft[A](items: List[A], count: Int): List[A] = {}

  def firstRecursive[A](items: List[A] , count: Int) : List[A] = {
    if (items.nonEmpty && count > 0 && items.tail != Nil) items.head :: firstRecursive(items.tail, count-1)
    else Nil
  }

  //Exercise 4

  def longestString[A](list: List[A], max: (A,A) => A) : A= {
    list reduce((a,i) => max(a,i))
  }

  val names = List("Diego", "Nicole", "Jose", "Leon")

  println(longestString[String](names , (x,y) => if(x.length > y.length) x else y))

  // Exercise 5

  def reverseList[A] (list: List[A], result: List[A] = Nil) : List[A] = {
    if (list == Nil) result else reverseList(list.tail, list.head :: result)
  }

  println("NORMAL LIST")
  for (name <- names) println(name)

  val names2 = reverseList(names)
  println("REVERSED LIST")

  for (name <- names2) println(name)


  //Threads future code
  val f = concurrent.Future {Thread.sleep(5000);println("HELLOS")}
  println("WAITING")


}
