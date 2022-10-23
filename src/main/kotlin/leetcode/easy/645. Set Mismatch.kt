package leetcode.easy

fun findErrorNums(nums: IntArray): IntArray {
    val store = Array(nums.size + 1) { false }
    val result = Array(2) { 0 }
    for (i in 0..nums.lastIndex) {
        val num = nums[i]
        if (!store[num]) {
            store[num] = true
        } else {
            result[0] = num
        }
    }
    val lostNumber = store.indexOfLast { !it }
    result[1] = lostNumber

    return result.toIntArray()
}

fun main() {
    println(findErrorNums(intArrayOf(1, 2, 2, 4)).toList())
    println(findErrorNums(intArrayOf(1, 1)).toList())
}