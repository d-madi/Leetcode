package leetcode.medium

import kotlin.math.abs

fun threeSumClosest(nums: IntArray, target: Int): Int {
    if (nums.size <= 3) return nums.sum()

    var minRange = Int.MAX_VALUE
    var result = 0
    for (i in 0..nums.lastIndex - 2) {
        val s1 = nums[i]
        for (j in i + 1 until nums.lastIndex) {
            val s2 = nums[j]
            for (k in j + 1..nums.lastIndex) {
                val s3 = nums[k]
                val sum = s1 + s2 + s3
                if (abs(target - sum) < minRange) {
                    result = sum
                    minRange = abs(target - sum)
                }
            }
        }
    }

    return result
}

fun main() {
    println(threeSumClosest(intArrayOf(-1, 2, 1, -4), 1))
    println(threeSumClosest(intArrayOf(0, 0, 0), 1))
    println(threeSumClosest(intArrayOf(1, 2, 3, 4, 4, 4, 7, 8, 9, 10), 5))
    println(threeSumClosest(intArrayOf(1, 1, 1, 0), 100))
    println(threeSumClosest(intArrayOf(4, 0, 5, -5, 3, 3, 0, -4, -5), -2))
    println(threeSumClosest(intArrayOf(-100, -98, -2, -1), -101))
}
