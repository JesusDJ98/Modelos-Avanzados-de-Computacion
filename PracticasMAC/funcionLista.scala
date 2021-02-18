def funcionLista(x: List[Any]) = {
	var valor = x.length
	valor match{
		case 0 => "(None)"
		case 1 => x.head
		case 2 => ""+x.head+" and "+x(1)
		case _ => ""+x.head+", "+x(1)+" and "+(valor-2)+" more"
	}
}
