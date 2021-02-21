def secondElement(x: List[Any]) = {
	if(x.length < 1) "Nothing"
	else x(1)
}

def secondElement2(x: List[Any]) = {
	if(x.length < 1) "Nothing"
	else x.tail.head
}


/* Salida:
scala> prueba
val res240: List[List[Any]] = List(List(asdf, fgh), List(2, 43, 456, 654, 32, 23, 65), List(23,  , a))

scala> secondElement(prueba)
val res241: Any = List(2, 43, 456, 654, 32, 23, 65)

scala> secondElement2(prueba)
val res242: Any = List(2, 43, 456, 654, 32, 23, 65)

//Son iguales simplemente uno solo coge funciones ya predeerminadas de las listas
*/



def secondElement3(x: String) = {
	if(x.length < 1) "Nothing"
	else x.tail.head
}
/* Salida:
scala> s3
val res251: String = we23asdr

scala> secondElement3(s3)
val res250: Any = e

scala> secondElement3(s3.drop(1))
val res252: Any = 2
*/

//Con evaluacion perezosa

def secondElement4(x: => Any, y: Any) = y
/* Salida:
scala> secondElement4(2,3)
val res24: Any = 3

scala> secondElement4(2)
                     ^
       error: not enough arguments for method secondElement4: (x: => Any, y: Any): Any.
       Unspecified value parameter y.

scala> secondElement4(2,List(2,3))
val res26: Any = List(2, 3)
*/