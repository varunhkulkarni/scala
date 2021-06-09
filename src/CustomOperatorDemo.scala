case class TriangleSide(a : Int, b: Int, c: Int) {

  def +(triangleSide: TriangleSide) : TriangleSide = {
    TriangleSide(this.a+triangleSide.a, this.b + triangleSide.b, this.c + triangleSide.c)
  }
}

object CustomOperatorDemo extends App{
  println(TriangleSide(1,2,3) + TriangleSide(3,2,1))
}
