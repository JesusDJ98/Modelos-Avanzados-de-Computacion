def suma3(x: Double, y: Double = 0, z: Double = 0) = x+y+z

//Devuelven una funcion
def suma3_1(x: Double) = (y: Double, z: Double) => x+y+z
def suma3_2(x: Double) = (y: Double, z: Double, t: Double) => (x+y, x+z, x+t)

//Suma un numero a los elementos de la lista marcados, por defecto 3
def suma3L(x: Double, y: List[Double], cant: Int = 3): List[Double] = {
	if(cant == 0) y
	else suma3L(x, y.updated(cant-1, (y(cant-1)+x)), cant-1)
}
/* Salida:
scala> suma3(2,3,5)
val res4: Double = 10.0

scala> suma3(2,3)
val res5: Double = 5.0

scala> suma3(2)
val res6: Double = 2.0

scala> suma3_1(2,3,5)
                 ^
       error: too many arguments (found 3, expected 1) for method suma3_1: (x: Double): (Double, Double) => Double

scala> suma3_1(2)(3,5)
val res9: Double = 10.0

scala> suma3_1(2)
val res12: (Double, Double) => Double = $Lambda$1152/0x0000000100779840@2715b3ea

scala> suma3_2(2)
val res13: (Double, Double, Double) => (Double, Double, Double) = $Lambda$1153/0x000000010077fc40@2b85fc

scala> suma3_2(2)(2,4,12)
val res14: (Double, Double, Double) = (4.0,6.0,14.0)

scala> suma3L(3, List(2,3,4,5))
val res15: List[Double] = List(5.0, 6.0, 7.0, 5.0)

scala> suma3L(3, List(2,3,4,5), 4)
val res17: List[Double] = List(5.0, 6.0, 7.0, 8.0)

*/