val x = 10
val y = 20

val result1 = if (x>y) x else y

//Matching patterns
val result2 = x > y match {
  case true => x
  case false => y
}

val status = 500
val message = status match {
  case 200 => "OK"
  case 400 => println("Error - we called the incorrect service"); "error"
  case 500 => println("Error - the service encountered an error"); "error"
}


val day = "Monday"
val kind = day match {
  case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday"  => "Weekday"
  case "Saturday" | "Sunday" => "Weekend"
  case _ => "ERROR"
}

val msg = "Ok"
val status2 = msg match {
  case "Ok" => 200
  case _ => println(s"Couldn't parse $msg"); -1
}

val response: String = null

response match {
  case s if s != null => println(s"Received '$s'")
  case s => println("Error! Received a null response")
}

val x1: Int = 12180
val y1: Any = x1

y1 match {
  case x1 : String => s"'$x1'"
  case x1 : Double => f"$x1%.2f"
  case x1 : Int => s"${x1}i"
}

//Loops

for (number123:Int <- 1 to 7) {println(s"Day $number123: ")}

val smh = for (x <- 1 to 7) yield {s"Day $x:"}

for (day <- smh) print(day + ",")

val threes = for (i <- 1 to 20 if i%3 == 0) yield i

val quote = "Faith, Hope, Charity"

for {
  t <- quote.split(", ")
  if t != null
  if t.nonEmpty
}{println(t)}

for { x <- 1 to 3; y <- 1 to 3} {print(s"($x,$y)")}

val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow

var x3 = 10
while (x3>0) x3-=1
























