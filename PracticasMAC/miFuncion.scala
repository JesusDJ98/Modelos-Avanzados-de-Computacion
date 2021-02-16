/* Este me muestra basura
def miFuncion(implicit c: List[Double], l: List[Double])= {
	if(c.length == 0) l
	else{
		for(x <- c){
			var l2: List[Double] = List()
			var ult = l.length
			while( ult > 0){
				ult = ult-1
				l2 = (x+l(ult)) :: l2
			}
			println(l2)
		}
	}
}
	
*/


def miFuncion(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	if(c.length == 0) c1 = List(0.0)

	for(x <- c1){
		var l2: List[Double] = List()
		var ult = l.length
		while( ult > 0){
			ult = ult-1
			l2 = (x+l(ult)) :: l2
		}
		println(l2)
	}
}




def VerLista(l: List[Any]) = {
	for(x<-l) println(x)
}

def VerListaI(l: List[Any]) = {
	var ult = l.length
	while( ult > 0){
		ult = ult-1
		println(l(ult)) 
	}
}