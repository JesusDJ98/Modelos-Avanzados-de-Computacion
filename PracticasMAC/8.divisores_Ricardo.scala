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
/* Salida:
scala> divisores(3)
val res26: List[Int] = List(1, 3)

scala> divisores(-3)
val res27: List[Int] = List()

scala> divisores(0)
val res28: List[Int] = List()

scala> divisores(2)
val res29: List[Int] = List(1, 2)

scala> divisores(6)
val res30: List[Int] = List(1, 2, 3, 6)

scala> divisores(8)
val res31: List[Int] = List(1, 2, 4, 8)

scala> divisores(11)
val res32: List[Int] = List(1, 11)

scala> divisores(17)
val res33: List[Int] = List(1, 17)

scala> divisores(90)
val res35: List[Int] = List(1, 2, 3, 5, 6, 9, 10, 15, 18, 30, 45, 90)

*/


def primos(x: Int) = {
	if(divisores(x).length <= 2 & divisores(x).length > 0) true	
	else false
}
/* Salida:
scala> primos(0)
val res55: Boolean = false

scala> primos(1)
val res56: Boolean = true

scala> primos(2)
val res57: Boolean = true

scala> primos(3)
val res58: Boolean = true

scala> primos(4)
val res59: Boolean = false

scala> primos(7)
val res62: Boolean = true

scala> primos(-2)
val res63: Boolean = false
*/