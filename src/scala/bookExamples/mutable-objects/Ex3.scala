package scala.bookExamples.mutable-objects

/*
 * Copyright (C) 2007-2016 Artima, Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Example code from:
 *
 * Programming in Scala, Third Edition
 * by Martin Odersky, Lex Spoon, Bill Venners
 *
 * http://booksites.artima.com/programming_in_scala_3ed
 */


class Keyed {
  def computeKey: Int = { // implementation for testing
    Thread.sleep(1000)
    123
  }
}

class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None
  override def computeKey: Int = {
    if (!keyCache.isDefined) keyCache = Some(super.computeKey)
    keyCache.get
  }
}

object Ex3 {
  def main(args: Array[String]) {
    val memoKeyed = new MemoKeyed
    val keyed = new Keyed
    
    println("start...");
    println("keyed.computeKey [" + (keyed.computeKey) + "]")
    println("memoKeyed.computeKey [" + (memoKeyed.computeKey) + "]")
    println("memoKeyed.computeKey [" + (memoKeyed.computeKey) + "]")
  }
}
