package leetcode.medium

fun increasingTriplet(nums: IntArray): Boolean {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE

    nums.forEach { num ->
        when {
            num <= first -> first = num
            num <= second -> second = num
            else -> return true
        }
    }

    return false
}

fun main() {
//    println(increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
//    println(increasingTriplet(intArrayOf(5, 4, 3, 2, 1)))
//    println(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
//    println(increasingTriplet(intArrayOf(1, 2, 3)))
//    println(increasingTriplet(intArrayOf(1, 1, 1)))
    println(increasingTriplet(intArrayOf(20, 100, 10, 12, 5, 13)))
}