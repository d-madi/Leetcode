package leetcode.medium

import leetcode.utils.ListNode
import leetcode.utils.getSize
import leetcode.utils.toList
import leetcode.utils.toListNode

class Solution {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) return null

        val size = head.getSize()

        if (size == 1) return null

        val removePosition = size - n
        if (removePosition == 0) {

            return head.next
        }

        var prev = head
        var curr = head
        for (i in 0..removePosition) {
            if (i == removePosition) {
                prev?.next = prev?.next?.next

                break
            }
            prev = curr
            curr = curr?.next
        }

        return head
    }
}

fun main() {
    val solution = Solution()
    println(
        solution.removeNthFromEnd(
            arrayOf(1, 2, 3, 4, 5).toListNode(),
            2
        ).toList()
    )
    println(
        solution.removeNthFromEnd(
            arrayOf(1).toListNode(),
            1
        ).toList()
    )
    println(
        solution.removeNthFromEnd(
            arrayOf(1, 2).toListNode(),
            1
        ).toList()
    )
    println(
        solution.removeNthFromEnd(
            arrayOf(1, 2).toListNode(),
            2
        ).toList()
    )
}