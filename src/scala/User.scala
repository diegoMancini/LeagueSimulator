package scala

class User (val name: String) {

  def greet = s"Hello, my name is $name"

  override def toString: String = s"User $name"

  def main(args: Array[String]): Unit = {

    val users = List(new User("Diego"), new User("Nicole"))
    val sizes = users map (_.name.length)
    val sorted = users sortBy(_.name)
    val greet = (users find (_.name contains "D")) map (_.greet) getOrElse "Hi"


  }
}
