package leetcode.medium

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>()
    val dict = nums.mapIndexed { index, value -> value to index }.toMap()

    for (i in 0 until nums.lastIndex) {
        val first = nums[i]
        for (j in i + 1..nums.lastIndex) {
            val second = nums[j]
            val third = (first + second) * (-1)
            val numIndex = dict[third] ?: continue
            if (numIndex != i && numIndex != j) {
                result.add(listOf(first, second, third).sorted())
            }
        }
    }
    return result.toList()
}

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    println(threeSum(intArrayOf(0, 1, 1)))
    println(threeSum(intArrayOf(0, 0, 0)))
    println(threeSum(intArrayOf(-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0)))
    println(threeSum(intArrayOf(0, 3, 0, 1, 1, -1, -5, -5, 3, -3, -3, 0)))
}