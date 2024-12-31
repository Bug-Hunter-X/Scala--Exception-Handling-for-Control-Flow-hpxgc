```scala
class MyClass(val name: String) {
  def myMethod(x: Int): Option[Int] = {
    if (x > 0) Some(x + 1) else None 
  }
}

object Main extends App {
  val obj = new MyClass("MyObject")
  val result = obj.myMethod(-1) 
  println(result match {
    case Some(value) => value
    case None => "Input is not positive"
  })

  println(obj.myMethod(5).getOrElse(0)) //Using getOrElse for concise handling
}
```