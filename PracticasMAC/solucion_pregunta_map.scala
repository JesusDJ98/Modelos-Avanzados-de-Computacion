def funcSolMap(y: List[Double], x: List[Double] = List(0) ) = {
	var x1 = x
	if(x.isEmpty) x1 = List(0)

	var Salida: List[Double] = List()
	var cont = 0
	for(miL <- y){
		//Si no hay suficiente de x
		var s = 0.0
		if( cont >= x1.length)  s = 0
		else s = x1(cont)

		Salida = Salida :+ (s+miL)
		cont = cont+1
		
	}
	print(Salida)
}

def suma3L(x: Double = 0, y: List[Double] = List()) = {
	if(y.isEmpty) y
	else{
		var l2: List[Double] = List()
		for(valor <- y){
			l2 = l2 :+ (x+valor)
		}
		l2
	}
}

/*Probar: 
scala> var l3 = List(2.0, 3.0, 4.0)
scala> funcSolMap(l3,suma3L(4,l3))
*/