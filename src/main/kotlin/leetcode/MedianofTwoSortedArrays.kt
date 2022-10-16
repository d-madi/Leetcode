package leetcode

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val finalArr = (nums1 + nums2)
    finalArr.sort()
    val length = finalArr.count()
    if (length % 2 == 0) {
        return (finalArr[length / 2 - 1] + finalArr[length / 2]) / 2.toDouble()
    }

    return finalArr[length / 2].toDouble()
}

fun main() {
    println(findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    println(findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3,4)))
}