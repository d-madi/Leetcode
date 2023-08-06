package leetcode.easy

fun removeElement(
        nums: IntArray,
        `val`: Int
): Int {
    var counter = 0
    var i = 0
    var removedItemsCount = 0
    while (i  + removedItemsCount <= nums.lastIndex) {
        val number = nums[i]
        if (number != `val`) {
            counter++
            i++
        } else {
            for (j in i + 1..(nums.lastIndex - removedItemsCount)) {
                nums[j - 1] = nums[j]
            }
            removedItemsCount++
        }
    }

    return counter
}

fun main() {
    println("cnt=" + removeElement(intArrayOf(3, 2, 2, 3), 3))
    println("cnt=" + removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    println("cnt=" + removeElement(intArrayOf(2), 3))
    println("cnt=" + removeElement(intArrayOf(), 3))
}