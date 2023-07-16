package lesson_3

fun main() {
    val userName = "%username%"
    var dayTime = 12

    var welcomeText = checkDayTime(dayTime)

    println("$userName - $welcomeText")

    dayTime = 19

    welcomeText = checkDayTime(dayTime)

    println("$userName - $welcomeText")
}

fun checkDayTime(time: Int): String {
    var text = ""
    if (time in 12..17) {
        text = "Добрый день"
    } else if (time in 18..23) {
        text = "Добрый вечер"
    }
    return text
}