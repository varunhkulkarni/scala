
//cases classes are final classes in scala. Once Object is created value cannot be changed
case class Article(title: String, author: String, pages : Int){

  override def toString: String = {
    s"{Title = $title, Author = $author, Pages = $pages }"
  }
}

object CaseClassesDemo extends  App{
  var classObject = new Article("My First Book", "Varun Kulkarni", 10)
  println(classObject.toString)

  //this is not permitted since class is final
  //classObject.title = "My Second Book";

  //you can create deep copy of the object

  var anotherClassObject = classObject.copy(title = "My Second Book")

  println(anotherClassObject.toString)

}
