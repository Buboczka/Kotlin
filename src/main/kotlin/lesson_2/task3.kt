package lesson_2

const val UNIT_TIME = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelInMinutes = 457

    val travelHour = travelInMinutes / UNIT_TIME
    val remainingMinutes = travelInMinutes - (travelHour * UNIT_TIME)
    var arrivalMinute = departureMinute + remainingMinutes
    val arrivalHour = departureHour + travelHour + arrivalMinute / UNIT_TIME
    arrivalMinute -= ((arrivalMinute / UNIT_TIME) * UNIT_TIME)

    println("${arrivalHour}:${arrivalMinute}")
}