//Trabajando de forma imperativa
def funcionTupla(op1: Char, x: Double, op2: Char) = {
	var uno = opciones(op1,x)
	var dos = opciones(op2,x)
	if( uno == None || dos == None) "Error"
	else uno.toString.toDouble+dos.toString.toDouble
}

def opciones (op: Char, x: Double) = {
	op match {
		case '+' => x+x
		case '*' => x*x
		case '/' => x/x
		case '-' => x-x
		case _ => None
	}
}

/*
scala> funcionTupla('p',a,'*')
val res133: Any = Error

scala> funcionTupla('+',a,'a')
val res134: Any = Error

scala> funcionTupla('+',3,'*')
val res135: Any = 15.0

scala> funcionTupla('+',a,'*')
val res136: Any = 8.0
*/






//Trabajando de forma funcional
def funcionTupla2(f1: Double => Double, x: Double, f2: Double => Double) = f1(x) + f2(x)
def funcionTupla3(f1: Double => Double, x: Double, f2: Double => Double) = f1(f2(x))
/*
scala> funcionTupla2(_*2, 4, _+3)
val res92: Double = 15.0

scala> funcionTupla3(_*2, 4, _+3)
val res94: Double = 14.0
*/






//Trabajando de forma funcional con tuplas
def funcionTupla4(a: (Double => Double, Double, Double => Double)) = a._1(a._2) + a._3(a._2)
def funcionTupla5(a: (Double => Double, Double, Double => Double)) = a._1(a._3(a._2))
/*
scala> a
val res104: (Double => Double, Double, Double => Double) = ($Lambda$1360/0x0000000100854840@10dd6d29,4.0,$Lambda$1361/0x0000000100853840@3b322f9d)

scala> funcionTupla4(a)
val res105: Double = 15.0

scala> funcionTupla5(a)
val res106: Double = 14.0

scala> funcionTupla2(a)
                    ^
       error: not enough arguments for method funcionTupla2: (f1: Double => Double, x: Double, f2: Double => Double): Double.
       Unspecified value parameters x, f2.

scala> funcionTupla3(a)
                    ^
       error: not enough arguments for method funcionTupla3: (f1: Double => Double, x: Double, f2: Double => Double): Double.
       Unspecified value parameters x, f2.

scala> funcionTupla4(_*2, 4, _+3)
val res109: Double = 15.0

scala> funcionTupla5(_*2, 4, _+3)
val res110: Double = 14.0
*/