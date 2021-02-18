def miFuncion2(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	if (c.isEmpty ) c1 = List(0)

	var l2: List[Double] = List()
	for(x <- c1){ 
		for( y <- l) l2 = l2 :+ y+x
	}
	
	print(l2)
}

