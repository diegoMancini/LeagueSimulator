// 1
print("Another way of printing")
//2

def temperatureConverter(celsius: Double): Double = {(celsius * 9/5) + 32}

val input: Double = 22.5
val result2 : Double = temperatureConverter(input)

def returnValue(farenheit: Double) : Double = {(farenheit - 32) * 5/9}

returnValue(result2)