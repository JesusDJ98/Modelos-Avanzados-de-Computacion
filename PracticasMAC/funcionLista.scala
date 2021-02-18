def funcionLista(x: List[Any]) = {
	var valor = x.length
	valor match{
		case 0 => "(None)"
		case 1 => x(0)
		case 2 => ""+x(0)+" and "+x(1)
		case _ => ""+x(0)+", "+x(1)+" and "+(valor-2)+" more"
	}
}
