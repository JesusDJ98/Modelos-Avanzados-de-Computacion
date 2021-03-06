def traduce(x: Int) = {
	x match{
		case 1 => "A"
		case 2 => "B"
		case 3 => "C"
		case 4 => "D"
		case 5 => "E"
		case 6 => "F"
		case 7 => "G"
		case 8 => "H"
		case 9 => "I"
		case 10 => "J"
		case 11 => "K"
		case 12 => "L"
		case 13 => "M"
		case 14 => "N"
		case 15 => "Ñ"
		case 16 => "O"
		case 17 => "P"
		case 18 => "Q"
		case 19 => "R"
		case 20 => "S"
		case 21 => "T"
		case 22 => "U"
		case 23 => "V"
		case 24 => "W"
		case 25 => "X"
		case 26 => "Y"
		case 27 => "Z"
		case _ => "Error"
	}
}

/*
scala> traduce(3)
val res19: String = C
*/