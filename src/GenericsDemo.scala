
//This is to define the generics for the class.
//A can be any class
class Holder[A](value: A){
  def printClassName() : String =value.toString
}

object GenericsDemo extends  App {

  var stringHolder = new Holder[String]("Hello world")

  var intHolder = new Holder[Int](22)

  println(stringHolder.printClassName())
  println(intHolder.printClassName())
}
