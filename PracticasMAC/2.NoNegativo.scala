//Programacion imperativa
def NoNeg(x: Double) = {
	if(x >= 0) true
	else false
}

//Programacion funcional
def noNeg(x: Double) = x >= 0


//Programacion funcional orden superior
def noNeg2() = (x: Double) => (x >= 0)
def noNeg3 = (x: Double) => (x >= 0)
/*
scala> NoNeg()
            ^
       error: not enough arguments for method NoNeg: (x: Double): Boolean.
       Unspecified value parameter x.

scala> NoNeg(-2)
val res8: Boolean = false

scala> NoNeg(2)
val res9: Boolean = true

scala> NoNeg(0)
val res10: Boolean = true

scala> noNeg()
            ^
       error: not enough arguments for method noNeg: (x: Double): Boolean.
       Unspecified value parameter x.

scala> noNeg(-2)
val res11: Boolean = false

scala> noNeg(2)
val res12: Boolean = true

scala> noNeg(0)
val res13: Boolean = true


scala> noNeg2()
val res16: Double => Boolean = $Lambda$1134/0x000000010076c840@1a2fca7f

scala> noNeg2(-2)
              ^
       error: no arguments allowed for nullary method noNeg2: (): Double => Boolean

scala> noNeg2()(-2)
val res18: Boolean = false

scala> noNeg2()(2)
val res19: Boolean = true

scala> noNeg2()(0)
val res20: Boolean = true

scala> noNeg3()
             ^
       error: not enough arguments for method apply: (v1: Double): Boolean in trait Function1.
       Unspecified value parameter v1.

scala> noNeg3(-2)
val res2: Boolean = false

scala> noNeg3(2)
val res3: Boolean = true


*/