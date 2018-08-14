val test = 1::2::3::4::5::Nil

//1

//default approach
def last[a](intList: List[a]) : a = {intList.last}

//functional approach
def lastRecursive[a](intList:List[a]) : a = {
  intList match {
    case tail :: Nil => tail
    case n :: notLast => lastRecursive(notLast)
    case n =>throw new NoSuchElementException
  }
}

last(test)
lastRecursive(test)
























