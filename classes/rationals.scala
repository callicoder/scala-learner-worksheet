class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")

	// Custom Constructor
	def this(x: Int) = this(x, 1)

	private def gcd(a: Int, b: Int): Int = {
		if(b == 0) a else gcd(b, a%b) 
	}

	private val g = gcd(x, y)

	val numer = x/g
	val denom = y/g

	def add(that: Rational) = {
		new Rational(numer*that.denom + denom*that.numer, denom*that.denom)
	}

	def + (that: Rational) = { 
		new Rational(numer*that.denom + denom*that.numer, denom*that.denom)
	}

	def neg: Rational = new Rational(-numer, denom)

	def unary_- : Rational = new Rational(-numer, denom)

	def sub(that: Rational) = add(that.neg)

	def lessThan(that: Rational) =  this.numer*that.denom < this.denom*that.numer

	def < (that: Rational) = this.numer*that.denom < this.denom*that.numer	

	def max(that: Rational) = if(this lessThan that) that else this
 
	override def toString = numer + "/" + denom;
}

object rationals {
	def main(args: Array[String]): Unit = {
		val x = new Rational(1, 3)
		println(x)
		val y = new Rational(5, 7)
		println(y)

		println(x.add(y))

		// Infix notation for methods
		println(x add y)

		println(x + y)

		println(x.neg)

		println(-x)
		
		println(x.sub(y))

		println(x.lessThan(y))
		
		println(x.max(y))

		//val strange = new Rational(1, 0)
		//strange.add(strange)
		
		println(new Rational(2))
	}
}
