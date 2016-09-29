// List(1, 2, 3) map squared applies the function squared to the elements of the list, 
// returning a new list, perhaps List(1, 4, 9). We call operations like map combinators.

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


		// foreach is like map but returns nothing. foreach is intended 
		// for side-effects only.
		val doubled = numbers.foreach((i: Int) => i * 2)
		println(doubled)

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

		// foldLeft
		// 0 is the starting value, m acts as an accumulator
		val totalSum = numbers.foldLeft(0) { (m: Int, n: Int) => {
				println("m: " + m + " n: " + n); 
				m + n
			} 
		}
		println(totalSum)

		// foldRight
		// Is the same as foldLeft except it runs in the opposite direction.
		// Here 0 is the starting value and n acts as an accumulator
		val totalSumFromRight = numbers.foldRight(0) { (m: Int, n: Int) => {
				println("m: " + m + " n: " + n); 
				m + n 
			}
		}
		println(totalSumFromRight)

		// flatten collapses one level of nested structure.
		// Converts List of Lists to a single List
		println(List(List(1,2), List(3,4)).flatten)

		// flatMap is a frequently used combinator that combines mapping and 
		// flattening. flatMap takes a function that works on the nested lists 
		// and then concatenates the results back together.

		val nestedNumbers = List(List(1, 2), List(3, 4))
		val flattenedDoubledNumbers = nestedNumbers.flatMap(x => x.map(_ * 2))
		println(flattenedDoubledNumbers)
	}
}

