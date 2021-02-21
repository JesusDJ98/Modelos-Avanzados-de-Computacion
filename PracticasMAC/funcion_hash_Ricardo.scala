def divisores(x: Int) = {
	if( x < 0 ) List()
	else{
		var cant = 1
		var l: List[Int] = List()
		while(cant <= x)
		{
			if(x % cant == 0) l = l :+ cant
				cant += 1
		}
		l
	}
}
def primos(x: Int) = {
	if(divisores(x).length == 2 & divisores(x).length > 0) true
	else false
}
//Lo mismo que en divisores_ricardo



def calculaPrimos(l: List[Int]) = {
	var l2: List[Int] = List()
	for(x <- l) if(primos(x)) l2 = l2 :+ x
	l2
}
/* Salida:
scala> calculaPrimos(List.tabulate(100)(n => n))
val res40: List[Int] = List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
*/
		

def calculaHash(l: List[Int]) = {
	var Listado: List[Int] = List()
	var longitud = l.length
	if(longitud > 25) Listado = calculaPrimos(List.tabulate(10*longitud)(n => n))
	else Listado = calculaPrimos(List.tabulate(100)(n => n))

	var devolver = 0
	var cant = 0
	var l2 = Listado.take(longitud).reverse
	while(cant < l2.length){
		var x = l(cant)
		var y = l2(cant)
		devolver += x*y
		cant += 1
	}
	devolver
}
/* Salida:
scala> calculaHash(List(1,2,3))
val res0: Int = 17

scala> calculaHash(List(1,2,3,2 ,4))
val res2: Int = 54

scala> calculaHash(List.tabulate(30)(n => n))
val res3: Int = 13876
*/

