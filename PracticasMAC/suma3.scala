def suma3(x: Double, y: Double = 0, z: Double = 0) = x+y+z

def suma3L(x: Double = 0, y: List[Double] = List()) = {
	if(y.length == 0) print(y)
	else{
		var l2: List[Double] = List()
		for(valor <- y){
			l2 = l2 :+ (x+valor)
		}
		print(l2)
	}
}