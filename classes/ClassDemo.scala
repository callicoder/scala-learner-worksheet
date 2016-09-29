class Calculator {
	val brand: String = "HP"	
	def add(m: Int, n: Int): Int = m + n
}

object ClassDemo {
	def main(args: Array[String]): Unit = {
		val calc = new Calculator
		println(calc)
		println(calc.brand)
		println(calc.add(2,3))
	}
}
