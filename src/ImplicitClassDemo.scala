object ImplicitClassDemo {

  // this is way of creating the implicit class.
  // We can access the methods of the implicit without creating the objects of the implicit classes
  implicit class InnerClass(count : Int){
    def someFunction(words : String) (implicit upper : Boolean) = {
      for (x <- 0 until count){
        if(upper) println(words.toUpperCase()) else println(words.toLowerCase())
      }
    }
  }
}
