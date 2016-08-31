//Sets do not preserve order and have no duplicates
object SetDemo {
	def main(args: Array[String]): Unit = {
		val numbers = Set(1,2,3,4,5,6,7,8)
		for(number <- numbers) {
			print(number + " ")
		}
		println()
		
		val it = numbers.iterator
		while(it.hasNext) {
			print(it.next() + " ")
		}			
		println()	
	}
}
