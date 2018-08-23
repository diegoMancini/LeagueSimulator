package scala.learningScala.Exercises

class Console (val make: String, val model: String, val year: java.util.Date, val wifi : String, physicalMediaFormats: List[String], maxVideoResolution: (Int, Int)){

  override def toString: String = s"This console is called $make $model, and debuted ${year.toString}"

}
