def NoNeg(x: Double) = {
	if(x >= 0) true
	else false
}
/*
scala> NoNeg(2)
val res6: Boolean = true

scala> NoNeg(-2)
val res7: Boolean = false

scala> NoNeg(0)
val res8: Boolean = true
*/


//Codigo mas funcional
def noNeg(x: Double) = x >= 0
/*
scala> noNeg(0)
val res9: Boolean = true

scala> noNeg(2)
val res10: Boolean = true

scala> noNeg(-1)
val res11: Boolean = false
*/