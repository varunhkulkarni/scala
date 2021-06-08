object ConditionalStatementsDemo extends  App{

  var flag : Boolean  = true;

  if(flag){
    println("This is true")
  }else{
    println("This is false")
  }

  var str : String = "Varun"

  if(str.contains("arun")){
    println("Name is Varun")
  }else{
    println("Name is not varun")
  }

  println(if(!flag) "TRUE" else "FALSE")


}
