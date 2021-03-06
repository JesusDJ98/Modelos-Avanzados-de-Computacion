//Trabajando con listas
def miFuncion(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	var l1 = l
	if(c.length < l.length) c1 = c1 ++ List.fill(l.length-c.length)(0.0)
	else if(c.length > l.length) l1 = l1 ++ List.fill(c.length-l.length)(0.0)


	var l2: List[Double] = List()
	var cant = 0
	for(x <- c1){
		l2 = l2 :+ l1(cant)+x
		cant += 1
	}
	l2
}
/* Salida:
scala> miFuncion(List(2,2,2,2))
val res181: List[Double] = List(2.0, 2.0, 2.0, 2.0)

scala> miFuncion(List(2,2,2,2), List())
val res162: List[Double] = List(2.0, 2.0, 2.0, 2.0)

scala> miFuncion(List(2,2,2,2), List(2,3,3,4,2,4))
val res163: List[Double] = List(4.0, 5.0, 5.0, 6.0, 4.0, 6.0)

scala> miFuncion(List(2,2,2,2), List(2,3,3,4))
val res164: List[Double] = List(4.0, 5.0, 5.0, 6.0)
*/





def miFuncionR(l: List[Double], c: List[Double] = List(0.0), devolver: List[Double] = List() ): List[Double] = {
	if(l.length != c.length){
		var l1 = l
		var c1 = c
		if(l.length < c.length) l1 = l1 ++ List.fill(c.length-l.length)(0.0)
		else c1 = c1 ++ List.fill(l.length-c.length)(0.0)
		miFuncionR(l1, c1, devolver)
	}else{
		if(l.length == 0) devolver
		else{
			var aux = devolver :+ l.head+c.head
			miFuncionR(l.tail, c.tail, aux)
		}
	}
}
/* Salida:

scala> miFuncionR(List(2,3))
val res20: List[Double] = List(2.0, 3.0)

scala> miFuncionR(List(2,3), List())
val res21: List[Double] = List(2.0, 3.0)

scala> miFuncionR(List(2,3), List(2))
val res22: List[Double] = List(4.0, 3.0)

scala> miFuncionR(List(2,3), List(2,3))
val res23: List[Double] = List(4.0, 6.0)

scala> miFuncionR(List(2,3), List(2,3,4,5,32))
val res24: List[Double] = List(4.0, 6.0, 4.0, 5.0, 32.0)
*/





//Funcion de orden superior
def miFuncion_2(f: Double => Double, c: List[Double]) = {
	var devolver: List[Any] = List()
	for(x <- c) devolver = devolver :+ f(x)
	devolver		
}
/* Salida:
scala> miFuncion_2(_+2, List(-1,2,3,2,345,22,0))
val res1: List[Any] = List(1.0, 4.0, 5.0, 4.0, 347.0, 24.0, 2.0)
*/




def miFuncion_21(f: Double => Boolean, c: List[Double]) = {
	var devolver: List[Any] = List()
	for(x <- c) devolver = devolver :+ f(x)
	devolver		
}
def miFuncion_21_2(f: Double => Boolean, c: List[Double]) = c.map(f)
/*Salida:
scala> miFuncion_21(_<2, List(-1,2,3,2,345,22,0))
val res28: List[Any] = List(true, false, false, false, false, false, true)

scala> miFuncion_21_2(_<2, List(-1,2,3,2,345,22,0))
val res29: List[Boolean] = List(true, false, false, false, false, false, true)
*/




def miFuncion_22(f: Double => Boolean, c: List[Double]) = {
	var devolver: List[Any] = List()
	for(x <- c) if(f(x)) devolver = devolver :+ x
	devolver		
}
/* Salida:
scala> miFuncion_22(_<2, List(-1,2,3,2,345,22,0))
val res3: List[Any] = List(-1.0, 0.0)
*/