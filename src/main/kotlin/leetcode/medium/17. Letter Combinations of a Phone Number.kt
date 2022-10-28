package leetcode.medium

fun letterCombinations(digits: String): List<String> {
    if (digits.isEmpty()) return emptyList()

    val dictionary: Map<Char, List<String>> = mapOf(
        '2' to listOf("a", "b", "c"),
        '3' to listOf("d", "e", "f"),
        '4' to listOf("g", "h", "i"),
        '5' to listOf("j", "k", "l"),
        '6' to listOf("m", "n", "o"),
        '7' to listOf("p", "q", "r", "s"),
        '8' to listOf("t", "u", "v"),
        '9' to listOf("w", "x", "y", "z"),
    )
    val result = mutableListOf<String>()
    digits.forEach { digit ->
        val chars = dictionary[digit] ?: return@forEach
		if (digit == '1') return@forEach

        chars.forEach { ch ->

        }
    }

    return emptyList()
}

fun main() {
    println(letterCombinations("23"))
    println(letterCombinations(""))
    println(letterCombinations("2"))
}