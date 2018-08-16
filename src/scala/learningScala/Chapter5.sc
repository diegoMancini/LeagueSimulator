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
