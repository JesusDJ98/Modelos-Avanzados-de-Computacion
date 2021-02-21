//Programacion imperativa
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



//Programacion Funcional con operaciones de orden superior
def funcMap(f: Double => Double, x: List[Double]) = {
	var dv: List[Double] = List()
	for(y <- x) dv = dv :+ f(y)
	dv
}
/*
scala> funcMap(_*3, List())
val res26: List[Double] = List()

scala> funcMap(_*3, List(2.3, 5, 90))
val res27: List[Double] = List(6.8999999999999995, 15.0, 270.0)
*/

/*
Map en scala hace lo siguiente: Double => Boolean
Para modificarlo deberia crear una clase que herede de List y modificarlo
Para evitar eso, lo creo con operaciones de orden superior
*/
