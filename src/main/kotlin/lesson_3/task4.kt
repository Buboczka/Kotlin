package lesson_3

fun main() {
    var moveNumber = 1
    var moveFrom = "E2"
    var moveTo = "E4"

    var result = printResult(moveFrom, moveTo, moveNumber)

    println(result)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber++

    result = printResult(moveFrom, moveTo, moveNumber)

    println(result)
}

fun printResult(from: String, to: String, count: Int): String {
    return "$from-$to;$count"
}