package lesson_3

fun main() {
    val inputValue = "D2-D4;0"

    val result = inputValue.split(';')
    val move = result[0].split('-')
    val moveNumber = result[1]
    val moveFrom = move[0]
    val moveTo = move[1]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}