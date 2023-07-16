package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelInMinutes = 457

    val travelHour = travelInMinutes / MINUTES_IN_HOUR
    val remainingMinutes = travelInMinutes - (travelHour * MINUTES_IN_HOUR)
    var arrivalMinute = departureMinute + remainingMinutes
    val arrivalHour = departureHour + travelHour + arrivalMinute / MINUTES_IN_HOUR
    arrivalMinute -= ((arrivalMinute / MINUTES_IN_HOUR) * MINUTES_IN_HOUR)

    println("${arrivalHour}:${arrivalMinute}")
}