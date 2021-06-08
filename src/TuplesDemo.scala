object TuplesDemo extends App{

  var coordinates = (5.6 , 7.8)
  println(coordinates)
  println(coordinates._1 + " " + coordinates._2 )
  // tuples can be created with 22 elements
  //There is no data type for Tuples
  var anotherTuple = ( "Hello", true, 1, 11.2, 100000.3f)
  println(anotherTuple._1 + " " + anotherTuple._2)

  var person = ("Varun", 31)

  var (name, age) = person

  println(name + " " + age)





}
