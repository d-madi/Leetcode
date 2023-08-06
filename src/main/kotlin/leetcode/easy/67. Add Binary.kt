package leetcode.easy

import kotlin.math.max

fun addBinary(
        a: String,
        b: String
): String {
    val length = max(a.lastIndex, b.lastIndex)
    var memo = 0
    val result = CharArray(length + 1)
    for (i in 0..length) {
        val aNumber = a.getOrNull(a.lastIndex - i)?.let(Character::getNumericValue) ?: 0
        val bNumber = b.getOrNull(b.lastIndex - i)?.let(Character::getNumericValue) ?: 0
        val curr = (aNumber + bNumber + memo) % 2
        memo = if (aNumber + bNumber + memo > 1) {
            1
        } else {
            0
        }
        result[length - i] = '0' + curr
    }
    if (memo == 1) {
        return "1${result.joinToString(separator = "")}"
    }

    return result.joinToString("")
}

fun main() {
    println(addBinary("11", "1")) // "100"
    println(addBinary("1010", "1011")) // "10101"
    println(addBinary("1", "1")) // "10"
}