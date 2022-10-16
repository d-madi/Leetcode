package leetcode

fun isMatch(s: String, p: String): Boolean {
    return s.matches(p.toRegex())
}

fun main() {
    println(isMatch("aa","a"))
    println(isMatch("aa","a*"))
    println(isMatch("ab",".*"))
}