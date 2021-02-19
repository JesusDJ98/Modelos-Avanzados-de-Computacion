def miFuncion(l: List[Double], c: List[Double]= List(0.0) )= {
	var c1 = c
	var l1 = l
	if(c.length < l.length) c1 = c1 ++ List.fill(l.length-c.length)(0.0)
	else if(c.length > l.length) l1 = l1 ++ List.fill(c.length-l.length)(0.0)


	var l2: List[Double] = List()
	for(x <- c1) l2 = l2 :+ l1(cant)+x
	l2
}
/* Salida:
scala> miFuncion(List(2,2,2,2))
val res181: List[Double] = List(2.0, 2.0, 2.0, 2.0)

scala> miFuncion(List(2,2,2,2), List())
val res162: List[Double] = List(2.0, 2.0, 2.0, 2.0)

scala> miFuncion(List(2,2,2,2), List(2,3,3,4,2,4))
val res163: List[Double] = List(4.0, 5.0, 5.0, 6.0, 4.0, 6.0)

scala> miFuncion(List(2,2,2,2), List(2,3,3,4))
val res164: List[Double] = List(4.0, 5.0, 5.0, 6.0)
*/
