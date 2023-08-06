package leetcode.easy

fun strStr(
        haystack: String,
        needle: String
): Int {
    haystack.forEachIndexed { i, char ->
        if (char == needle.first()
                && (needle.count() + i) <= haystack.count()
                && haystack.substring(i, needle.count() + i) == needle) {

            return i
        }
    }

    return -1
}

fun main() {
    println(strStr(haystack = "sadbutsad", needle = "sad"))
    println(strStr(haystack = "leetcode", needle = "leeto"))
    println(strStr(haystack = "a", needle = "a"))
    println(strStr(haystack = "bsdaadsds", needle = "aa"))
    println(strStr(haystack = "aaa", needle = "aaaa"))
}