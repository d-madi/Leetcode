package leetcode.easy

fun removeDuplicates(nums: IntArray): Int {
    var prev = nums[0]
    var j = 1
    for (i in 1 .. nums.lastIndex) {
        if (nums[i] != prev) {
            prev = nums[i]
            nums[j++] = nums[i]
        }
    }

    return j
}

fun main() {
    println(removeDuplicates(intArrayOf(1)))
    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
    println(removeDuplicates(intArrayOf(1,1,1,1,2,2,2,3)))
}