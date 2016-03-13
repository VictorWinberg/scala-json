
package util

import java.io.PrintWriter

object MarkDown {

  def arrayToMD(array: Array[_ <: Any], fields: String*): Unit = {
    val sb = new StringBuilder()
    for(i <- 0 to fields.length - 1) {
      sb.append(fields(i) + " | ")
    }
    sb.delete(sb.length - 3, sb.length).append("\n")
    for(i <- 0 to fields.length - 1) {
      sb.append("----|")
    }
    sb.delete(sb.length - 1, sb.length).append("\n")
    array.foreach {
      p =>
        sb.append(p + "\n")
    }
    val pw = new PrintWriter("resources/list.md")
    pw.print(sb)
    pw.close()
  }
}