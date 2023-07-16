package lesson_4

fun main() {
    var weight = 42
    var volume = 120


    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                " ${(weight >= 35 && weight <= 100) && volume < 100}"
    )

    weight = 20
    volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                " ${(weight >= 35 && weight <= 100) && volume < 100}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                " ${(weight >= 35 && weight <= 100) && volume < 100}"
    )
}