import scala.util.Random
import scala.util.matching.Regex

trait Book {
  val author : String
  val title : String
}

case class Nonfictional(author : String, title :String, topic : String) extends Book
case class Stories(author : String, title :String, aboutPerson : String) extends Book
case class BioGraphy(author : String, title :String, genre : String) extends Book
case class Jokes(author : String, title :String) extends Book

object PatternMatchingDemo{

  def main(args: Array[String]): Unit = {
    switchCaseDemo
    tuplesDemo
    println(switchCaseWithClassObjects(Nonfictional("Varun", "Varun Nonfiction Book", "Phy")))
    println(switchCaseWithClassObjects(BioGraphy("Varun", "Varun Nonfiction Book", "Phy")))

    val regex = "[A-Z]".r
    val value = "dfasdfGGfdsfds"
    regexMatching(value,regex)
  }

  //switch case demo. we can have the switch case in the scala similar to JAVA
  // There is no break statement required
  // _ means the default case for the switch statement
  private def switchCaseDemo = {
    val randomInt = Random.nextInt(4)
    val switchCaseOutput = randomInt match {
      case 0 | 2 => "Zero or Twos"
      case 1 => "One"
      case 3 => "Three"
      case _ => "Other"
    }
    println(s"$switchCaseOutput")
  }

  def tuplesDemo() = {
    val tuples = List((1,2), (3,4), (5,6))
    //this is one of the way  of implementing the for loop
    tuples.foreach((tuple) => {
      println(s"Left : ${tuple._1}, Right : ${tuple._2}")
    })
    //another way
    tuples.foreach{
      case (left, right) => println(s"Left : ${left}, Right : ${right}")
    }
  }

  private def switchCaseWithClassObjects(book: Book) : String = {
    val output = book match {
      case
        Nonfictional(author, title, topic) => s"Author is : $author with Topic :$topic"
      case Jokes(author, title) => s"Jokes Book Title : $title"
      case _ => s"Un-identified Book"
    }
    output
  }

  private def regexMatching(value : String, regex: Regex): Unit ={
    //first way of getting value is by using optional
    //easy way of doing that
    val mayBeMatchingValue = regex.findFirstIn(value)
    println(mayBeMatchingValue.getOrElse("Nothing matching...."))

    //second way of doing it using : switch case
    // hard way
    regex.findFirstIn(value) match {
      case Some(value) =>  println(s"Value Found : $value")
      case None => println("Found Nothing")
    }

    regex.findAllIn(value).foreach(print)
  }
}
