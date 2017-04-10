// Lists preserve order, can contain duplicates, and are immutable.
// (linked list, provides fast sequential access)
object ListDemo {
	def main(agrs: Array[String]): Unit = {
		val numbers = List(1,2,3,4,5,1,2,3,4,5)
		for(number <- numbers) {
			print(number + " ")
		}
		println()
		
		// numbers(2) = 99	 - error: value update is not a member of List[Int]

		for(i <- 0 until numbers.length) {
			print(numbers(i) + " ")
		}
		println()
	}
	
}
