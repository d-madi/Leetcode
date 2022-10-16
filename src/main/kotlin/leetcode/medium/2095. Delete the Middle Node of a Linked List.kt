package leetcode.medium

import leetcode.utils.ListNode
import leetcode.utils.getSize
import leetcode.utils.toList
import leetcode.utils.toListNode

fun deleteMiddle(head: ListNode?): ListNode? {
    if (head == null) return null

    val size = head.getSize()
    if (size == 1) return null

    var cnt = 0
    var h: ListNode? = head
    var prev: ListNode? = null

    while (cnt < size) {
        if (cnt == size / 2) {
            prev?.next = h?.next
            h = h?.next?.next
            cnt++

            continue
        }
        cnt++
        prev = h
        h = h?.next
    }

    return head
}

fun main() {
    println(deleteMiddle(arrayOf(1, 3, 4, 7, 1, 2, 6).toListNode())?.toList())
    println(deleteMiddle(arrayOf(1, 2, 3, 4).toListNode())?.toList())
    println(deleteMiddle(arrayOf(2, 1).toListNode())?.toList())
}


