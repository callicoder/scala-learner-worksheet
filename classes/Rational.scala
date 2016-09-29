class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y
}

object rationals {
	def main() = {
		val x = new Rational(1, 2)
	}
}
