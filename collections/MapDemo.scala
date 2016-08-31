object MapDemo {
	def main(args: Array[String]) {
		val x = Map(1 -> 2)
		val y = Map("foo" -> "bar")
		println(x)
		println(y)

		val z = Map(1 -> "one", 2 -> "two")
		println(z)

		val w = Map((1, "one"), (2, "two"))
		println(w)

		println(w(2))
		// Map.get uses Option for its return type. 
		// Option tells you that the method might not return what you’re asking for.
		println(w.get(1))
		println(w.contains(3))
		println(w.get(4))

	}
}
