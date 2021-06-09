//Creating objects is similar to creating the static classes in JAVA.
//Members of the objects can be accessed directly without creating the instance of the object

object MathsUtil {
  def addition(): (Int, Int) => Int = {
     (a: Int, b: Int) => a+b
  }
  def subtraction(a:Int, b: Int) : Int ={
    a-b
  }
  def multiply() : (Int, Int) => Int = {
    (a: Int, b: Int) => a+b
  }
}

object Negate{
  def apply(value : Int) : Int = -value
}


object ObjectsDemo extends  App{
  println(MathsUtil.addition()(10,54))
  println(Negate(22))

}
