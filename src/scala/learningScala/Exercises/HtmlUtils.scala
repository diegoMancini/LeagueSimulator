package scala.learningScala.Exercises

object HtmlUtils {

  def removeMarkup(input: String) = {
    input.replaceAll("""</?\w[^>]*>""", "") replaceAll("<.*>", "")
  }

}
