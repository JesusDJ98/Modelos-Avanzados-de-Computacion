def miPi(t: Double, x: Double = -1, y: Double = -1, salida: Double = 0): Double = {
	print("Mi punto ("+(x+t/2)+", "+(y+t/2)+") --> Con una t: "+t+" ---> ")
	if(t <= 1){
		if( (y+t/2) > (1-t/2) ) salida
		else {
			if( (x+t/2) > (1-t/2) ){
				println("Empiezo de cero: (-1,"+(y+t)+")")
				miPi(t, -1, y+t, salida)
			}else{
			 	var v = math.sqrt(math.pow(x+t/2,2) + math.pow(y+t/2,2))
			 	println(""+v+" --> Salida: "+salida)
			 	if( v <= 1 ) miPi(t, x+t, y, salida + (t*t))
			 	else miPi(t, x+t, y, salida)
			}
		}
	}else salida
}