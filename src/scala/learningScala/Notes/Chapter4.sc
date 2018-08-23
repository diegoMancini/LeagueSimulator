//1

def circleArea(radius: Double) : Double = {
  math.Pi * math.pow(radius, 2)
}

circleArea(4)

//2

def circleAreaString(radius: String) : Double = {
  radius.isEmpty match {
    case true => 0
    case false => math.pow(radius.toDouble, 2) * math.Pi
  }
}

circleAreaString("4")


//3

@annotation.tailrec
def printByFive (first: Int, last: Int, jump: Int): Unit = {
    if (first <= last) {
      println(first)
      printByFive(first + jump, last, jump)
    }
}

printByFive(5, 50, 5)


//4

def getDate : String = {
  val currentMiliseconds = System.currentTimeMillis()

  val seconds = currentMiliseconds/1000
  val days = seconds/86400
  val hours = (seconds % 86400) /3600
  val minutes = (seconds % 3600) / 60
  val sec = seconds % 60

  s"Days: $days, Hours: $hours, Minutes: $minutes, Seconds: $sec"
}

val date = getDate


//5

@annotation.tailrec
def optimizedPower (x: Int, n: Int, accum: Int = 1) :Int = {
  if (n < 1) 1
  else optimizedPower(x, n-1, x*accum)
}


//6

def vectors2dSubstraction (vector1: (Int,Int), vector2: (Int, Int)) : (Int, Int) = {(vector2._1 - vector1._1, vector2._2 - vector1._2)}

vectors2dSubstraction((5,5), (12, 13))


//7

def firstPositionTuple[A,B] (tuple: (A, B)) : (Any, Any) = {
  def isInt(x: Any) = x.isInstanceOf[Int]
  (isInt(tuple._1) , isInt(tuple._2)) match {
    case (false, true) => (tuple._2, tuple._1)
    case (false, false) => ("No", "Integers")
    case _ => tuple
  }
}

firstPositionTuple(1,2)
firstPositionTuple("Hola", 10)
firstPositionTuple("Hola", "Que tal")
firstPositionTuple(20, "Hola")


//8

def upgradeTuple[A,B,C](tuple: (Any,Any,Any)) : (Any,String,Any,String,Any,String) = {
  (tuple._1, tuple._1.toString, tuple._2, tuple._2.toString, tuple._3, tuple._3.toString)
}

upgradeTuple(true, 22.25, "yes")



