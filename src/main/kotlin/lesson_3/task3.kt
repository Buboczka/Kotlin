package lesson_3

fun main() {
    val inputValue = 9
    var result = ""

    for (i in 1..9) {
        result += "$inputValue x $i = ${inputValue * i}\n"
    }

    println(result)
}