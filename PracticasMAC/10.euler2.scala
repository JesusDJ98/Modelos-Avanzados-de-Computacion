def euler2_fib(x: Int) = {
	var l = List(1,2)
	while(l.length < x) l = l :+ (l(l.length-2)+l(l.length-1))
	l
}
/*
scala> euler2_fib(10)
val res36: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)

scala> euler2_fib(40)
val res37: List[Int] = List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141)
*/




def euler2()={
	var l = List(1,2)
	var sum = 2 //Empiezo con el 2 ya introducido
	var para = false
	
	while(!para){
		var cant = l(l.length-2)+l(l.length-1)
		if(cant < 4*math.pow(10,6)){
			l = l :+ cant
			if(cant%2==0) sum += cant
		}else para = true
	}
	sum
}
/* Salida:
scala> euler2()
val res32: Int = 4613732
*/