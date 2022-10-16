package leetcode

fun reverse(
    x: Int
): Int {
    val one = if (x > 0) 1 else -1

    return Math.abs(x).toString().reversed().toIntOrNull()?.times(one) ?: 0
}

fun main() {
    println(reverse(123))
    println(reverse(-123))
    println(reverse(120))
    println(reverse(1))
    println(reverse(1534236469))
}

// 123 -> 1111011
// 321 -> 101000001
// 120 -> 1111000
// 021 -> 10101