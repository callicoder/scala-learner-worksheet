object Function {
	def addOne(m: Int): Int = m + 1

	def timesTwo(m: Int): Int = {
		val result = m * 2
		result
	}
	
	def three() = 1+2

	def main(args: Array[String]): Unit = {
		println(addOne(1))		
		println(three())
		println(three)

		println(timesTwo(2))

		val incAnon = (x: Int) => x+1
		println(incAnon(1))

		val multiLineAnon = { (x: Int) => 
			var result = x * 2
			result - 1
		}
		println(multiLineAnon(2))
	}
}
