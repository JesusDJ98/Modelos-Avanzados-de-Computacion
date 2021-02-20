def euler3_prim(x: Double)={
	var l: List[Double] = List()
	for(y <- divisores(x)) if(primos(y)) l = l :+ y
	l
}
/*Problemas:
scala> euler3_prim(600851475143)
                   ^
       error: integer number too large


	Salida:
scala> euler3_prim(13195)
val res7: List[Double] = List(5.0, 7.0, 13.0, 29.0)
*/


def euler3(x: Double) = {
	var l = divisores(x).reverse
	var cant = 0
	while( cant < l.length ){
		//println(l(cant))
		if(primos(l(cant))){
			println( l(cant) )
			cant = l.length
		}else cant += 1
	}
}
/* Salida:
scala> euler3(13195)
29

scala> euler3(600851475143)
              ^
       error: integer number too large

scala> euler3(600851475143.0)
Tarda MUCHISIMO
*/



/* Planteamiento:

Cojo los 100 primeros primos, y busco el primero que sea capaz de reducir el numero al que deseamos conocer la lista de divisores.
Y busco desde 1 hasta x/primerPrimo, por loq tardaremos menos
Y luego rellenare la tabla, dividiendo el x original por cada elemento de la Lista de divisores encontrados
es decir, seria orden O(n) (peor caso 32, bucar el primo divisor) + O(n/primo) + O(2n) (Rellenar el array)
*/
def divisores2(x: Double) = {
	var lPrimos = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
	var encontrado = false
	var inicio = 0
	while(!encontrado & inicio<lPrimos.length){
		if(x%lPrimos(inicio) == 0) encontrado = true
		else inicio += 1
	}

	var x1 = x
	if(encontrado) x1 = x/lPrimos(inicio)
	println(x1)
	var cant = 1
	var l: List[Int] = List()
	
	while(cant <= x1)
	{
		if(x % cant == 0) l = l :+ cant
		cant += 1
	}

	//Aqui ya esta la mitad hecha
	
	var l2: List[Int] = List()
	//Como solo cojo 1
	//for(y <- l) if(x/y > l.reverse.head) l2 = (x/y).toInt :: l2

	l.length match{
		case 0 => l
		case _ => if( x/l.head > l.reverse.head) l2 = (x/l.head).toInt :: l2
	}
	
	l = l ++ l2
	l
}
/* Salida:
scala> divisores2(345)
115.0
val res0: List[Int] = List(1, 3, 5, 15, 23, 69, 115, 345)

scala> divisores2(3)
1.0
val res1: List[Int] = List(1, 3)

scala> divisores2(0)
0.0
val res2: List[Int] = List()
*/


def divisores(x: Double) = {
	if( x < 0 ) List()
	else{
		var cant = 1
		var l: List[Double] = List()
		while(cant <= x)
		{
			if(x % cant == 0) l = l :+ cant
				cant += 1
		}
		l
	}
}
def primos(x: Double) = {
	if(divisores(x).length == 2 & divisores(x).length > 0) true
	else false
}
//Lo mismo que en divisores_ricardo aunque un poco modificado para mejorar la eficiencia del ejercicio euler


def calculaPrimos(l: List[Double]) = {
	var l2: List[Double] = List()
	for(x <- l) if(primos(x)) l2 = l2 :+ x
	l2
}
//Lo mismo que en funcion_hash_ricardo