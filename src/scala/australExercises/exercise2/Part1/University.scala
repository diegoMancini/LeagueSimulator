package scala.australExercises.exercise2.Part1

class University (val name: String, val data: (List[Building], List[Person], List[Subject])) {

  def this (name : String) = {
    this(name, (List.empty, List.empty, List.empty))
  }

}

