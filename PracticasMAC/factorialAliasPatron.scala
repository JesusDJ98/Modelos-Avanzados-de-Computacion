class Salida(x: Int, y: String) {
	private var number: Int = x
	private var s: String = y
	
	def getS = s
	def getNumber = number

	override def toString(): String = "" + s + ": " + number;
}
	

def factorial(x: Int): Salida = {
	if(x == 0) new Salida(1, "Factorial")
	else{
		if(x>0) new Salida(x*factorial(x-1).getNumber, "Factorial")
		else new Salida(0, "Error")
	}
}

/*
El patron introducido es un objeto que sera la salida

scala> factorial(23)
val res4: Salida = Factorial: 862453760

scala> factorial(2)
val res5: Salida = Factorial: 2

scala> factorial(5)
val res6: Salida = Factorial: 120

scala> factorial(0)
val res7: Salida = Factorial: 1

scala> factorial(-1)
val res8: Salida = Error: 0
*/