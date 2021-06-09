import scala.collection.mutable.ArrayBuffer

object ArraysDemo extends  App {

  //Immutable Arrays. Size of the array remains fixed but the values inside can be changed.
  var arr = Array(1,2,3)
  for(i <- arr){
    println(i)
  }
  arr(0) = 10;
  arr(2) = 30;
  for(i <- arr){
    println(i)
  }
  //Mutable Arrays
  var words = ArrayBuffer[String]()
  words += "This"
  words += "is New"
  words += "Demo"
  words += "!!"
  for (x <- words) println(x)
  println(words.toString())
  words.remove(3)
  words.foreach(println)
  println(words.toString())

}
