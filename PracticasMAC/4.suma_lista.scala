def sumaListaR(l: List[Double], total: Double = 0): Double = {
	if(l.isEmpty) total
	else sumaListaR(l.tail, l.head+total)
}


//Sin recursividad
def sumaLista(l: List[Double] = List(0)) = {
	
	var sum = 0.0
 	for(x <- l) sum = x+sum

	sum
}

/* Salida:
scala> sumaListaR(List(2,2,3,13))
val res263: Double = 20.0

scala> sumaLista(List(2,2,3,13))
val res264: Double = 20.0
*/