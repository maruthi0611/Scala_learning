import io.Source

object sampleread extends App{
  
	val source = Source.fromFile("D:/scalatest/sampleread.txt")
	val lines = source.getLines.toArray
	println(lines.mkString)
	println("********************************")
	val revLines = lines.reverse
	println(revLines.mkString)

}