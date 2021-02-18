def funcionTuplaBoolAnd (op1: Char, x: Boolean, op2: Char) = {
	var uno = opcionesB1(op1,x)
	var dos = opcionesB1(op2,x)
	if( uno == None || dos == None) "Error"
	else uno.toString.toBoolean & dos.toString.toBoolean
}


def opcionesB1 (op: Char, x: Boolean) = {
	op match {
		case '|' => x|x
		case '&' => x&x
		case '!' => !x
		case _ => None
	}
}

/* Salida:
scala> funcionTuplaBoolAnd('|', true, '!')
val res167: Any = false
*/



// Esta funcion tiene mas sentido que se le pase 2 parametros

def funcionTuplaBoolAnd2 (op1: Char, x: Boolean, y: Boolean, op2: Char) = {
	
	var uno = opcionesB2(op1,x, y)
	var dos = opcionesB2(op2,x, y)
	if( uno == None || dos == None) "Error"
	else uno.toString.toBoolean & dos.toString.toBoolean
}


def opcionesB2 (op: Char, x: Boolean, y: Boolean) = {
	op match {
		case '|' => x|y
		case '&' => x&y
		case '!' => !x | !y
		case _ => None
	}
}

/* Salida:
scala> funcionTuplaBoolAnd2('|', true, false, '!')
val res164: Any = true

scala> funcionTuplaBoolAnd2('|', true, true, '!')
val res165: Any = false
*/



// Y ya que estamos hacemos que se or
def funcionTuplaBoolOr (op1: Char, x: Boolean, y: Boolean, op2: Char) = {
	
	var uno = opcionesB2(op1,x, y)
	var dos = opcionesB2(op2,x, y)
	if( uno == None || dos == None) "Error"
	else uno.toString.toBoolean | dos.toString.toBoolean
}

/* Salida:
scala> funcionTuplaBoolOr('|', true, false, '!')
val res168: Any = true

scala> funcionTuplaBoolOr('|', true, true, '!')
val res169: Any = true

scala> funcionTuplaBoolOr('|', true, true, '&')
val res170: Any = true

scala> funcionTuplaBoolOr('|', true, false, '&')
val res171: Any = true

scala> funcionTuplaBoolOr('|', false, false, '&')
val res172: Any = false

scala> funcionTuplaBoolOr('&', false, false, '&')
val res173: Any = false

scala> funcionTuplaBoolOr('&', false, true, '&')
val res174: Any = false
*/