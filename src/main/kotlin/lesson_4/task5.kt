package lesson_4

fun main() {
    val isDamaged = false
    val isAvailableCrew = 55..70
    val isProvisions = 50
    val isWeather = true

    print("Наличие повреждений (true/false): ")
    val crewInputDamaged: Boolean = readLine().toBoolean()

    print("Текущий состав экипажа (количество): ")
    val crewInputNumberCrew = readLine()?.toInt() ?: 0

    print("Количество ящиков с провизией (количество): ")
    val crewInputCountProvisions = readLine()?.toInt() ?: 0

    print("Благоприятность метеоусловий (true/false): ")
    val crewInputWeather: Boolean = readLine().toBoolean()

    val result = if (
        crewInputDamaged == isDamaged &&
        crewInputNumberCrew in isAvailableCrew &&
        crewInputCountProvisions > isProvisions
    ) {
        ""
    } else if (
        crewInputNumberCrew == isAvailableCrew.toList().last() &&
        crewInputWeather == isWeather &&
        crewInputCountProvisions > isProvisions
    ) {
        ""
    } else {
        "не "
    }

    println("Корабль ${result}готов к отплытию")
}