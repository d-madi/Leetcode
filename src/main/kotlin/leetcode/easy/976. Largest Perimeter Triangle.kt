package leetcode.easy

import kotlin.math.max

fun largestPerimeter(nums: IntArray): Int {
    nums.sort()
    var i = nums.lastIndex
    var perimeter = 0
    while (i - 2 >= 0) {
        val a = nums[i]
        val b = nums[i - 1]
        val c = nums[i - 2]
        if (isTriangle(a, b, c)) {
            perimeter = max(perimeter, a + b + c)
        }
        i--
    }

    return perimeter
}

fun isTriangle(
    a: Int,
    b: Int,
    c: Int
): Boolean = a + b > c
        && c + b > a
        && c + a > b

fun main() {
    println(largestPerimeter(intArrayOf(2, 1, 2)))
    println(largestPerimeter(intArrayOf(1, 2, 1)))
}