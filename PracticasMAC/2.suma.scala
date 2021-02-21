def suma(x: Double, y: Double = 0) = x+y

//Devuelve una funcion
def suma2(x: Double) = (y: Double) => x+y

/* Salida:
scala> suma(2,3)
val res260: Double = 5.0

scala> suma(2)
val res261: Double = 2.0

scala> suma2(3)
val res15: Double => Double = $Lambda$1183/0x0000000100794040@55be2608

scala> suma2(3)(2)
val res16: Double = 5.0
*/
