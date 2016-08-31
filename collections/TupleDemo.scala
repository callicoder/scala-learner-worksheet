// A tuple groups together simple logical collections of items without using a class.
// Unlike case classes, they don’t have named accessors, instead they have accessors 
// that are named by their position and is 1-based rather than 0-based.
object TupleDemo {
	def main(args: Array[String]) {
		val hostPort = ("localhost", 80)
		println(hostPort)

		println("host = " + hostPort._1)
		println("port = " + hostPort._2)

		val hostPortSpecialSyntax = "localhost" -> 80
		println(hostPortSpecialSyntax)
	}
}
