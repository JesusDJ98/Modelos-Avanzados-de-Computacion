//Normal
def suma2(x: Double, y: Double) = x+y

//Con parametro definido
def suma2_1(x: Double, y: Double = 0) = x+y

// Con funcion de orden superior
def suma2_2(x: Double) = (y: Double) => {x + y}


def inc(x: Double) = x+1

/* Salidas:
scala> suma2(2.4, 3)
val res0: Double = 5.4

scala> suma2(2.4)
            ^
       error: not enough arguments for method suma2: (x: Double, y: Double): Double.
       Unspecified value parameter y.

scala> suma2_1(2.4)
val res2: Double = 2.4

scala> suma2_1(2.4, 3)
val res3: Double = 5.4

scala> suma2_2(2.4)
val res4: Double => Double = $Lambda$1103/0x000000010075b840@75aeec0a

scala> suma2_2(2.4, 3)
                    ^
       error: too many arguments (found 2, expected 1) for method suma2_2: (x: Double): Double => Double

scala> suma2_2(2.4)(3)
val res6: Double = 5.4

scala> inc(-1)
val res7: Double = 0.0
*/