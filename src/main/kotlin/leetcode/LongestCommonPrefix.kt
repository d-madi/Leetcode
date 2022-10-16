package leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    return strs.foldRight(strs.first()) { curr, acc ->
        maxMatchPrefix(curr, acc) ?: return ""
    }
}

fun maxMatchPrefix(first: String, second: String): String? {
    var prefix = ""
    first.forEachIndexed { index, ch ->
        if (index > second.lastIndex) return prefix
        if (ch != second[index]) return prefix

        prefix += ch
    }

    return prefix
}

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(arrayOf("dog","racecar","car")))
}