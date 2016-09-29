object PartialApplication {
	def adder(m: Int, n: Int) = m + n
	
	def main(args: Array[String]): Unit = {
		val add2 = adder(2, _:Int)		
		println(add2(4))
	}
}
