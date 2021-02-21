def secondElement(x: List[Any]) = {
	if(x.length < 1) "Nothing"
	else x(1)
}
def secondElement2(x: List[Any]) = {
	if(x.length < 1) "Nothing"
	else x.tail.head
}
def secondElement3(x: String) = {
	if(x.length < 1) "Nothing"
	else x.tail.head
}
//Con evaluacion perezosa
def secondElement4(x: => Any, y: Any) = y

/* Salida:
scala> secondElement(List(2,"a",' ',3))
val res30: Any = a

scala> secondElement2(List(2,"a",' ',3))
val res31: Any = a

scala> secondElement3("kjhgfdsasdfgh")
val res32: Any = j

scala> secondElement4("kjhgfdsasdfgh", "asdfg")
val res33: Any = asdfg

scala> secondElement4(2, 43)
val res34: Any = 43

scala> secondElement4(2, List(234,764,' ', 3))
val res35: Any = List(234, 764, 32, 3)

scala> secondElement4(2, List(234,764,' ', 3.0, "asd"))
val res36: Any = List(234, 764,  , 3.0, asd)
*/