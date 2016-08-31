object FunctionalCombinators {
	def timesTwo(i: Int) = i*2

	def main(args: Array[String]): Unit = {
		var numbers = List(1,2,3,4)
		println(numbers)

		val twiceNumbers = numbers.map((i: Int) => i*2)
		println(twiceNumbers)

		val thriceNumbers = numbers.map { number =>
					number*3
				    }
		println(thriceNumbers)

		val add10Numbers = numbers.map(i => i+10)
		println(add10Numbers)

		// map evaluates a function over each element in the list,
		// returning a list with the same number of elements.		
		println(numbers.map(timesTwo))

		// removes any elements where the function you pass in evaluates to false. 		  // Functions that return a Boolean are often called predicate functions.
		println(numbers.filter(i => i%2 == 0))

		// zip aggregates the contents of two lists into a single list of pairs.
		println(List(1,2,3).zip(List("a", "b", "c")))

		numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		// partition splits a list based on where it falls with 
		// respect to a predicate function.
		println(numbers.partition(n => n%2 == 0))

		// find returns the first element of a collection that 
		// matches a predicate function.
		println(numbers.find(i => i > 5))

		// drop drops the first i elements
		println(numbers.drop(3))
	}
}
