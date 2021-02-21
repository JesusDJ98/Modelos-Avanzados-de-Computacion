//Normal
def suma2(x: Double, y: Double) = x+y

//Con parametro definido
def suma2(x: Double, y: Double = 0) = x+y

// Con funcion de orden superior
def suma21(x: Double) = (y: Double) => {x + y}


def inc(x: Double) = x+1


/* Salidas:
scala> inc(3)
val res24: Double = 4.0