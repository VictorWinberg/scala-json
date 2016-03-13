
import java.io.PrintWriter

object MarkDown {

  def main(args: Array[String]): Unit = {
    toMD()
  }

  def toMD(): Unit = {
    val sb = new StringBuilder()
    sb.append("Name | Age | Program\n")
    sb.append("-----|-----|--------\n")
    Json.fromJson().foreach {
      p =>
        sb.append(
          p.getName + " | " +
          p.getAge  + " | " +
          p.getProgram + "\n")
    }
    val pw = new PrintWriter("people/list.md")
    pw.print(sb)
    pw.close()
  }
}