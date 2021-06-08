import scala.util.Random

object StringInterpolationDemo extends App{

  var firstName : String = "John"
  var lastName : String = "Smith"
  //String literals
  println(s"My Name is $firstName $lastName")

  println(s"Random Number is : ${Random.nextInt(1000)}")


}
