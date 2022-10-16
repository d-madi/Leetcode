package leetcode

fun romanToInt(s: String): Int {
    val dict = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    val romans = s.toCharArray()
    var result: Pair<Int, Int> = Pair(0, 0)
    romans.forEach { ch ->
        val roman = dict[ch] ?: 0
        result = when {
            result.first == 0 -> {
                roman to roman + result.second
            }
            result.first < roman -> {
                roman to roman - result.first * 2 + result.second
            }
            else -> {
                roman to result.second + roman
            }
        }
    }

    return result.second
}

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}