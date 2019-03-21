

abstract class UnitCon{
    def convert(value: Double): Double
}
object inchestoFeet extends UnitCon{
    override def convert(value: Double) = value * 0.0833
}
object milestoKms extends UnitCon{
    override def convert(value: Double) = value * 1.609
}
object poundsToKilos extends UnitCon{
    override def convert(value: Double) = value * 0.4535
}


object UnitConvesion {
   def main(args: Array[String]) {

      println("Converting inches to feet : "+inchestoFeet.convert(73))
      println("Converting miles to km  : "+milestoKms.convert(10))
      println("Converting pounds to kg  : "+poundsToKilos.convert(100))
   }
}
