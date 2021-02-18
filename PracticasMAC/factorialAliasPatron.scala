def factorial(x: Int): Double = {
	if(x == 0) 1
	else{
		if(x>0) x*factorial(x-1)
		else 0//enviar(0)
	}
}

/*
def enviar(x: Double) ={
	if(x == 0) "Error"
} 
*/