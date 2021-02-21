//Trabajando de manera imperativa
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





//Trabajando de manera Funcional
def funcionTuplaBoolAnd2(f1: Boolean => Boolean, x: Boolean, f2: Boolean => Boolean) = (f1(x) & f2(x))
def funcionTuplaBoolOr2(f1: Boolean => Boolean, x: Boolean, f2: Boolean => Boolean) = (f1(x) | f2(x))
/*
scala> funcionTuplaBoolAnd2(_!=false, true, _==true)
val res37: Boolean = true

scala> funcionTuplaBoolAnd2(_!=false, true, _==false)
val res38: Boolean = false

scala> funcionTuplaBoolAnd2(Or2(true), true, And2(false))
val res75: Boolean = false

scala> funcionTuplaBoolAnd2(Or2(true), true, And2(true))
val res76: Boolean = true

scala> funcionTuplaBoolOr2(Or2(true), true, And2(true))
val res78: Boolean = true

scala> funcionTuplaBoolOr2(Or2(true), true, And2(false))
val res79: Boolean = true

scala> funcionTuplaBoolOr2(Or2(false), true, And2(false))
val res80: Boolean = true

scala> funcionTuplaBoolOr2(And2(false), true, And2(false))
val res81: Boolean = false
*/



//Trabajando de forma funcional y con tuplas
def funcionTuplaBoolAnd3(a: (Boolean => Boolean, Boolean, Boolean => Boolean)) = (a._1(a._2) & a._3(a._2))
def funcionTuplaBoolOr3(a: (Boolean => Boolean, Boolean, Boolean => Boolean)) = (a._1(a._2) | a._3(a._2))
/*
scala> funcionTuplaBoolAnd3((And2(false), true, And2(true)))
val res90: Boolean = false

scala> funcionTuplaBoolOr3((And2(false), true, And2(true)))
val res91: Boolean = true
*/
