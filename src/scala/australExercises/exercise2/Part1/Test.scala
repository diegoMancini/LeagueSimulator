package scala.australExercises.exercise2.Part1

object Test {

  def main(args: Array[String]): Unit = {

    val subjectList1 = List(new Subject("Math"), new Subject("Physics"),new Subject("Programming"))
    val subjectList3 = List(new Subject("Medicine"), new Subject("Biology"))

    val personList: List[Person] = {for (i <- 1 to 50) yield new Person("Person number: " + i, if (i % 2 == 0 ) new AccessCard(subjectList1) else new AccessCard(subjectList3), {if (i % 10 != 0) "Student" else "Professor"})}.toList
    val subjectList: List[Subject] = subjectList1 ::: subjectList3
    val buildingList: List[Building] = (for (i <- 1 to 3) yield new Building(i, subjectList, {for (j <- 1 to 3) yield new Pinwheel(j)}.toList)).toList

    val data: (List[Building], List[Person], List[Subject]) = (buildingList, personList, subjectList)

    val university = new University("Universidad Austral", new UniversityDatabase(data))

    println("\n\n======================================================\n")
    println(s"Bienvenido a: ${university.name}")
    println("\n======================================================\n")

    println(" - Edificios: \n")
    university.universityDatabase.data._1.foreach(building => println(s"Building number: ${building.numberOfBuilding}"))
    println("\n======================================================\n")
    println(" - Personas en el sistema: \n")
    university.universityDatabase.data._2.foreach(person => println(s"${person.name} ==> Ocupacion: ${person.occupation} ==> Materias que cursa: ${person.accessCard.subjectList.foreach(subject => subject.name)}"))
    println("\n======================================================\n")
    println(" - Materias que se dictan: \n")
    university.universityDatabase.data._3.foreach(subject => println(s"${subject.name}"))
    println("\n======================================================\n")




  }

}
