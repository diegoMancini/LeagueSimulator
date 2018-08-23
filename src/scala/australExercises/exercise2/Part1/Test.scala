package scala.australExercises.exercise2.Part1

object Test {

  def main(args: Array[String]): Unit = {

    val buildingList = List(for (i <- 1 to 10) new Building(i))
    val personList = List(for (i <- 1 to 10) new Person("Person number: " + i))
    val subjectList = List(for (i <- 1 to 10) new Subject("Subject number: " + i))

    val data = (List(for (i <- 1 to 10) yield new Building(i)), List(for (i <- 1 to 10) yield new Person("Person number: " + i)) , List(for (i <- 1 to 10) yield new Subject("Subject number: " + i)))

    val austral = new University("Universidad Austral", data )

  }

}
