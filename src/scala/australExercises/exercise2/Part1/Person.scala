package scala.australExercises.exercise2.Part1

import scala.util.Random

class Person (val name: String, val accessCard: AccessCard, val occupation: String) {

  def this (name: String) = {

    this(name, new AccessCard, randomOccupation)
  }

  val subjects : List[Subject] = accessCard.getSubjects()


  private def randomOccupation  = Random.nextInt(10) {
    case _ % 2 == 0 => "Student"
    case _ % 2 != 0 => "Employee"
  }


}
