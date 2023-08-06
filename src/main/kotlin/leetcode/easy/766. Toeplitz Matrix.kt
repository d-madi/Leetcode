package leetcode.easy

fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
    val rowCount = matrix.size
    val columnCount = matrix.first().size
    if (rowCount == 1 && columnCount == 1) return true
    if (rowCount == 1 && columnCount >= 1) return false

    var i = 0
    var j = matrix.lastIndex
    var isFinish = false
    while (!isFinish) {
        val checkingNumber = matrix[i][j]
        while (i <= columnCount && j >= 0) {
            if (i + 1 >= columnCount && j - 1 < 0) break
            if (i - 1 < 0 && j + 1 >= rowCount) break

            if (matrix[i][j] != checkingNumber) return false
            i++
            j--
        }
        isFinish = (i == rowCount - 1 && j == 0).not()
    }

    return true
}

fun main() {
    val case1 = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 1, 2, 3),
        intArrayOf(9, 5, 1, 2)
    )
    /*
    val case2 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 2)
    )
    */
    println(isToeplitzMatrix(case1))
//    println(isToeplitzMatrix(case2))
}