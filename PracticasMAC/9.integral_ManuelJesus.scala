def integralMJ(f: Double => Double, x: Double, y: Double, z: Double, salida: Double = 0): Double = {
	if(x+z <= y) integralMJ(f, x+z, y, z, salida + z*f(x))
	else salida
}
/Salida:
scala> integral(math.pow(_,2),1,10,0.5)
val res116: Double = 308.625
*/