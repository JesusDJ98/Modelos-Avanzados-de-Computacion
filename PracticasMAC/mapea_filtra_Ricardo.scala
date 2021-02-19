//Funcion de orden superior
/*
def filtra(x: Any => Boolean, l: List[Any]) = {
	var aux: List[Any] = List()
	for(a <- l){
		if( comprueba(x, a) ) aux = aux :+ a	
	}
	aux
}
def comprueba(p: Any => Boolean, l: Any) = p(l)
*/
//Filtra
def filtra(x: Any => Boolean, l: List[Any]) = {
	var aux: List[Any] = List()
	for(a <- l){
		if( x(a) ) aux = aux :+ a	
	}
	aux
}
def filtra2(x: Double => Boolean, l: List[Double]) = {
	var aux: List[Any] = List()
	for(a <- l){
		if( x(a) ) aux = aux :+ a	
	}
	aux
}
/* Salida: comprueba(Any)
scala> filtra(_!=1, List(1,2,3,2,23,8,1,1,4))
val res105: List[Any] = List(2, 3, 2, 23, 8, 4)

scala> filtra(_!="aa", List(1,2,3,2,23,8,1,1,4))
val res106: List[Any] = List(1, 2, 3, 2, 23, 8, 1, 1, 4)

scala> filtra(_!="aa", List(1,2,3,2,23,8,1,1,4, "aa", "aba"))
val res107: List[Any] = List(1, 2, 3, 2, 23, 8, 1, 1, 4, aba)

scala> filtra(_<2, List(1,2,3,2,23,8,1,1,4, "aa", "aba"))
               ^
       error: value < is not a member of Any

		# Pero el metodo filter tampoco lo permite -->
scala> b
val res151: List[Any] = List(2, 3, 42, 1)

scala> b.filter(<2)
                 ^
       error: ')' expected but integer literal found.

scala> b.filter(_<2)
                 ^
       error: value < is not a member of Any

scala> b.filter(_ < 2)
                  ^
       error: value < is not a member of Any

		# Para ello necesitamos un List[Double]

scala> c
val res159: List[Double] = List(2.0, 4.0, 5.0, 2.0, 23.0, 54.0, 99.0)

scala> filtra2(_<2,c)
val res160: List[Any] = List()

scala> filtra2(_<5,c)
val res161: List[Any] = List(2.0, 4.0, 2.0)

scala> filtra2(_!=5,c)
val res162: List[Any] = List(2.0, 4.0, 2.0, 23.0, 54.0, 99.0)

scala> filtra2(_==5,c)
val res163: List[Any] = List(5.0)

		# No hay una clase que englobe ambos...
		El Any permite comparar cualquier lista, y el Double da las opciones de mayor y menor
*/





// Mapea
def mapea(x: Double => Double, l: List[Double]) = {
	var aux: List[Any] = List()
	for(a <- l) aux = aux :+ x(a)
	aux
}

/* Salida:
scala> c
val res166: List[Double] = List(2.0, 4.0, 5.0, 2.0, 23.0, 54.0, 99.0)

scala> mapea(_*2,c)
val res165: List[Any] = List(4.0, 8.0, 10.0, 4.0, 46.0, 108.0, 198.0)

scala> mapea(_-2,c)
val res167: List[Any] = List(0.0, 2.0, 3.0, 0.0, 21.0, 52.0, 97.0)

scala> mapea(_/2,c)
val res168: List[Any] = List(1.0, 2.0, 2.5, 1.0, 11.5, 27.0, 49.5)

*/



def doble(x: Double) = x*2
def triple(x: Double) = x*3
/* Salida:
scala> triple(4)
val res171: Double = 12.0

scala> doble(4)
val res172: Double = 8.0
*/






/*
Esto es lo mismo que se nos pide en el script miFuncion
Pero como es de la sesion 4, y en ese momento no tenia los conocimientos para hacerlo,
dejo este como sustituto del script miFuncion, y dejo mi script de miFuncion tal cual,
pues asi vale como más ejercicio de listas.
Y esta sesion que se centre más en ejercicios de funciones de orden superior y map
*/
def evaluaciones(y: List[Double], x: List[Double => Double]) = {
	var aux: List[Any] = List()
	for(a <- y){
		var aux2: List[Double] = List()
		for(b <- x) aux2 = aux2 :+ b(a)
		
		aux = aux :+ aux2
	}
	aux
}












