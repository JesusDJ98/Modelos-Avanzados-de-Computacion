def funcionTupla(op1: Char, x: Double, op2: Char) = {
	var uno = opciones(op1,x)
	var dos = opciones(op2,x)
	if( uno == None || dos == None) "Error"
	else uno.toString.toDouble+dos.toString.toDouble
		

	//(x.op1(x))+ x.op2(x)
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