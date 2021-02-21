//Funciones para ver la lista en columnas
def VerLista(l: List[Any]) = for(x<-l) println(x)
def VerListaI(l: List[Any]) = for(x <-l.reverse) println(x)

/* Salida:
//Con una lista simple

scala> var p = List("yo", 23,' ' , 'a')
var p: List[Any] = List(yo, 23,  , a)

scala> VerLista(p)
yo
23

a

scala> VerListaI(p)
a

23
yo

//Lista de Listas
scala> var p2: List[List[Any]] = List(p, List(' ', 'a', '2', '?'), List("as","werfg","0987", 90))
var p2: List[List[Any]] = List(List(yo, 23,  , a), List( , a, 2, ?), List(as, werfg, 0987, 90))

scala> VerListaI(p2)
List(as, werfg, 0987, 90)
List( , a, 2, ?)
List(yo, 23,  , a)

scala> VerLista(p2)
List(yo, 23,  , a)
List( , a, 2, ?)
List(as, werfg, 0987, 90)

*/