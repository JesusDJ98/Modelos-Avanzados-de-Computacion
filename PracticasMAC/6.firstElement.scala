def firstElement(x: List[Any]) = {
	if(x.isEmpty) "Nothing"
	else x.head
}
/* Lo mismo que primer elemento
scala> firstElement(List((2,3),(2,3,4), ("asa")))
val res3: Any = (2,3)

scala> firstElement(List((2,3),(2,3,4)))
val res1: Any = (2,3)
*/