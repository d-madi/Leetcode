package leetcode

fun myAtoi(s: String): Int {
    if (s.isEmpty()) return 0

    var temp = ""
    for (index in s.indices) {
        val ch = s[index]
        if (ch == ' ' && temp.isEmpty()) continue
        if ((ch == '-' || ch == '+') && index != s.lastIndex && temp.isEmpty()) {
            temp += ch
            continue
        }
        if (!ch.isDigit()) break
        if (ch.isDigit()) temp += ch
    }

    return temp.toIntOrNull() ?: when {
        temp.isEmpty() -> 0
        temp.length == 1 && (temp.first() == '-' || temp.first() == '+') -> 0
        temp.first() == '-' && temp.length >= 11 -> Int.MIN_VALUE
        temp.length >= 10 -> Int.MAX_VALUE
        else -> 0
    }
}

fun main() {
    println("${myAtoi("42")}")
    println("${myAtoi("   -42")}")
    println("${myAtoi("4193 with words")}")
    println("${myAtoi("42-12")}")
    println("${myAtoi("words and 987")}")
    println("${myAtoi("+-12")}")
    println("${myAtoi("-+12")}")
    println("${myAtoi("21474836460")}")
    println("${myAtoi("-21474836460")}")
    println("${myAtoi("+21474836460")}")
    println("${myAtoi("   +0 123}")}")
    println("${myAtoi("2147483648")}")
    println("${myAtoi("-2147483649")}")
}