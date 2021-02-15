def FactorialNatural(x: Int): Int = {
	if(x==1 || x==0) 1
	else x* Factorial(x-1)
}

def FactorialEntero(x: Int): Int = {
	if(x >= 0)
		if(x==1 || x==0) 1
		else x* Factorial(x-1)
	else
		if(x==(-1)) -1
		else x*Factorial(x+1)
}