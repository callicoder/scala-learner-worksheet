/*
In scala parameters to functions are passed by value, i.e. the value of the parameter is determined before it is passed to the function. 
But what if we need to write a function that accepts as a parameter an expression that we don't want evaluated until it's called within our function? For this circumstance, Scala offers call-by-name parameters. */

object CallByName {
   def main(args: Array[String]) {
        delayed(time());
   }

   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
   }
}
