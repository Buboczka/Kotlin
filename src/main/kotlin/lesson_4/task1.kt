package lesson_4

fun main() {
    val commonCountTable = 13
    val bookingTableToday = 13
    val bookingTableTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${bookingTableToday < commonCountTable}\n" +
                "Доступность столиков на завтра: ${bookingTableTomorrow < commonCountTable}"
    )
}