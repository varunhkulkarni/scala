
object FunctionsDemo {

  def main(args: Array[String]): Unit = {
    //calling function with both the parameters
    val result = addition(10, 22)
    println(result)
    println(addition(a= 10, b = 2))
    // result be 3
    println(addition(b=2))

    //call the parameters with the default parameter values
    println(addition()) // result will be 1

    //now calling the wrapper function
    println(additionalFunction()(10,54))

    //function with lambda
    println(additionalFunctionWithLambda()(10,54))

    //compact functions with same results
    println(subComp(44,4))
    println(subFunctionComp()(55,5))

    //nested functions test

    println(multiply(10,2))
    println(multiply(a=2))
    println(multiply(b=12))

    //passing function as a parameter
    println(applyThis(10,4,additionalFunction())) //return 14
    println(applyThis(10,4,subFunctionComp())) // return 6
    //this does not work in this version. But
    //println(applyThis(10,4,multiSimple())) // return 40

    //passing function a second parameter

    println(applyThis2(22,2)(subFunctionComp()))
    println(applyThis2(33,4)(additionalFunction()))

    //Implicit parameters are parameters which are defined as constant
    println(addConstant(10));
  }
  //creating a function in a scala. We can add the default values for the parameters if they are not passed
  // So it is not mandatory to pass all the parameters to the function
  def addition(a: Int = 1, b: Int = 0) : Int = {
    val result = a + b;
    result
  }
  //this is another way of wrapping up the function into another function
  // here we can the function
  def additionalFunction(): (Int, Int) => Int = {
    addition
  }
  //Calling function with lambda
  def additionalFunctionWithLambda(): (Int, Int) => Int = {
    (a: Int,b : Int) => a-b
  }
  //compacting above function more
  def subComp (a:Int, b: Int) : Int = a-b
  def subFunctionComp() : (Int, Int) => Int = (a:Int, b: Int) => a-b

  //Nested functions :

  def multiSimple (a:Int, b: Int) :Int = {
    def innerMultiply(a: Int, b: Int) : Int = {
      a*b
    }
    innerMultiply(a,b)
  }

  def multiply( a: Int = -1,b : Int = -1 ) : Int ={
    def multBoth(c : Int, d: Int) : Int = {
      c*d
    }
    def multiOne(c: Int) : Int = {
      10*c
    }
    if(a != -1 && b != -1){
        multBoth(a,b)
    }else if(a == -1){
      multiOne(b)
    }else {
      multiOne(a)
    }
  }

  def applyThis(a: Int, b :Int, apply: (Int, Int) => Int) : Int = {
    apply(a,b)
  }

  def applyThis2(a: Int, b: Int)(apply:(Int, Int) => Int) : Int = {
    apply(a,b)
  }

  //implicit functions
  def addConstant(a: Int)(implicit add : Int) : Int = {
    a+add
  }
  implicit val addConstant: Int  = 100

}
