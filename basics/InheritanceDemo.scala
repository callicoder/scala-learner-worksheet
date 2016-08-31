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

class ScientificCalculator(brand: String) extends Calculator(brand) {
	/*
		Change of base formula:  log (x) base a = log (x) base b / log(a) base b
	*/
	def log(m: Double, base: Double) = math.log(m) / math.log(base)

}

class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
	// Overloading Methods
	def log(m: Double): Double = log(m, math.exp(1))

}

object InheritanceDemo {
	def main(args: Array[String]): Unit = {
				
	}
}
