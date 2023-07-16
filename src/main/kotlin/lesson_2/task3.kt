package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelInMinutes = 457

    val travelHour = travelInMinutes / 60
    val remainingMinutes = travelInMinutes - (travelHour * 60)
    var arrivalMinute = departureMinute + remainingMinutes
    val arrivalHour = departureHour + travelHour + arrivalMinute / 60
    arrivalMinute -= ((arrivalMinute / 60) * 60)

    println("${arrivalHour}:${arrivalMinute}")
}