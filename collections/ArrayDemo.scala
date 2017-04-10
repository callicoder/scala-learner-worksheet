// Arrays preserve order, can contain duplicates, and are mutable.
// Scala arrays are native JVM arrays at runtime, therefore they are very performant
object ArrayDemo {
	def main(args: Array[String]): Unit = {
		val numbers = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		for(x <- numbers) {
			print(x + " ")
		}
		println()
		numbers(1) = 99
		for(i <- 0 until numbers.length) {
			print(numbers(i) + " ")
		}
		println()
	}
}
