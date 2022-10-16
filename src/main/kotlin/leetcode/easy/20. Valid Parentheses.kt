package leetcode.easy

import java.util.Stack

class Solution {

    fun isValid(s: String): Boolean {
        if (s.length == 1) return false
        if (s.length % 2 != 0) return false
        if (!s.isFirstOpeningBracket()) return false

        val chars = Stack<Char>()
        s.forEach { ch ->
            if (ch == '(' || ch == '[' || ch == '{') {
                chars.push(ch)

                return@forEach
            }
            val popped = if (chars.isNotEmpty()) {
                chars.pop()
            } else {
                return false
            }
            if (ch == ')' && popped == '('
                || ch == ']' && popped == '['
                || ch == '}' && popped == '{'
            ) {

                return@forEach
            }

            return false
        }

        return chars.isEmpty()
    }

    private fun String.isFirstOpeningBracket(): Boolean {
        val ch = first()
        if (ch == ')' || ch == ']' || ch == '}') {

            return false
        }

        return true
    }
}

fun main() {
    val solution = Solution()
//    println(solution.isValid("()")) // true
//    println(solution.isValid("()[]{}")) // true
//    println(solution.isValid("(]")) // false
//    println(solution.isValid("{{{{{(([[[[]]]]))}}}}}")) // true
//    println(solution.isValid("([)]")) // false
//    println(solution.isValid("((((")) // false
    println(solution.isValid("(){}}{")) // false
}