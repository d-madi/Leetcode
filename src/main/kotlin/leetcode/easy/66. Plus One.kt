package leetcode.easy

fun plusOne(
        digits: IntArray
): IntArray {
    var remainder = 1

    for (i in digits.lastIndex downTo 0) {
        val number = digits[i]
        digits[i] = (number + remainder) % 10
        remainder = if ((number + remainder)  >= 10) 1 else 0
    }

    return if (remainder == 1) {
        intArrayOf(1, *digits)
    } else {
        digits
    }
}

fun main() {
    println(plusOne(intArrayOf(1, 2, 3)).toList())
    println(plusOne(intArrayOf(4, 3, 2, 1)).toList())
    println(plusOne(intArrayOf(9)).toList())
    println(plusOne(intArrayOf(9, 9, 9)).toList())
    println(plusOne(intArrayOf(0)).toList())
    println(plusOne(intArrayOf(3)).toList())
    println(plusOne(intArrayOf(9,8,7,6,5,4,3,2,1,0)).toList())
    println(plusOne(intArrayOf(1,0,0,0,0)).toList())
}