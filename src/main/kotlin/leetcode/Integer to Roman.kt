package leetcode

fun intToRoman(num: Int): String {
    var roman = ""
    val firstPart = num / 1000
    val secondPart = num % 1000 / 100 * 100
    val third = num % 100 / 10 * 10
    val fourth = num % 10
    if (firstPart != 0) {
        repeat(firstPart) {
            roman += "M"
        }
    }
    when {
        secondPart == 0 -> Unit
        secondPart + 100 == 500 -> {
            roman += "CD"
        }
        secondPart + 100 == 1000 -> {
            roman += "CM"
        }
        secondPart >= 500 -> {
            roman += "D"
	        repeat((secondPart - 500) / 100) {
		        roman += "C"
	        }
        }
        else -> {
            repeat(secondPart / 100) {
                roman += "C"
            }
        }
    }
    when {
        third == 0 -> Unit
        third + 10 == 100 -> {
            roman += "XC"
        }
        third + 10 == 50 -> {
            roman += "XL"
        }
        third >= 50 -> {
            roman += "L"
	        repeat((third - 50) / 10) {
		        roman += "X"
	        }
        }
        else -> {
	        repeat(third / 10) {
		        roman += "X"
	        }
        }
    }
    when {
        fourth == 0 -> Unit
        fourth + 1 == 10 -> {
            roman += "IX"
        }
        fourth + 1 == 5 -> {
            roman += "IV"
        }
        fourth >= 5 -> {
            roman += "V"
            repeat(fourth - 5) {
                roman += "I"
            }
        }
        else -> {
            repeat(fourth) {
                roman += "I"
            }
        }
    }

    return roman
}

fun main() {
    println(intToRoman(3))
    println(intToRoman(58))
    println(intToRoman(1994))
}

