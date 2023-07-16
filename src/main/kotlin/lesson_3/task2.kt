package lesson_3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Андреева"
    val husbandSurname = "Сидорова"
    var age = 20
    val weddingAge = 22

    surname = changeSurname(surname, husbandSurname, age, weddingAge)

    println("$surname $name $patronymic, $age")

    age = 22

    surname = changeSurname(surname, husbandSurname, age, weddingAge)

    println("$surname $name $patronymic, $age")
}

fun changeSurname(surname: String, newSurname: String, age: Int, ageCheck: Int): String {
    var result = surname

    if (age >= ageCheck) {
        result = newSurname
    }

    return result
}