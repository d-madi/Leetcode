package leetcode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return add(l1, l2, ListNode(0), 0)
}

fun add(l1: ListNode?, l2: ListNode?, res: ListNode?, balance: Int): ListNode? {
    if (l1 == null && l2 == null) {
        if (balance == 0) return null
        res?.`val` = 1
        return res
    }
    val c1 = l1?.`val` ?: 0
    val c2 = l2?.`val` ?: 0
    val curr: Int
    val newBalance: Int
    if (c1 + c2 + balance >= 10) {
        curr = c1 + c2 + balance - 10
        newBalance = 1
    } else {
        curr = c1 + c2 + balance
        newBalance = 0
    }
    res?.`val` = curr
    res?.next = add(l1?.next, l2?.next, ListNode(0), newBalance)

    return res
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var s = "$`val`"
        var a = next
        while (a != null) {
            s += "${a.`val`}"
            a = a.next
        }
        return "$s"
    }
}

fun main() {
    val l1 = ListNode(`val` = 2).apply {
        next = ListNode(`val` = 4)
            .apply {
            next = ListNode(3)
        }
    }

    val l2 = ListNode(`val` = 5).apply {
        next = ListNode(`val` = 6)
            .apply {
            next = ListNode(4)
        }
    }
//    243+564=708
    println(addTwoNumbers(l1, l2))
}