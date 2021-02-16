def sumaListaR(l: List[Double], total: Double = 0): Double = {

	if(l.length == 0) total
	else{
		var total2 = l(0)+total
		//println("Entro con un total de: "+total+" con una cantidad de: "+l.length)
		sumaListaR(eliminaCabeza(l), total2)
	}
}

def eliminaCabeza(l:List[Double]) = {
	var l2: List[Double] = List()
	var ult = l.length
	while(ult > 1){
		ult = ult-1
		l2 = (l(ult)) :: l2
	}
	l2
}

//Sin recursividad
def sumaLista(l: List[Double] = List(0)) = {
	
	var sum = 0.0
 	for(x <- l) sum = x+sum

	sum
}