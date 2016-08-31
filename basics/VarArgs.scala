object VarArgs {
	def capitalizeAll(args: String*) = {
		args.map{ arg =>
			arg.capitalize
		}
	}

	def main(args: Array[String]): Unit = {
		val capitalizedStrings = capitalizeAll("abc", "xyz")
		println(capitalizedStrings)
	}
}
