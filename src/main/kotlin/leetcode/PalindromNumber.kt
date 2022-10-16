package leetcode

fun isPalindrome(x: Int): Boolean {
    val numStr = x.toString()
    return numStr == numStr.reversed()
}

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
}