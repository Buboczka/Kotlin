package lesson_4

import kotlin.collections.List

fun main() {
    val dayExercise = 5
    val dataExercise: List<List<String>> = listOf(
        listOf("рук", "пресса"),
        listOf("ног", "спины")
    )

    val checkDay = getCurrentExerciseDay(dayExercise, dayExercise)
    val stringResult = printResult(checkDay, dataExercise)

    println(stringResult)
}

fun getCurrentExerciseDay(day: Int, size: Int): Int {
    var checkDay = 0

    for (i in 1..day) {
        checkDay++

        if (checkDay >= size) {
            checkDay = 0
        }
    }

    return checkDay
}

fun printResult(day: Int, data: List<List<String>>) {
    var stringResult = ""

    for (i in data.indices) {
        var result = false

        if (i == day) {
            result = true
        }

        for (item in data[i]) {
            stringResult += "Упражнения для $item: ${result}\n"
        }
    }

    println(stringResult)
}