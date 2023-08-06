package leetcode.easy

fun mySqrt(x: Int): Int {
    return Math.sqrt(x.toDouble()).toInt()
}

fun main() {
    println(mySqrt(4))
    println(mySqrt(8))
    println(mySqrt(Int.MAX_VALUE))
    println(mySqrt(0))
}