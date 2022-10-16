package leetcode

fun longestPalindrome(s: String): String {
    if (s.length <= 1) return s

    var maxPalindrome = ""
    for (i in 0 until s.lastIndex) {
        val s1 = findPalindrome(s, i, i)
        val s2 = findPalindrome(s, i, i + 1)
        val str = if (s1.length > s2.length) s1 else s2

        if (str.length > maxPalindrome.length)
            maxPalindrome = str
    }

    return maxPalindrome
}

fun findPalindrome(s: String, start: Int, end: Int): String {
    var left = start
    var right = end
    while (left >= 0 && right < s.length && s[left] == s[right]) {
        left--
        right++
    }
    if (s[left + 1] == s[right - 1])
        return s.substring(left + 1 until right)
    return ""
}

fun main() {
    println(longestPalindrome("babad"))
    println(longestPalindrome("ac"))
    println(longestPalindrome("cbbd"))
    println(
        longestPalindrome(
            "bb"
        )
    )
}