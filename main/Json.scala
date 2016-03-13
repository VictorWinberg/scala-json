import com.google.gson._
import java.io.{PrintWriter, File}
import scala.io._
import scala.collection.mutable._

object Json {
	val g = new Gson();
	
  def main(args: Array[String]): Unit = {
	  toJson()
	  fromJson()
  }
	
	def toJson() : Unit = {
	  val persons = new ArrayBuffer[Person]()
	  try{
	    while(true) {
  		  print("Name ")
  		  var name = StdIn.readLine().trim()
  		  print("Age ")
  		  var age = StdIn.readInt()
  		  print("Program ")
  		  var program = StdIn.readLine().trim()
  		  var p = new Person(name, age, program)
  		  p.toString()
  		  persons += p
  		}
	  } catch {
	    case e: Exception => // TODO: handle error
	  }
	  val output = new PrintWriter(new File("people/persons.json"))
    output.println(g.toJson(persons))
    output.close()
	}
	
	def fromJson() : Unit = {
		val input = Source.fromFile("people/persons.json")
	  println(g.fromJson(input.mkString, classOf[ArrayBuffer[Person]]))
	}
  
  class Person(name: String, age: Int, program: String) {
    def getName = name
    def getAge = age
    override def toString = s"Name: $name, Age: $age, Program $program"
  }
}