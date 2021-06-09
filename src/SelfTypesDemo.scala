trait Person {
  val name : String
}

trait Speaker {
  //this syntax says that Speakers extends Person
  // but this is self types of handling
  this: Person =>

  def speak(words : String) : Unit = println(s"$name says : $words" )
}

//class to implement Speaker
class ClassRoomSpeaker(speakerName: String) extends Speaker with Person {
  override val name: String = speakerName
}

object SelfTypesDemo extends App{

  var classRoomSpearkerObject = new ClassRoomSpeaker("Varun Kulkarni")
  classRoomSpearkerObject.speak("How are you guys !!")

}
