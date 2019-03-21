

object printchar extends App{
  val longWords = for(a <- io.Source.fromFile("D:/scalatest/sampleread2.txt").mkString.split(' ') if a.length >= 12) yield a
  println(longWords.mkString)
}