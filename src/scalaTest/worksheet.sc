val x = 10
val y = 20

val res1 = if (x>y) x else y

//Matching patterns
val res2 = x > y match {
  case true => x
  case false => y
}

val status = 500
val message = status match {
  case 200 => "OK"
  case 400 => {println("Error - we called the incorrect service"); "error" }
  case 500 => {println("Error - the service encountered an error"); "error"}
}


val day = "Monday"
val kind = day match {
  case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday"  => "Weekday"
  case "Saturday" | "Sunday" => "Weekend"
  case _ => "ERROR"
}

val msg = "Ok"
val status2 = msg match {
  case "Ok" => 200
  case _ => {println(s"Couldn't parse $msg"); -1}
}













