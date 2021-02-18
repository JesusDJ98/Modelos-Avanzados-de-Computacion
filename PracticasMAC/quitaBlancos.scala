def quitaBlancos(x: String) = {
	var x1: String = ""
	for(l <- x){
		if(l == ' ') 0
		else x1 = x1 :+ l
	}
	x1
}

/*
scala> quitaBlancos(str)
val res82: String = AAaaBab

scala> str
val res83: String = AA aa B a b
*/

def quitaBlancos2(x: List[Any]) = {
	var x1: List[Any] = List()
	for(l <- x){
		if(l == ' ') 0
		else x1 = x1 :+ l
	}
	x1
}

/*
scala> quitaBlancos2(LB)
val res62: List[Any] = List(yo, 2, ver)

scala> LB
val res63: List[Any] = List( , yo, 2,  , ver, 32)
*/