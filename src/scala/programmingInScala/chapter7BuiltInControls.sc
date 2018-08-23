import scala.io.Source

// Returns a row as a sequence
def makeRowSeq(row: Int) = {
  for (column <- 1 to 10) yield {
    val product = (row * column).toString
    val padding = " " * (4 - product.length)
    padding + product
  }
}

// Returns a row as a string
def makeRow(row: Int) = makeRowSeq(row).toString

// Returns table as a string with one row per line
def multiTable = {
  val tableSeq = for (row <- 1 to 10) yield makeRow(row)
  tableSeq.mkString("\n")
}

println(multiTable)

//Bad programming
def processFile1(filename: String, width: Int): Unit = {
  val source = Source.fromFile(filename)
  for (line <- source.getLines())
    processLine(filename: String, width: Int, line: String)
}

private def processLine(filename: String, width: Int, line: String): Unit = {
  if (line.length > width) println(filename + ": " + line.trim)
}

//Good programming with local functions
def processFile(filename: String, width: Int): Unit = {
  def processLine(line: String): Unit = { if (line.length > width) println(filename + ": " + line.trim) }
  val source = Source.fromFile(filename)
  for (line <- source.getLines())
    processLine(line)
}



// Function literals

var increase = (x: Int) => {
  println(s"You are adding '1' to $x")
}

val someNumbers = -10 :: -5 :: -1 :: 0 :: 1 :: 5 :: 10 :: Nil
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => println(x))