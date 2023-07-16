package lesson_2

fun main() {
    val inputSum = 70_000.0
    val percentSum = 16.7
    val countYears = 20

    val result = getDeposit(inputSum, percentSum, countYears)

    println(String.format("%.3f", result))
}

fun getDeposit(sum: Double, percent: Double, years: Int): Double {
    var result = sum

    for (i in 1..years) {
        result += result / 100 * percent
    }

    return result
}