trait Animal
trait Pet
trait NonPet

class cat extends Animal with Pet{
}
class Tiger extends Animal{
}

class Dog extends Animal with Pet with NonPet{
}


object CompoundTypesDemo extends  App{
  def printAnyAnimal(animal: Animal):Unit = {
    println(s"Printing Animal.... ${animal.toString}")
  }
  printAnyAnimal(new cat)
  printAnyAnimal(new Tiger)
  printAnyAnimal(new Dog)

  def printOnlyPetAnimal(animal: Animal with Pet): Unit = {
    println(s"Printing Pet.... ${animal.toString}")
  }
  printOnlyPetAnimal(new cat)
  printOnlyPetAnimal(new Dog)
  //this will not allowed since tiger is not pet
  //printOnlyPetAnimal(new Tiger)

  def printOnlyPetAndNonPetAnimal(animal: Animal with Pet with NonPet) : Unit = {
    println(s"Printing Pet and Non Pet.... ${animal.toString}")
  }
  printOnlyPetAndNonPetAnimal(new Dog)
  //Below are not allowed
  //printOnlyPetAndNonPetAnimal(new cat)
  //printOnlyPetAndNonPetAnimal(new Tiger)
}
