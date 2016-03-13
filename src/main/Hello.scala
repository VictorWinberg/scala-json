
package main

import scala.collection.mutable.ArrayBuffer
import scala.io._
import model.Person

object Hello {
  
  def makePersonTable(): Array[Person] = {
    val persons = new ArrayBuffer[Person]()
    
    try {
      while (true) {
        print("Name ")
        var name = StdIn.readLine().trim()
        print("Age ")
        var age = StdIn.readInt()
        print("Program ")
        var program = StdIn.readLine().trim()
        var p = new Person(name, age, program)
        println(p)
        persons += p
      }
    } catch {
      case e: Exception => println("Exit successful")
    }
    
    return persons.toArray
  }
}