/**
  * Created by Administrator on 05/06/2017.
  */
object welcomeUser {

  def welcomeUser (name: String, blh: Double): Unit = {
    println("Hello,"+name + "\nNumber: " +blh)
  }

  def main(args: Array[String]): Unit = {

    println(welcomeUser("this is name ",4.3))

    println(welcomeUser("this has name ",20.0))

  }
}



