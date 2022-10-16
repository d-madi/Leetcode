package leetcode.medium

import leetcode.utils.ListNode
import leetcode.utils.toList
import leetcode.utils.toListNode

fun deleteNode(node: ListNode?) {
    node?.`val` = node?.next!!.`val`
    node.next = node.next?.next
}

fun main() {
    val node = arrayOf(4, 5, 1, 9).toListNode()
    deleteNode(node?.next?.next)
    println(node?.toList())
}