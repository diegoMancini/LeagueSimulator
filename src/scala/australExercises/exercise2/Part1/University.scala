package scala.australExercises.exercise2.Part1

class University (val name: String, val universityDatabase: UniversityDatabase) {}

class UniversityDatabase(val data: (List[Building], List[Person], List[Subject])) {}

class Building (val numberOfBuilding : Int, val subjectList : List[Subject] , val pinwheelList: List[Pinwheel]) {}

class Pinwheel(val number: Int){}

object Pinwheel {

  def authorizeAccess(person: Person, database: UniversityDatabase) : Boolean = {
    val accessCard = person.accessCard
    person.occupation match {
      case "Student"=> database.data._3.contains(accessCard.subjectList.iterator)
      case "Professor" => database.data._2.contains(person)
      case _ => throw new NoSuchElementException("NOT IN LIST OF OCCUPATIONS")
    }
  }

}

class Subject (val name: String) {}

class Person (val name: String, val accessCard: AccessCard, val occupation: String){}

class AccessCard (val subjectList: List[Subject]) {}

