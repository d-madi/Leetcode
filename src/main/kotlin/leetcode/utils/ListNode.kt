package leetcode.utils

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String = `val`.toString()
}

fun Array<Int>.toListNode(): ListNode? {
    if (isEmpty()) return null
    if (size == 1) return ListNode(first())

    val l = ListNode(first())
    var next = l
    for (i in 1..lastIndex) {
        next.next = ListNode(get(i))

        next = next.next as ListNode
    }

    return l
}

fun ListNode?.toList(): List<Int> {
    if (this == null) return emptyList()

    var h: ListNode? = this
    val res = mutableListOf<Int>()

    while (h?.`val` != null) {
        res.add(h.`val`)
        h = h.next
    }

    return res
}

fun ListNode.getSize(): Int {
    var h: ListNode? = this
    var cnt = 1
    while (h?.next != null) {
        cnt++
        h = h.next
    }

    return cnt
}