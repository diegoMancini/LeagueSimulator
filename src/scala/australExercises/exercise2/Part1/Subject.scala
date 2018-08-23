package scala.australExercises.exercise2.Part1

class Subject (val name: String, val studentList: List[Person]) {

  def this (name: String) = {
    this(name, List.empty)
  }

}
