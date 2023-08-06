package leetcode.easy

fun lengthOfLastWord(
        s: String
): Int {
    var wordLength = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] != ' ') {
            wordLength++
        }

        if (s[i] == ' ' && wordLength != 0)
            break
    }

    return wordLength
}

fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
    println(lengthOfLastWord("a"))
    println(lengthOfLastWord("bbbbb"))
}