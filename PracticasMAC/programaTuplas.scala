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
		/* Esta comparacion es absoluta, es decir, es identicamente igual.(Apuntan al mismo objeto)
		if(x == this) true
		else false*/

		if( (this.getPersona == x.getPersona) & (this.getEdad == x.getEdad) & (this.getTel == x.getTel) ) true
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




def encontrarR(l: List[Entrada], b: (String, Int) ): String = {
	if(l.isEmpty) "No encontrado"
	else{
		var x = l.head.getPersona
		var comp = new Entrada(x, b._2, b._1)
		if(l.head.comparar(comp)) x
		else encontrarR(l.tail, (b._1, b._2) )
	}
}
/* Salida:
scala> encontrarR(Listin, (X2.getTel, 21) )
val res111: String = No encontrado

scala> encontrarR(Listin, (X.getTel, X.getEdad) )
val res112: String = Yo

scala> encontrarR(Listin, (X2.getTel, X2.getEdad) )
val res113: String = Yo2
*/




def encontrar(l: List[Entrada], b: (String, Int) ): String = {
	var encontrado = false
	var cant = 0
	var devolver = ""
	while(cant < l.length & !encontrado){
		var x = l(cant)
		var y = new Entrada(x.getPersona, b._2, b._1)
		if(x.comparar(y)){
			encontrado = true
			devolver = x.getPersona
		}else cant = cant +1
	}
	if(!encontrado) "No encontrado"
	else devolver
}		
/* Salida:
scala> encontrar(Listin, (X.getTel, X.getEdad))
val res119: String = Yo

scala> encontrar(Listin, (X2.getTel, X2.getEdad))
val res120: String = Yo2

scala> encontrar(Listin, (X2.getTel, 23))
val res121: String = No encontrado

scala> encontrar(List(), (X2.getTel, 23))
val res122: String = No encontrado
*/
