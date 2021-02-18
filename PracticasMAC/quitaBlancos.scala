def quitaBlancos(x: List[Char]) = {
	var x1: List[Char] = List()
	for(l <- x){
		if(l == ' ') 0
		else x1 = x1 :+ l
	}
	x1
}

/*
scala> quitaBlancos(List('a',' ','2', ' ', ' ','3','c'))
val res61: List[Char] = List(a, 2, 3, c)
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