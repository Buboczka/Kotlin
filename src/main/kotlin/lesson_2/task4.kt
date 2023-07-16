package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    println(applyBuff(crystalOre, buff))
    println(applyBuff(ironOre, buff))
}

fun applyBuff(count: Int, percent: Int): Int {
    return (count.toFloat() / 100 * percent).toInt()
}