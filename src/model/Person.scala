
package model

class Person(name: String, age: Int, program: String) {
  def getName = name
  def getAge = age
  def getProgram = program
  
  override def toString = s"$name | $age | $program"
}