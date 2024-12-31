```scala
class MyClass(val name: String) {
  def myMethod(x: Int): Int = {
    if (x > 0) x + 1 
    else throw new IllegalArgumentException("x must be positive")
  }
}

object Main extends App {
  val obj = new MyClass("MyObject")
  try {
    println(obj.myMethod(-1))
  } catch {
    case e: IllegalArgumentException => println("Caught exception: " + e.getMessage())
    case e: Exception => println("Caught another exception: " + e.getMessage()) 
  }
}
```