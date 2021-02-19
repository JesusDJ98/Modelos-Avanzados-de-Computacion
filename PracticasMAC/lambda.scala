def suma2(x: Double, y: Double = 1) = x+y


/*No es lo que realmente se me pide -> Pero es bastante interesante
Def le paso un parametro x, y se suma con un paramtro lambda y
Utilizando las funciones anonimas
*/
def suma21(x: Double) = {
	(y: Double) => {x + y}
}


/*
Este se mantiene, siempre devuelve lo mismo
El anterior, ni aunque dejemos la misma x, no suele coincidir
*/
def suma22(x: Double) = {
	(y: Double) => {1 + y}
}

/* Salida: 
scala> suma2(2,3)
val res233: Double = 5.0


scala> suma22(2)
val res20: Double => Double = $Lambda$1101/0x0000000100760040@1a7c593b

scala> suma22(2)
val res21: Double => Double = $Lambda$1101/0x0000000100760040@1a7c593b

scala> suma22(2)
val res22: Double => Double = $Lambda$1101/0x0000000100760040@1a7c593b

scala> suma22(2)
val res23: Double => Double = $Lambda$1101/0x0000000100760040@1a7c593b

scala> suma22(4)
val res24: Double => Double = $Lambda$1101/0x0000000100760040@1a7c593b


scala> suma21(2)
val res28: Double => Double = $Lambda$1100/0x000000010074e040@7e003cf0

scala> suma21(2)
val res29: Double => Double = $Lambda$1100/0x000000010074e040@5f892e12

scala> suma21(2)
val res30: Double => Double = $Lambda$1100/0x000000010074e040@2a906344

scala> suma21(2)
val res31: Double => Double = $Lambda$1100/0x000000010074e040@762618bb

scala> suma21(2)
val res32: Double => Double = $Lambda$1100/0x000000010074e040@3b6b0bf4

scala> suma21(2)
val res33: Double => Double = $Lambda$1100/0x000000010074e040@7a217059

scala> suma21(2)
val res34: Double => Double = $Lambda$1100/0x000000010074e040@4c914e12
*/