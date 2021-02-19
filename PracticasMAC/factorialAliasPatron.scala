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
En Scala solo hay alias para tipos de variables
def factorial(m: Int, x: Int = (m-1)):
*/