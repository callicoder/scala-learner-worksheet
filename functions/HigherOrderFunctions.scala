/*
Scala allows the definition of higher-order functions. These are functions that take other functions as parameters, or whose result is a function
*/
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}

object HigherOrderFunctions extends App {
  def apply(f: Int => String, v: Int) = f(v)
  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
}
