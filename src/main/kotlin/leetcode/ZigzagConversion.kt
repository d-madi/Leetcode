package leetcode

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val column = s.length
    val zigzag = Array(numRows) { Array(column) { ' ' } }

    var i = 0
    var j = 0
    var isGrow = true
    s.forEach { ch ->
        zigzag[i][j] = ch
        if (isGrow) {
            if (i < numRows - 1) {
                i++
            } else {
                isGrow = false
                j++
                i--
            }
        } else {
            if (i > 0) {
                j++
                i--
            } else {
                isGrow = true
                i++
            }
        }
    }
    var result = ""
    for (i in 0 until numRows) {
        for (j in 0 until column) {
            result += zigzag[i][j].toString().trim()
        }
    }
    return result
}

fun main() {
    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
    println(convert("ABC", 2))
    println(convert("A", 2))
}