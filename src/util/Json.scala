
package util

import com.google.gson._
import java.io.{ PrintWriter, File }
import scala.io._
import scala.collection.mutable._

object Json {

  def toJson(element: Any, name: String): Unit = {
    val g = new Gson()
    val pw = new PrintWriter(new File("resources/" + name + ".json"))
    pw.println(g.toJson(element))
    pw.close()
  }

  def fromJson[T](c: T, name: String): T = {
    val g = new Gson()
    val input = Source.fromFile("resources/" + name + ".json")
    //g.fromJson[T](input.mkString, T)
    g.fromJson(input.mkString, c.getClass())
  }
}