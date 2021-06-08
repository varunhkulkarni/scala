object LoopsDemo extends App{

  var i : Int = 0;

  while(i<5){
    println("Value of i= " , i)
    i+=1
  }
  println("-------------------------")
  //include with 10
  for (i <- 1 to 10){
    println("Value of i inside forLoop", i)
  }
  println("-------------------------")
  // exclude 10
  for (j <- 0 until(10)){
    println(s"New For Loop $j")
  }
  println("-------------------------")
  //Get the output of the for loop for each iteration into a array
  var arrayOfSqs = for(i <- 1 to 10 ) yield i*i
  for(j <- arrayOfSqs){
    println(j)
  }
  println("-------------------------")
  //Get only even numbers with output of the for loop based on the conditions
  var arrayOfEvenNums = for(i <- 1 to 10 if i%2==0 ) yield i
  for(j <- arrayOfEvenNums){
    println(j)
  }
  println("-------------------------")

  //Nested for loops
  // for each value of i, j will run from 6 to 10
  for(i <- 1 to 5; j <- 6 to 10){
    println(s" $i --> $j")
  }
  println("-------------------------")

}
