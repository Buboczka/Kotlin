package lesson_4

fun main() {
    val isSunWeather = true
    val isOpenTent = true
    val isPercentWetAir = 20
    val isBadSeason = "winter"
    var result = false

    val sunWeather = true
    val openTent = true
    val percentWetAir = 20
    val badSeason = "winter"

    if (
        (isSunWeather == sunWeather) &&
        (isOpenTent == openTent) &&
        (isPercentWetAir == percentWetAir) &&
        (isBadSeason != badSeason)
    ) {
        result = true
    }

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}