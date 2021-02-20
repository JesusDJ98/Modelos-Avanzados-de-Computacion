def euler1(x: Int) = {
	var devolver = 0
	var l = List.tabulate(x-1)(n => n+1)
	for(x <- l) if(x%3 == 0 || x%5 == 0) devolver += x
	devolver
}
/* Salida:
scala> euler1(10)
val res16: Int = 23

scala> euler1(1000)
val res17: Int = 233168
*/