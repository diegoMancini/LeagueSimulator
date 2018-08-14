package scala.bookExamples./** These point classes have excellent equals and hashCode methods.
 *  They rely on an canEqual method. */
object Points8 {
  class Point(val x: Int, val y: Int) {
    override def hashCode = (x, y).##
    override def equals(other: Any) = other match {
      case that: Point =>
        (that canEqual this) &&
        (this.x == that.x) && (this.y == that.y)
      case _ =>
        false
    }
    def canEqual(other: Any) = other.isInstanceOf[Point]
  }

  object Color extends Enumeration {
    val Red, Orange, Yellow, Green, Blue, Indigo, Violet = Value
  }

  class ColoredPoint(x: Int, y: Int, val color: Color.Value)
      extends Point(x, y) {

    override def hashCode = (super.hashCode, color).##
    override def equals(other: Any) = other match {
      case that: ColoredPoint =>
        (that canEqual this) &&
        super.equals(that) && this.color == that.color
      case _ =>
        false
    }
    override def canEqual(other: Any) =
      other.isInstanceOf[ColoredPoint]
  }
}equality

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

/** These point classes have excellent equals and hashCode methods.
 *  They rely on an canEqual method. */
object Points8 {
  class Point(val x: Int, val y: Int) {
    override def hashCode = (x, y).##
    override def equals(other: Any) = other match {
      case that: Point =>
        (that canEqual this) &&
        (this.x == that.x) && (this.y == that.y)
      case _ =>
        false
    }
    def canEqual(other: Any) = other.isInstanceOf[Point]
  }

  object Color extends Enumeration {
    val Red, Orange, Yellow, Green, Blue, Indigo, Violet = Value
  }

  class ColoredPoint(x: Int, y: Int, val color: Color.Value) 
      extends Point(x, y) {
  
    override def hashCode = (super.hashCode, color).##
    override def equals(other: Any) = other match {
      case that: ColoredPoint =>
        (that canEqual this) &&
        super.equals(that) && this.color == that.color
      case _ =>
        false
    }
    override def canEqual(other: Any) =
      other.isInstanceOf[ColoredPoint]
  }
}
