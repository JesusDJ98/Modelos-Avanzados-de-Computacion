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




//Mejora de la implementacion
def euler3_2(x: Double, salida: Double = 1, veces: Int = 0): Double = {
	if( x < 1) 0
	else{
		if(x <= 1) salida
		else{
			var l = calculaPrimos(List.tabulate(10)(n => n+2+(10*veces)))
			var encontrado = false
			var cant = 0
			while(cant < l.length & !encontrado){
				if(x%l(cant) == 0) encontrado = true
				else cant += 1
			}
			if(encontrado) euler3_2(x/l(cant), l(cant))
			else euler3_2(x, 1, veces+1)
		}
	}
}
/* Salida:
scala> euler3_2(13195)
val res12: Double = 29.0

scala> euler3_2(600851475143.0)
val res13: Double = 6857.0

scala> euler3_2(1)
val res3: Double = 1.0

scala> euler3_2(0)
val res4: Double = 0.0

scala> euler3_2(-2)
val res5: Double = 0.0

scala> euler3_2(4)
val res6: Double = 2.0
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