package leetcode

class Solution {
    fun twoSum(
        nums: IntArray,
        target: Int
    ): IntArray {
        for (i in 0 until nums.lastIndex) {
            for (j in i + 1 .. nums.lastIndex) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }

        return intArrayOf()
    }
}


fun main() {
    val solution = Solution()
    val case1 = intArrayOf(2,7,11,15)

    println(solution.twoSum(case1, 9).joinToString())
    println(solution.twoSum(intArrayOf(3,2,4), 6).joinToString())
    println(solution.twoSum(intArrayOf(3,3), 6).joinToString())
}