package main

import util._
import model._

object Main {
  
  def main(args: Array[String]): Unit = {
    var arr = Array(new Person("No", 1, "No"))
    val persons = Json.fromJson[Array[Person]](arr, "persons")
    MarkDown.arrayToMD(persons, "Name", "Age", "Program")
  }
}