package lesson_5

import java.time.LocalDateTime

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год вашего рождения: ")
    val yearInput = readLine()?.toInt() ?: 0
    val userYear = LocalDateTime.now().year - yearInput

    if (userYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}