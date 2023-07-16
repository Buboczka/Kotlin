package lesson_5

import kotlin.random.Random

fun main() {
    val successLoginText = "Добро пожаловать!"
    val errorLoginText = "Доступ запрещен."
    var welcomeText = "Пожалуйста, подтвердите, что вы не бот. Решите пример: "
    val firstNumber = Random.nextInt(0, 100000)
    val secondNumber = Random.nextInt(0, 100000)
    val resultSum = firstNumber + secondNumber

    welcomeText += "$firstNumber + $secondNumber = "

    print(welcomeText)
    val resultUser = readLine()?.toInt()

    if (resultUser == resultSum) {
        println(successLoginText)
    } else {
        println(errorLoginText)
    }
}