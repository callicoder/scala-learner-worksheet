// Option is a container that may or may not hold something.
object OptionDemo {
	def main(args: Array[String]): Unit = {
		// Option itself is generic and has two subclasses: Some[T] or None
		
		// Map.get uses Option for its return type. Option tells you that 
		// the method might not return what you’re asking for.


		val numbers = Map("one" -> 1, "two" -> 2)
		println(numbers.get("two"))

		println(numbers.get("three"))

		// getOrElse lets you easily define a default value.
		println(numbers.getOrElse("three", "-1"))

		// Pattern Matching fits naturally with Option

		val num = numbers.get("one")
		val y = num match {
  			case Some(n) => n * 2
  			case None => 0
		}
		println(y)
	}
}
