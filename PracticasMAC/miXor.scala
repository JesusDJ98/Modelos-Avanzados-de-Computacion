def XOR(x: Boolean, y: Boolean) ={
	if(x & y || !x & !y) false
	else true
}
/*
scala> XOR(true, false)
val res12: Boolean = true

scala> XOR(true, true)
val res13: Boolean = false

scala> XOR(false, false)
val res14: Boolean = false
*/



def xOr(x: Boolean, y: Boolean) = (x & !y || !x & y)
/*
scala> xOr(true,true)
val res18: Boolean = false

scala> xOr(true,false)
val res19: Boolean = true
*/

def NOr(x: Boolean, y: Boolean) = !(x | y)
/*
scala> NOr(true, true)
val res20: Boolean = false

scala> NOr(true, false)
val res21: Boolean = false

scala> NOr(false, false)
val res22: Boolean = true
*/




def xNOr(x: Boolean, y: Boolean) = (x & y || !x & !y)
/*
scala> xNOr(true,true)
val res26: Boolean = true

scala> xNOr(true,false)
val res27: Boolean = false

scala> xNOr(false,false)
val res28: Boolean = true
*/

