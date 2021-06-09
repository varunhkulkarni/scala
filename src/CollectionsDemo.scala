import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object CollectionsDemo {

  def main(args: Array[String]): Unit = {

    //--------------------------
    //---------# Arrays--------
    //--------------------------
    //ImmutableList
    val immutableList = List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (x <- immutableList) println(x)
    println("---------------------------")
    //Mutable List
    val mutableList = ListBuffer[Int]()
    mutableList.append(1)
    mutableList.append(2).append(3).appendAll(List(4,1,2))
    mutableList.foreach(println)

    println("---------------------------")
    //Prepend or append the values to the list
    val mutableList2 = ListBuffer[Int]()
    mutableList2.appendAll(List(2,3,4,5))
    val newList = 1 +: mutableList2 :+ 6 :++ List(7,8,9)
    newList.foreach(println)

    println("---------------------------")
    //collections and lambdas
    val list = List[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    list.map(num => num + "th").foreach(println)
    println("---------------------------")
    list.map(_ + "thNew").foreach(println)
    println("---------------------------")
    //map with filler
    list.filter(num => num%2==0).map(num => num+100).foreach(println)
    println("---------------------------")
    list.filter(_ % 2 == 0).map(_ + 100).foreach(println)

    //--------------------------
    //---------# Maps ----------
    //--------------------------

    val immutableMap = Map(
      "India" -> "Mumbai",
      "Germany" -> "Berlin",
      "UK" -> "London",
      "US" -> "New York",
    )
    val value = immutableMap.get("India")
    println(if (value.isDefined) value.get else "Key is not valid")
    println("---------------------------")

    immutableMap.keys.foreach(key => println(immutableMap.get(key).orNull))
    println("---------------------------")
    immutableMap.keys.foreach(println)
    immutableMap.values.foreach(println)
    println("---------------------------")
    immutableMap.foreach(x => println(x._1 + " " + x._2))

    println("---------------------------")

    //Mutable Maps
    val mutableMap = mutable.Map[String, String]()
    mutableMap.put("Varun","Kulkarni")
    mutableMap.put("Vipul", "Jain")
    mutableMap.put("Uday", "Tiwari")
    mutableMap.foreach(x => println(s"${x._1} - ${x._2}"))

    println("---------------------------")
    mutableMap.put("Varun", "Kulkarni-Wankhed")
    mutableMap.foreach(x => println(s"${x._1} - ${x._2}"))

    println("---------------------------")
    mutableMap.remove("Uday")
    mutableMap.foreach(x => println(s"${x._1} - ${x._2}"))

  }

}
