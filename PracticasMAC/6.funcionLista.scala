def funcionLista(x: List[Any]) = {
	var valor = x.length
	valor match{
		case 0 => "(None)"
		case 1 => x.head
		case 2 => ""+x.head+" and "+x.(1)
		case _ => ""+x.head+", "+x(1)+" and "+(valor-2)+" more"
	}
}

//Utilizando funciones de listas predeterminadas
def funcionLista2(x: List[Any]) = {
	var valor = x.length
	valor match{
		case 0 => "(None)"
		case 1 => x.head
		case 2 => ""+x.head+" and "+x.tail.head
		case _ => ""+x.head+", "+x.tail.head+" and "+(valor-2)+" more"
	}
}

def funcionLista3(x: List[Any]) = {
	x.length match{
		case 0 => "(None)"
		case 1 => x.head
		case 2 => ""+x.head+" and "+x.tail.head
		case _ => {
			var s: String = ""+x.head
			s += ", " + x.drop(1).head
			s += " and " +x.drop(2).length +" more"
			s
		}
	}
}

/* Salida:
scala> prueba
val res230: List[List[Any]] = List(List(asdf, fgh), List(2, 43, 456, 654, 32, 23, 65), List(23,  , a))

scala> funcionLista2(prueba)
val res229: Any = List(asdf, fgh), List(2, 43, 456, 654, 32, 23, 65) and 1 more

scala> funcionLista3(prueba)
val res228: Any = List(asdf, fgh), List(2, 43, 456, 654, 32, 23, 65) and 1 more
*/