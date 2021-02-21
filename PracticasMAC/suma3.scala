def suma3(x: Double, y: Double = 0, z: Double = 0) = x+y+z


//Devuelven una funcion
def suma3(x: Double) = (y: Double, z: Double) => x+y+z
def suma31(x: Double) = (y: Double, z: Double, t: Double) => (x+y, x+z, x+t)
/*
scala> suma3(2)
val res12: (Double, Double) => Double = $Lambda$1140/0x0000000100773040@2be9425f

scala> suma3(2)(2,3)
val res17: Double = 7.0

scala> suma31(2)(2,2,3)
val res20: (Double, Double, Double) = (4.0,4.0,5.0)

scala> suma31(2)
val res21: (Double, Double, Double) => (Double, Double, Double) = $Lambda$1185/0x00000001007a1040@7ea9fba1
*/


//Suma un numero a los elementos de la lista marcados, por defecto 3
def suma3L(x: Double, y: List[Double], cant: Int = 3): List[Double] = {
	if(cant == 0) y
	else suma3L(x, y.updated(cant-1, (y(cant-1)+x)), cant-1)
}
/* Salida:
scala> suma3(2,3,5)
val res294: Double = 10.0

scala> suma3(2,3)
val res295: Double = 5.0

scala> suma3(2)
val res296: Double = 2.0



scala> t
val res292: List[Double] = List(2.0, 3.0, 4.0)

scala> suma3L(2,t)
val res293: List[Double] = List(4.0, 5.0, 6.0)
*/