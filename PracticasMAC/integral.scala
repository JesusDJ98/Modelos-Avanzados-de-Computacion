def integral(f: Double => Double, x: Double , y: Double , z: Double ) = {
	var intervalos = intervalo(x, y, z)
	var alturas = funcion(intervalos, f)
	var area = areas(z, alturas)
	sumaLR(area)
}
/* Salida: --> Mismo ejemplo que en clase para verificar
scala> integral(math.pow(_,2), 1,10,0.5)
val res108: Double = 308.625

scala> integral(math.pow(_,2), 1,10,0.05)
val res110: Double = 330.5287500000001

scala> integral(math.pow(_,2), 1,10,0.01)
val res111: Double = 332.5051499999999

*/




def sumaLR(l: List[Double], total: Double = 0): Double = {
	if(l.isEmpty) total
	else sumaLR(l.tail, l.head+total)
}
// Lo mismo que sumaListaR de 




def areas(b: Double, h: List[Double], area: List[Double] = List()): List[Double] = {
	if(h.length == 0) area
	else areas(b, h.tail, area :+ b*h.head)
}
/* Salida:
scala> areas(0.35, List(2,43,2.3))
val res107: List[Double] = List(0.7, 15.049999999999999, 0.8049999999999999)
*/



def funcion(y: List[Double], x: Double => Double) = {
	var aux: List[Double] = List()
	for(a <- y) aux = aux :+ x(a)
	aux
}
//Lo mismo que evaluaciones de la sesion anterior




def intervalo(x: Double , y: Double , z: Double ) = {
	//List.range(x,y,z) --> No acepta Double
	var x1 = x
	var y1 = y
	if(y < x){
		x1 = y
		y1 = x
	}

	var cant: Double = (y1-x1)/z
	var division = cant.toString.split("\\.")
	var entera = division(0).toDouble.toInt
	var devolver = List.tabulate(entera)(n => (n*z)+x1)
	
	if(entera < cant) devolver = devolver :+ y1-z
	if(y < x) devolver = devolver.reverse
	devolver
}
/* Salida:
scala> intervalo(2,3,0.2)
val res64: List[Double] = List(2.0, 2.2, 2.4, 2.6, 2.8, 3.0)

scala> intervalo(2,3,0.3)
val res65: List[Double] = List(2.0, 2.3, 2.6, 2.9, 3.0)

scala> intervalo(3,2,0.2)
val res66: List[Double] = List(3.0, 2.8, 2.6, 2.4, 2.2, 2.0)

scala> intervalo(3,2,0.3)
val res67: List[Double] = List(3.0, 2.9, 2.6, 2.3, 2.0)
*/