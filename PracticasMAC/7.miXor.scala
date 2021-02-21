def xOr(x: Boolean, y: Boolean) = (x & !y || !x & y)
def xOr2(x: Boolean) = (y: Boolean) => (x & !y || !x & y)
/*
scala> xOr(true,true)
val res18: Boolean = false

scala> xOr(true,false)
val res19: Boolean = true

scala> xOr2(true)
val res49: Boolean => Boolean = $Lambda$1340/0x000000010081e040@602d706d

scala> xOr2(true)(true)
val res50: Boolean = false

scala> xOr2(true)(false)
val res51: Boolean = true
*/





def NOr(x: Boolean, y: Boolean) = !(x | y)
def NOr2(x: Boolean) = (y: Boolean) => !(x | y)
/*
scala> NOr(true, true)
val res20: Boolean = false

scala> NOr(true, false)
val res21: Boolean = false

scala> NOr(false, false)
val res22: Boolean = true

scala> NOr2(true)
val res52: Boolean => Boolean = $Lambda$1341/0x000000010081d040@338b7bd9

scala> NOr2(true)(false)
val res53: Boolean = false

scala> NOr2(true)(true)
val res54: Boolean = false

scala> NOr2(false)(false)
val res55: Boolean = true
*/





def xNOr(x: Boolean, y: Boolean) = (x & y || !x & !y)
def xNOr2(x: Boolean) = (y: Boolean) => (x & y || !x & !y)
/*
scala> xNOr(true,true)
val res26: Boolean = true

scala> xNOr(true,false)
val res27: Boolean = false

scala> xNOr(false,false)
val res28: Boolean = true

scala> xNOr2(true)
val res56: Boolean => Boolean = $Lambda$1342/0x0000000100830040@5e7e2d98

scala> xNOr2(true)(true)
val res57: Boolean = true

scala> xNOr2(true)(false)
val res58: Boolean = false

scala> xNOr2(false)(false)
val res59: Boolean = true
*/


def And(x: Boolean, y: Boolean) = (x & y)
def And2(x: Boolean) = (y: Boolean) => (x & y)
def Or(x: Boolean, y: Boolean) = (x || y)
def Or2(x: Boolean) = (y: Boolean) => (x || y)
def Not() = (x: Boolean) => !x
/*
scala> And(true, true)
val res60: Boolean = true

scala> And(false, true)
val res61: Boolean = false

scala> And(false, false)
val res62: Boolean = false

scala> And2(false)
val res64: Boolean => Boolean = $Lambda$1344/0x0000000100831840@2c75e84a

scala> And2(false)(false)
val res65: Boolean = false

scala> And2(false)(true)
val res66: Boolean = false

scala> And2(true)(true)
val res67: Boolean = true

scala> Or(false, false)
val res68: Boolean = false

scala> Or(false, true)
val res69: Boolean = true

scala> Or(true, true)
val res70: Boolean = true

scala> Or2(true)
val res71: Boolean => Boolean = $Lambda$1345/0x0000000100837040@560a54fd

scala> Or2(true)(true)
val res72: Boolean = true

scala> Or2(true)(false)
val res73: Boolean = true

scala> Or2(false)(false)
val res74: Boolean = false

scala> Not()(true)
val res84: Boolean = false

scala> Not()(false)
val res85: Boolean = true

*/
