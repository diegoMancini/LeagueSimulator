package scala.australExercises.exercise2.Part1

class Building (val numberOfBuilding : Int, val subjectList : List[Subject] , val pinwheel: Pinwheel ) {

  def this (numberOfBuilding: Int) = {
    this(numberOfBuilding, List.empty, new Pinwheel)
  }
}
