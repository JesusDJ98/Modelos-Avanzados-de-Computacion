def predecesor(x: Int) = (x-1)

/*
scala> predecesor(2)
val res69: Int = 1

scala> predecesor(0)
val res70: Int = -1

scala> predecesor(1)
val res71: Int = 0

scala> predecesor(-1)
val res72: Int = -2
*/



def antecesor(x: Int) = (x+1)
/*
scala> antecesor(2)
val res44: Int = 3
*/



def antecesor2(x: Int) = (y: Int) => x+1==y
def predecesor2(x: Int) = (y: Int) => x-1==y
/*
scala> antecesor2(2)
val res0: Int => Boolean = $Lambda$1077/0x0000000100742840@465d1345

scala> antecesor2(2)(2)
val res1: Boolean = false

scala> antecesor2(2)(3)
val res2: Boolean = true

scala> predecesor2(2)
val res3: Int => Boolean = $Lambda$1089/0x000000010074a040@3872867d

scala> predecesor2(2)(3)
val res4: Boolean = false

scala> predecesor2(2)(1)
val res5: Boolean = true
*/