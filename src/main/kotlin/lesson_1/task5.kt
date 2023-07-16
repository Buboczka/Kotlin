package lesson_1

fun main() {
    var secondsInSpace = 6480
    val hoursInSpace = secondsInSpace / 3600
    val minutesInSpace = (secondsInSpace - (3600 * hoursInSpace)) / 60
    secondsInSpace -= ((3600 * hoursInSpace) + (minutesInSpace * 60))

    val hoursInSpaceString = addLeadZero(hoursInSpace)
    val minutesInSpaceString = addLeadZero(minutesInSpace)
    val secondsInSpaceString = addLeadZero(secondsInSpace)

    println("${hoursInSpaceString}:${minutesInSpaceString}:${secondsInSpaceString}")
}

fun addLeadZero(number: Int): String {
    return String.format("%02d", number)
}