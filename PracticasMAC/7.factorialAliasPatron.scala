def Fact(x: Int): Int = {
	if( x < 0 ) 0
	else{
		x match{
			case 0 => 1
			case 1 => 1
			case _ => x*Fact(x-1)
		}
	}
}
/*
scala> Fact(-1)
val res37: Int = 0

scala> Fact(0)
val res38: Int = 1

scala> Fact(1)
val res39: Int = 1

scala> Fact(2)
val res40: Int = 2

scala> Fact(3)
val res41: Int = 6

scala> Fact(5)
val res42: Int = 120
*/





//Con un objeto por parametro
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