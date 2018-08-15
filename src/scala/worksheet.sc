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


def sum (a : Int, b : Int) : Int = {
  a+b
}

def sum2 (a:Int, b:Int) = a+b

sum2(1,2)

def safeTrim(s : String): String = {
  if (s == null) return null
  s.trim
}

def formatEuro(amt : Double) = f"$$$amt%.2f"

formatEuro(3.4645)
formatEuro{val rate = 1.32; 0.235 + 0.7123 + rate * 5.32}


def power(x: Int, n: Int) : Int = {
  if (n >= 1) x * power(x, n-1)
  else 1
}

power(2, 4)

@annotation.tailrec
def optimizedPower (x: Int, n: Int, t: Int = 1) :Int = {
  if (n < 1) 1
  else optimizedPower(x, n-1, x*t)
}

def max(a: Int, b: Int, c: Int) : Int = {
  def max(x: Int, y: Int) : Int = if (x > y) x else y
    max(a, max(b,c))
}

max(10,1,42)


def greet(prefix: String, name: String) = s"$prefix, $name"

val greeting1 = greet("Ms", "Nicole")
val greeting2 = greet(name = "Diego", prefix = "Mr")

def greet2(sex: Char, name: String) = {
  sex match {
    case 'm' => s"MR, $name"
    case 'f' => s"MS, $name"
    case _ => "Enter 'm' for male / 'f' for female"
  }
}

val greeting3 = greet2('f', "Diego")
val greeting4 = greet2('d', "Nicole")

def sum(items: Int*):Int = {
  var total = 0
  for (i <- items) total += i
  total
}

sum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

def max2(x: Int)(y: Int) = if (x > y) x else y

max2(20)(21)


def identity[A](a: A) = a

val s = "Hello"
val twenty = 20.0

val number = 65.642
number.round
number.floor
number.compareTo(12.21)
number.+(23.2)
number+213

1 + 2

number compare 19.0
number + 1


