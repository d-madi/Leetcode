package leetcode.easy

private const val ENGLISH_ALPHABET_SIZE = 26

fun checkIfPangram(sentence: String): Boolean {
    val used = Array(ENGLISH_ALPHABET_SIZE) { false }
    val firstCharCode = 'a'.code // change to toInt(), if you need to rerun on leetcode
    sentence.forEach { ch ->
        used[ch.code - firstCharCode] = true
    }

    return used.all { it }
}

fun main() {
    println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
    println(checkIfPangram("leetcode"))
}