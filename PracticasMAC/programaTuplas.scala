class Entrada(Persona: String, Edad: Int, Telefono: String) {
	private var name: String = Persona
	private var tel: String = Telefono
	private var y: Int = Edad

	def setPersona(p: String){ name = p }
	def setEdad(x: Int){ y = x }
	def setTel(telefono: String){ tel = telefono }
	
	
	def getPersona = name
	def getEdad = y
	def getTel = tel

	def comparar(x: Entrada) = {
		if(x == this) true
		else false
	}

	override def toString(): String = "(" + name +", "+y+", "+tel+")";
}
/*
 var X = new Entrada("Yo",22,"789878987")
 var X2 = new Entrada("Yo2",22,"789878986")

 var Listin: List[Entrada] = List(X, new Entrada("Tu",22, "343543234"), X2 )
 //Aunque lo haga tipo var, se convierte en tipo val, pues no deja que se modifique despues de crearse
 // Salida: 
scala> Listin
val res23: List[Entrada] = List((Yo, 22, 789878987), (Tu, 22, 343543234), (Yo2, 22, 789878986))


*/

def encontrar(l: List[Entrada], b: (String, Int) ) = {
	/* // Funciona pero con warnings
	var comp = new Entrada("daIgual", b._2, b._1)
	l.foreach{
		case comp => println("Encontrado")
		case _ => println("Nada")
	}
	*/

	//Igual pero con bucle

	var encontrado = false
	var devolver = ""
	for( x <- l){
		val tupla = (x.getEdad, X.getTel)
		tupla match{
			case (b._2, b._1) => {
				encontrado = true
				devolver = devolver + tupla.getPersona + " "
			}
			case _ =>
		}
	}
	if(encontrado) devolver = "NADA"
	else devolver
				


	//Con Filtro
	//l.filter( Entrada(_, a, b) == Entrada(_, b._2, b._1) )
}




def encontrar(l: List[Entrada], b: (String, Int) ) = {
	l.foreach{
		case Entrada(_, b._2, b._1) => println("Encontrado")
		case _ => println("Nada")
	}
}

def compara(x: Entrada, b: (String, Int)) : Boolean = {
	println(x)
	println(new Entrada(x.getPersona, b._2, b._1))
	if(x == new Entrada(x.getPersona, b._2, b._1) ) true
	else false
}





def encontrar(l: List[Entrada], b: (String, Int) ) = {
	var encontrado = false
	var devolver = ""
	for( x <- l){
		var tupla = (x.getEdad, X.getTel)
		println("Estudio: "+ tupla)
		tupla match{
			case (b._2, b._1) => {
				encontrado = true
				devolver = devolver + x.getPersona + " "
				println(devolver)
			}
			case _ =>
		}
	}
	if(encontrado) devolver = "NADA"
	else devolver
}



def encontrar(l: List[Entrada], b: (String, Int) ) = {
	var encontrado = false
	var devolver = ""
	for( x <- l){
		println("Estudio: "+x.toString )
		var tupla = (x.getEdad, X.getTel)
		println("Estudio: "+ tupla)
		
	}
	if(encontrado) devolver = "NADA"
	else devolver
}
