def FactorialNatural(x: Int): Int = {
	if( x < 0) 0
	else
		if(x==1 || x==0) 1
		else x* FactorialNatural(x-1)
}

def FactorialEntero(x: Int): Int = {
	if(x >= 0)
		if(x==1 || x==0) 1
		else x* FactorialEntero(x-1)
	else
		if(x==(-1)) -1
		else x*FactorialEntero(x+1)
}

/* Salida:
scala> FactorialNatural(0)
val res9: Int = 1

scala> FactorialNatural(5)
val res10: Int = 120

scala> FactorialNatural(-5)
val res11: Int = 0

scala> FactorialEntero(0)
val res12: Int = 1

scala> FactorialEntero(5)
val res13: Int = 120

scala> FactorialEntero(-5)
val res14: Int = -120

scala> FactorialEntero(-4)
val res15: Int = 24

*/
