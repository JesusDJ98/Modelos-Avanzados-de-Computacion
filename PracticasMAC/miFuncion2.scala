def miFuncion2(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	if (c.isEmpty ) c1 = List(0)

	var l2: List[List[Double]] = List()
	for(x <- c1){
		var l_aux: List[Double] = List() 
		for( y <- l) l_aux = l_aux :+ y+x
		
		l2 = l2 :+ l_aux
	}
	
	l2
}

