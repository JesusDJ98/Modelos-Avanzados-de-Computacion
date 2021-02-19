def funcionLet(x: List[Any]) = {
	if(x.length < 2) "Error menor que 2"
	else x.drop(2)
} 
/* Salida:
	//Listas Simples
scala> funcionLet(List(2,3,4))
val res195: java.io.Serializable = List(4)

scala> funcionLet(List(2,3))
val res196: java.io.Serializable = List()

scala> funcionLet(List(2))
val res197: java.io.Serializable = Error menor que 2

scala> funcionLet(List(2,3,2,4,2,5))
val res198: java.io.Serializable = List(2, 4, 2, 5)

	//Listas de Listas
scala> funcionLet(List(List(2,3,2,4,2,5), List("asdf","fgh")))
val res200: java.io.Serializable = List()

scala> funcionLet(List(List(2,3,2,4,2,5), List("asdf","fgh"), List(2, 43, 456,654,32,23,65), List(23, ' ', "a")))
val res199: java.io.Serializable = List(List(2, 43, 456, 654, 32, 23, 65), List(23,  , a))
*/

/*
funcionLet2 es lo mismo
Pues en haskell se diferencia entre Array[] y Listas()
Pero en scala poniendo una lista de any, podemos tener array que funcionan igual
que las listas de haskell, es decir, que cada elemento puede ser de un tipo diferente.
*/