//Traits are similar to interfaces in JAVA.
//They can have the abstract methods and constant variables

trait Fruit {
  //creating a constant with value 10
  val calories : Int = 10
  //defining the another constant but with no value
  val color : String
  //abstract function
  def eat(): Unit
}

trait Toy {
  def play():Unit
}

//Creating the class similar to JAVA class
//In scala you can create the constructor while creating the class itself
//Defining parameters in the constructor automatically creates the fields in the class
//classes can override multiple interfaces
class Apple(override val color: String = "Red", var gram : Int = 30) extends Fruit with Toy {
  //Overriding the function from the interface
  override def eat(): Unit = {
    println(s"Eating Apple with Calories : $calories and Color : $color")
  }
  override def toString: String = {
    return s"Color $color / Gram : $gram / Calories : $calories"
  }
  override def play(): Unit = {
    println("This is apple Toy Method ..")
  }
}

object ObjectOrientedProgramming extends  App {

  //creating a default object
  var apple = new Apple()
  println(apple.toString)
  apple.eat()

  var newApple = new Apple(color =  "Green", gram = 44)
  println(newApple.toString)
  newApple.eat()
  newApple.play()


}




