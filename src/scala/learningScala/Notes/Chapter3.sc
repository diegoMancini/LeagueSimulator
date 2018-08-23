// 1

val name : String = "Diego"
name match {
  case "" => "n/a"
  case n => n
}

def checkNull(s : String) = {
  s match {
    case "" => "N/A"
    case n => n
  }
}

// 2

val amount : Double = 100.0

if (amount > 0) "Greater" else if (amount == 0) "Same" else "Lesser"
amount match {
  case x if x>0 => "Greater"
  case x if x==0 => "Same"
  case x if x<0 => "Lesser"
}

def greaterSameLesser (value : Double) = {
  value match {
    case x if x > 0 => "Greater"
    case x if x == 0 => "Same"
    case x if x < 0 => "Lesser"
  }
}


// 3

///////

// 4

val exercise4 = for (i <- 1 to 15) {
  i match {
    case x if i % 15 == 0 => println("Typesafe")
    case x if i % 5 == 0 => println("Safe")
    case x if i % 3 == 0 => println("Type")
    case x => println(x)
  }
}

val list = 2::5::6::Nil

def typeSafe(range : Int, values : List[Int]) = {
  for (i <- 1 to range; j <- 1 to values.length) {
    i match {

      case x if i % values.indexOf(j) == 0 => println("SafeType")
      case x => println(j)
    }
  }
}

typeSafe(100, list)

// 5

val exercise5 = for (i <- 1 to 15) { if (i % 3 == 0 && i % 5 == 0) println("Typesafe");  if (i % 5 == 0) println("Safe");  if (i % 3 == 0) println("Type");  else println(i)
}








