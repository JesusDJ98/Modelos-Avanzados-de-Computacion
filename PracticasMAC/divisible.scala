def divisible(x: Double, y: Double) = (x%y == 0 & (x != 0 & y != 0) )
/*
scala> divisible(2,3)
val res29: Boolean = false

scala> divisible(9,3)
val res30: Boolean = true

scala> divisible(9,0)
val res32: Boolean = false

scala> divisible(0,3)
val res33: Boolean = false
*/


//Funcion de orden superior
def divisible2(x: Double) = (y: Double) => (x%y == 0 & (x != 0 & y != 0) )
/*
scala> divisible2(9)
val res14: Double => Boolean = $Lambda$1141/0x00000001006af840@686ae6b3

scala> divisible2(9)(3)
val res15: Boolean = true

scala> divisible2(9)(2)
val res16: Boolean = false
*/