// You can define an abstract class, a class that defines some methods but does not 
// implement them. Instead, subclasses that extend the abstract class define these 
// methods. You can’t create an instance of an abstract class.

abstract class Shape {
	def getArea(): Int	// subclass should define this	
}

class Circle(r: Int) extends Shape {
	def getArea(): Int = {
		val area = math.Pi*r*r
		area.toInt	
	}
} 

object AbstractClassDemo {
	def main(args: Array[String]): Unit = {
	        val c = new Circle(2)
	        println(c.getArea())
	}
} 
