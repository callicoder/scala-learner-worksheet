class Calculator(brand: String) {
	val color: String = if(brand == "TI") {
		"blue"
	} else if (brand == "HP") {
		"black"
	} else {
		"white"
	}
	// Instance Method	
	def add(m: Int, n: Int): Int = m + n
}

object ConstructorDemo {
	def main(args: Array[String]): Unit = {
		val calc = new Calculator("HP")
		println(calc)
		println(calc.color)
		println(calc.add(2,3))
	}
}
