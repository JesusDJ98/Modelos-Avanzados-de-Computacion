def miFuncion2(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	if (c.isEmpty ) c1 = List(0)

	var l2: List[List[Double]] = List()
	for(x <- c1){
		var l_aux: List[Double] = List() 
		for( y <- l) l_aux = l_aux :+ y+x
		
		l2 = l2 :+ l_aux
	}
	
	l2
}
/* Salida:
scala> miFuncion2(List(2,3,4,2), List(2,3))
val res29: List[List[Double]] = List(List(4.0, 5.0, 6.0, 4.0), List(5.0, 6.0, 7.0, 5.0))

scala> miFuncion2(List(2,3,4,2), List(2,3,3,4,2,3,6))
val res30: List[List[Double]] = List(List(4.0, 5.0, 6.0, 4.0), List(5.0, 6.0, 7.0, 5.0), List(5.0, 6.0, 7.0, 5.0), List(6.0, 7.0, 8.0, 6.0), List(4.0, 5.0, 6.0, 4.0), List(5.0, 6.0, 7.0, 5.0), List(8.0, 9.0, 10.0, 8.0))

scala> miFuncion2(List(2,3,4,2), List())
val res31: List[List[Double]] = List(List(2.0, 3.0, 4.0, 2.0))

scala> miFuncion2(List(2,3,4,2))
val res32: List[List[Double]] = List(List(2.0, 3.0, 4.0, 2.0))
*/


/* Esto no es lo que se pide, pero aqui me he centrado en trabajar con listas, ya en las sesiones superiores,
ya trabajare mas a fondo con las funciones de orden superior, pero para que no haya ningun problema luego con la nota,
tambien pondre aqui abajo lo que realmente se pide en esta parte
*/

def miFuncion22(l: List[Double => Double], c: List[Double]) = {
	var devolver: List[Any] = List()
	
	for(f <- l){
		var aux: List[Double] = List()
		for(x <- c) aux = aux :+ f(x)
		devolver = devolver :+ aux
	}
	devolver		
}
/* Salida:
scala> miFuncion22(List(_*3, _+2, math.pow(_,2)), List(2,3,4,5))
val res43: List[Any] = List(List(6.0, 9.0, 12.0, 15.0), List(4.0, 5.0, 6.0, 7.0), List(4.0, 9.0, 16.0, 25.0))
*/



//Trabajando con map
def miFuncion23(l: List[Double => Double], c: List[Double]) = {
	var devolver: List[Any] = List()
	for(f <- l){
		devolver = devolver :+ c.map(f)
	}
	//l.foreach { devolver = devolver :+ c.map(this) }
	devolver		
}
/* Salida:
scala> miFuncion23(List(_*3, _+2, math.pow(_,2)), List(2,3,4,5))
val res54: List[Any] = List(List(6.0, 9.0, 12.0, 15.0), List(4.0, 5.0, 6.0, 7.0), List(4.0, 9.0, 16.0, 25.0))
*/