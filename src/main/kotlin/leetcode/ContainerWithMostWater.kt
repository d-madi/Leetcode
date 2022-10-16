package leetcode

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun maxArea(height: IntArray): Int {
    if (height.isEmpty()) return 0

    var maxArea = 0
    var left = 0
    var right = height.lastIndex
    while (left < right) {
        val area = area(height, left, right)
        maxArea = max(maxArea, area)
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return maxArea
}

fun area(height: IntArray, i: Int, j: Int): Int {
    val h = min(height[i], height[j])
    val w = abs(i - j)

    return h * w
}

fun main() {
    println(maxArea(intArrayOf(1, 1)))
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(maxArea(intArrayOf(1, 1_000_000, 1_000_000, 1, 1, 1, 1, 1, 1)))
    println(maxArea(intArrayOf(4,4,2,11,0,11,5,11,13,8)))
}