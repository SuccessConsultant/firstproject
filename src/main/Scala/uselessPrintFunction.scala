/**
  * Created by Administrator on 05/06/2017.
  */
object uselessPrintFunction {

  def uselessPrintFunction(): Unit = {
    print("All I do is win win win no matter what!")
  }

  def taxCalculator(amount: Double, taxPercentage: Int): Double = {
    (amount / 100) * taxPercentage
  }

  uselessPrintFunction()
  taxCalculator(1450, 20)

  def main(args: Array[String]): Unit = {
   uselessPrintFunction()
    println(taxCalculator(20, 2))
  }

}



