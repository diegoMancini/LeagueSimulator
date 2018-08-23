package scala.programmingInScala

import scala.collection.mutable

class CheckSumAccumulator {

  private var sum = 0

  def add(b: Byte) = {sum += b}

  def checkSum() : Int = (sum & 0xFF)+1

}

object CheckSumAccumulator {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s:String) = {
    if (cache.contains(s)) cache(s)
    else {
      val accumulator = new CheckSumAccumulator
      for (c <- s) accumulator.add(c.toByte)
      val cs = accumulator.checkSum()
      cache += s -> cs
      cs
    }
  }

}
