package leetcode.easy

import leetcode.utils.ListNode
import leetcode.utils.toList
import leetcode.utils.toListNode

private class Solution21 {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        when {
            list2 == null && list1 == null -> return null
            list1 == null -> return list2
            list2 == null -> return list1
        }

        val resultNode = ListNode(0)
        var curr: ListNode? = resultNode

        var prev1 = list1
        var prev2 = list2
        while (prev1 != null || prev2 != null) {
            val value1 = prev1?.`val`
            val value2 = prev2?.`val`
            val resultValue = when {
                value1 == null -> {
                    prev2 = prev2?.next
                    value2
                }
                value2 == null -> {
                    prev1 = prev1?.next
                    value1
                }
                value1 <= value2 -> {
                    prev1 = prev1?.next
                    value1
                }
                else -> {
                    prev2 = prev2?.next
                    value2
                }
            }
            curr?.next = ListNode(resultValue!!)
            curr = curr?.next
        }

        return resultNode.next
    }
}

fun main() {
    val solution = Solution21()
    println(
        solution.mergeTwoLists(
            list1 = arrayOf(1, 2, 4).toListNode(),
            list2 = arrayOf(1, 3, 4).toListNode()
        ).toList()
    )
    println(
        solution.mergeTwoLists(
            list1 = emptyArray<Int>().toListNode(),
            list2 = emptyArray<Int>().toListNode()
        ).toList()
    )
    println(
        solution.mergeTwoLists(
            list1 = emptyArray<Int>().toListNode(),
            list2 = arrayOf(0).toListNode()
        ).toList()
    )
}