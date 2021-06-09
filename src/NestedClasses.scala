class OuterClass(value : Int) {

  //defining the inner class within the class
  class InnerClass(innerValue : Int){
    def printInnerClassMethod() : Unit = println(s"Inner Class Method with Value .. $innerValue")
  }

  def printOuterClassMethod() : Unit = println(s"Outer Class Method with Value .. $value")

  //Inner class can only be instantiated by outer class method only
  def createInnerClassObject(value : Int) : InnerClass = new InnerClass(value)
}

object NestedClasses extends App{

  var outerClass = new OuterClass(10);
  outerClass.printOuterClassMethod();

  var innerClass = outerClass.createInnerClassObject(40);

  innerClass.printInnerClassMethod()


}
