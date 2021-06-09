import ImplicitClassDemo._
object ImplicitClassRunner extends App{

  //this syntax says : pass 5 as counts to helper object in the constructor and rest is passed as the function value
  implicit var toUpper = true;
  5 someFunction("These are my words...")

}
