def double(x: Int) : Int = x * 2
double(5)

val myDouble: Int => Int = double
myDouble(5)

val myDoubleCopy = myDouble

myDoubleCopy(5)

val myDouble2 = double _

val amount = myDouble2(10)

def max(x: Int, y: Int) : Int = if (x > y) x else y

val maximize: (Int, Int) => Int = max

maximize(50,20)

def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50

val start:() => String = logStart

println(start())

//////

/**
  *
  * @param s is the String you want to work with
  * @param f is a function where a String is passed and a String is returned
  * @return the first String modified by the function that follows
  */
def safeString(s: String, f: String => String) = {
  if (s != null) f(s) else s
}

def reverser(s: String) = s.reverse

safeString(null, reverser)

safeString("Ready", reverser)

val doubler = (x: Int) => x * 2

val doubled = doubler(22)


val greeter = (name: String) => s"Hello, $name"

val hi = greeter("World")

def maxLiteral(a: Int, b: Int) = if (a > b) a else b

val maximize2 : (Int, Int) => Int = max

val maximizeLiteral = (a: Int, b: Int) => if (a > b) a else b

maximizeLiteral(2,4)


val start2 = () => "=" * 50 + "\nStarting NOW\n" + "=" * 50


def safeStringOP1(s: String , f: String => String) = if (s != null) f(s) else s

safeStringOP1(null, s => s.reverse)

safeStringOP1("Ready", s => s.reverse)


val doublerPlaceHolder : Int => Int = _ * 2

safeStringOP1(null, _.reverse)


def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x,y)

combination(23, 12, _ + _)

def triple(x: Int, y: Int, z: Int, f: (Int, Int, Int) => Int) = f(x,y,z)

triple(5, 10, 20, _ * _ + _)

def tripleOP[A,B] (x: A, y: A, z: A, f: (A, A, A) => B) = f(x,y,z)

tripleOP[Int, Boolean](2, 3, 2, _ > _ - _ )
tripleOP[Int, Double](2, 2, 2, 2.0 * _ + _ / _ )


def factor(x: Int) (y: Int) = y % x == 0

val factorOF = factor _

val x = factorOF(5)(10)

val multipleOf3 = factorOF(3) (_ : Int)

multipleOf3(78)

val isEven = factorOF(2)

isEven(30)
isEven(31)

def doubles(x: => Int) = {
  println(s"Now doubling $x" )
  x*2
}

doubles(5)

def f(i: Int) = {println(s"Hello from f($i)");i}

doubles(f(8))


val statusHandler: Int => String = {
  case 200 => "Okay"
  case 400 => "Your error"
  case 500 => "Our error"
  case _ => "Wrong Input"
}

statusHandler(200)
statusHandler(400)
statusHandler(100)


def safeStringOPS(s: String)(f: String => String) = if (s != null) f(s) else s

val uuid = java.util.UUID.randomUUID().toString

val timedUUID = safeStringOPS(uuid) {s =>
  val now = System.currentTimeMillis()
  val timed = s.take(24) + now
  timed.toUpperCase
}

def timer[A] (f: => A) : A = {
  def now = System.currentTimeMillis()
  val start = now; val a = f; val end = now
  println(s"Executed in ${end-start} miliseconds")
  a
}

val veryRandomAmount = timer {
  util.Random.setSeed(System.currentTimeMillis())
  for (i <- 1 to 100000) util.Random.nextDouble()
  util.Random.nextDouble()
}


// EJERCICIOS

// 1

//Function Literal
val higherNumber =  (x: Int, y: Int) => if (x > y) x else y
val lowerNumber = (x: Int, y: Int) => if (x < y) x else y
val secondNumber = (x: Int, y: Int) => y

def pickOneNumber(inputs: (Int, Int, Int), f : (Int, Int) => Int) : Int = {
  f(inputs._1, f(inputs._2, inputs._3))
}

val higher = pickOneNumber((2,3,4) , higherNumber)


// 2

val random1 = util.Random.nextInt(100)
val random2 = util.Random.nextInt(100)
val random3 = util.Random.nextInt(100)
val randomTuple = (random1, random2, random3)


pickOneNumber(randomTuple, higherNumber)
pickOneNumber(randomTuple, (x,y) => if (x < y) x else y)
pickOneNumber(randomTuple, secondNumber)

//3

// Higher order function
def multiplier(x: Int) = (y: Int) => x * y
val tripler = multiplier(3)

tripler(10)


// 4

def fZero[A] (x: A) (f: A => Unit): A = { f(x) ; x }

def fZeroTest (x: String) (f : String => Unit): String = {f(x);x}

fZeroTest("Hello")(s => println(s.reverse))

fZero[Int] (20) (i => println(i*2))


// 5

def square(x: Int) : Any = (x * x)

//WRONG WAY
//val sq = square

//CORRECT WAY
val squareVal = square _
val squareFunc : Int => Any = square

squareVal(2)
squareVal(30)
squareFunc(5)

