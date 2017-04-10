object EvaluationRules extends App {
	def x = 2 // evaluated when called
	val y = 2 // evaluated immediately
	lazy val z = 2 // evaluated once when needed

	def square(x: Double) = ???	// call by value
	def square(x: => Double) = ???  // call by name
	def myFunct(bindings: Int*) = {} // bindings is a sequence of int, containing a varying # of arguments
}
