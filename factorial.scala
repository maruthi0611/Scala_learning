

object factorial {
  def reduceFac(value: Int) = {
	    if(value > 0) {
	        (1 to value).reduceLeft(_ * _)
	    }
	    else {
	        -1 * (1 to math.abs(value)).reduceLeft(_ * _)
	    }
	}
}

object factcall extends App {
  println(factorial.reduceFac(5))
}