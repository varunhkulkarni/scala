import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object JavaLibInScala extends App{

  var now : LocalDateTime = LocalDateTime.now()

  println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.SSS")))

}
