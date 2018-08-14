package scala.bookExamples.object Tree3 {
  trait Tree[+T] {
    def elem: T
    def left: Tree[T]
    def right: Tree[T]
  }

  object EmptyTree extends Tree[Nothing] {
    def elem =
      throw new NoSuchElementException("EmptyTree.elem")
    def left =
      throw new NoSuchElementException("EmptyTree.left")
    def right =
      throw new NoSuchElementException("EmptyTree.right")
  }


  object Branch1 {
    class Branch[T](
      val elem: T,
      val left: Tree[T],
      val right: Tree[T]
    ) extends Tree[T] {

      override def equals(other: Any) = other match {
    case that: Branch[t] => this.elem == that.elem &&
                            this.left == that.left &&
                            this.right == that.right
        case _ => false
      }
    override def hashCode: Int = (elem, left, right).##
    def canEqual(other: Any) = other match {
      case that: Branch[_] => true
      case _ => false
    }
    }
  }

  object Branch2 {
    class Branch[T](
      val elem: T,
      val left: Tree[T],
      val right: Tree[T]
    ) extends Tree[T] {

      override def equals(other: Any) = other match {
    case that: Branch[t] => this.elem == that.elem &&
                            this.left == that.left &&
                            this.right == that.right
        case _ => false
      }
    override def hashCode: Int = (elem, left, right).##
      def canEqual(other: Any) = other.isInstanceOf[Branch[_]]
    }
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

object Tree3 {
  trait Tree[+T] {
    def elem: T
    def left: Tree[T]
    def right: Tree[T]
  }
  
  object EmptyTree extends Tree[Nothing] {
    def elem =
      throw new NoSuchElementException("EmptyTree.elem")
    def left =
      throw new NoSuchElementException("EmptyTree.left")
    def right =
      throw new NoSuchElementException("EmptyTree.right")
  }
  

  object Branch1 {
    class Branch[T](
      val elem: T,
      val left: Tree[T],
      val right: Tree[T]
    ) extends Tree[T] {
    
      override def equals(other: Any) = other match {
    case that: Branch[t] => this.elem == that.elem && 
                            this.left == that.left &&
                            this.right == that.right
        case _ => false
      }
    override def hashCode: Int = (elem, left, right).##
    def canEqual(other: Any) = other match {
      case that: Branch[_] => true
      case _ => false
    }
    }
  }

  object Branch2 {
    class Branch[T](
      val elem: T,
      val left: Tree[T],
      val right: Tree[T]
    ) extends Tree[T] {
    
      override def equals(other: Any) = other match {
    case that: Branch[t] => this.elem == that.elem && 
                            this.left == that.left &&
                            this.right == that.right
        case _ => false
      }
    override def hashCode: Int = (elem, left, right).##
      def canEqual(other: Any) = other.isInstanceOf[Branch[_]]
    }
  }
}
