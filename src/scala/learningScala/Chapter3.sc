// 1

val name : String = "Diego"
name match {
  case "" => "n/a"
  case n => n
}

// 2

val amount : Double = 100.0

if (amount > 0) "Greater" else if (amount == 0) "Same" else "Lesser"
amount match {
  case x if x>0 => "Greater"
  case x if x==0 => "Same"
  case x if x<0 => "Lesser"
}

// 3

