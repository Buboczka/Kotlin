package lesson_5

fun main() {
    val firstNumber = 20
    val secondNumber = 80

    println("Введите два числа от 1 до 100")
    print("Введите первое число: ")
    val userFirstNumber = readLine()?.toInt() ?: 0

    print("Введите второе число: ")
    val userSecondNumber = readLine()?.toInt() ?: 0

    if (firstNumber == userFirstNumber && secondNumber == userSecondNumber) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber == userFirstNumber || secondNumber == userSecondNumber) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }

    println("Числа для победы: $firstNumber, $secondNumber")
}