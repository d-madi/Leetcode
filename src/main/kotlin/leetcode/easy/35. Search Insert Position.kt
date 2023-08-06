package leetcode.easy

fun searchInsert(
        nums: IntArray,
        target: Int
): Int {
    var l = 0
    var r = nums.lastIndex
    while (l <= r) {
        val mid = (l + r) / 2
        if (nums[mid] == target) {

            return mid
        }
        if (nums[mid] < target) {
            l = mid + 1
        } else {
            r = mid - 1
        }
    }

    return l
}

fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 7))
}