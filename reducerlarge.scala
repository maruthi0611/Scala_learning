

object reducerlarge extends App{
  val randomArray = Seq.fill(5)(scala.util.Random.nextInt(20))
	val max = randomArray.reduceLeft((x,y) => if(x>y) x else y)
	println(randomArray)
	println(max)
}