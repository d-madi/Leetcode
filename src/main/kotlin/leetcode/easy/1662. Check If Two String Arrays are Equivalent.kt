package leetcode.easy

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean =
    word1.joinToString(separator = "") == word2.joinToString(separator = "")

fun main() {
    println(arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
    println(arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("ab", "c")))
    println(arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
}