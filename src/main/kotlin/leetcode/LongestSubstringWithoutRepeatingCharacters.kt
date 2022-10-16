package leetcode

fun lengthOfLongestSubstring(s: String): Int {
    var currMaxStr = ""
    if (s.length == 1) return 1

    for (i in 0 until s.lastIndex) {
        var temp = ""
        for (j in i .. s.lastIndex) {
            if(temp.contains(s[j])) break

            temp = s.substring(i, j+1)
        }
        if (temp.length > currMaxStr.length)
            currMaxStr = temp
    }

    return currMaxStr.length
}

fun main() {
    println(lengthOfLongestSubstring(""))
}