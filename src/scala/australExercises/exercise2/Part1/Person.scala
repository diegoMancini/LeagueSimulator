package scala.australExercises.exercise2.Part1

import scala.util.Random

class Person (val name: String, val accessCard: AccessCard, val occupation: String) {

  private val occupationRandom = randomOccupation()

  def this (name: String) = {
    this(name, new AccessCard, occupationRandom)
  }

  val subjects : List[Subject] = accessCard.getSubjects()

  private def randomOccupation() : String = {
    val random = Random.nextInt(10) +3
    if (random % 2 == 0) "Student" else "Employee"
  }


}
