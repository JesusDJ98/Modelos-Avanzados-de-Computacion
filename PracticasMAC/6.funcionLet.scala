def funcionLet(x: List[Any]): List[Any] = {
	if(x.length < 2) List()
	else x.drop(2)
} 
/* Salida:
scala> funcionLet(List(2,3,4))
val res43: List[Any] = List(4)

scala> funcionLet(List(2,3))
val res44: List[Any] = List()

scala> funcionLet(List(List(2,3), List("as",'b'), List(2, ' ', "b")) )
val res45: List[Any] = List(List(2,  , b))
*/


def funcionLet2(x: (Any, Any, Any)) = x._3
/*
scala> funcionLet2("a",2,'b', 3)
                       ^
       error: too many arguments (found 4, expected 3-tuple) for method funcionLet2: (x: (Any, Any, Any)): Any

scala> funcionLet2("a",2,'b')
val res53: Any = b
*/