/**
  * Created by Administrator on 05/06/2017.
  */
object isEven {

  def isEven(number: Int): Boolean = {
    if (number % 2 == 0)
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {
    println(isEven(3))
    println(isEven(10))
  }
}
