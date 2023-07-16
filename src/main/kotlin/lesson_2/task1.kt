package lesson_2

fun main() {
    val scoreArray = arrayOf(3, 4, 3, 5)
    val result = getAvgValue(scoreArray)

    println(formatString(result))
}

fun getAvgValue(numberArray: Array<Int>): Float {
    var sum = 0

    for (n in numberArray) {
        sum += n
    }

    return sum.toFloat() / numberArray.size
}

fun formatString(number: Float): String {
    return String.format("%.2f", number)
}