class MyClass(x: Int, y: Int) {	// Defines a new type MyClass with a constructor
	require(y > 0, "y must be positive")	// Precondition, triggering an IllegalArgumentException
	def this(x: Int) = this(x, 1)	// auxiliary constructor
	def nb1 = x		// public method, computed every time it is called
	def nb2 = y
	private def test(a: Int): Int = ???	// private method
	val nb3 = x + y		// Computed only once
	override def toString = x + ", " + y	// overriden method
}

object ClassDemo {
	def main(args: Array[String]): Unit = {
		new MyClass(1,2) // created a new object of type
	}
}
