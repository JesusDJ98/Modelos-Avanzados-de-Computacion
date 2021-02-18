def funcionLet(x: List[Any]) = {
	if(x.length < 2) "Error"
	else{
		var x1: List[Any] = List()
		var cant = 2
		while(cant < x.length){
			x1 = x1 :+ x(cant)
			cant = cant +1
		}
		x1
	}
} 	

/*
funcionLet2 es lo mismo
Pues en haskell se diferencia Array[] y Listas()
Pero en scala poniendo una lista de any, podemos tener array que funcionan igual
que las listas de haskell, es decir, que cada elemento puede ser de un tipo diferente.
*/