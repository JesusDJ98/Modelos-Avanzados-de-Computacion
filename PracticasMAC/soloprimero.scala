def soloprimero(x: Any, y: Any) = x
def soloprimero1(x: String) = x.head
def soloprimero2(x: List[Any]) = x.head

/* Salida:
scala> s3
val res259: String = we23asdr

scala> soloprimero(s3, List(2,3))
val res253: Any = we23asdr

scala> soloprimero1(s3)
val res256: Char = w

scala> soloprimero2(List(2,3,4,"yo"))
val res258: Any = 2

*/