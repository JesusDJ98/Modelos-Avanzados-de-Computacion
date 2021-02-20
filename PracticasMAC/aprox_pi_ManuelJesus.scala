def miPi(t: Double, x: Double = -1, y: Double = -1, salida: Double = 0): Double = {
	//print("Mi punto ("+x+", "+y+") --> Con una t: "+t+" ---> ")
	if(t <= 1){
		if( (y+(t/2)) > (1-(t/2)) ) salida
		else {
			if( (x+t/2) > (1-t/2) ){
				//println("Empiezo de cero: (-1,"+(y+t)+")")
				miPi(t, -1, y+t, salida)
			}else{
			 	var v = math.sqrt(math.pow(x+(t/2),2) + math.pow(y+(t/2),2))
			 	//println(""+v+" --> Salida: "+salida)
			 	if( v <= 1 ) miPi(t, x+t, y, (salida + (t*t)) )
			 	else miPi(t, x+t, y, salida)
			}
		}
	}else salida
}
/* Salida:
scala> miPi(0.5)
val res32: Double = 3.0

scala> miPi(0.1)
val res33: Double = 3.1599999999999766

scala> miPi(0.01)
val res34: Double = 3.1388000000021994

scala> miPi(0.001)
val res35: Double = 3.1415480000852147
*/




















