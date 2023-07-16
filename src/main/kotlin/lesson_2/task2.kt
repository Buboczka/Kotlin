package lesson_2

fun main() {
    val countEmployers = 50
    val employeeSalary = 30000
    val countTrainee = 30
    val traineeSalary = 20000

    val sumEmployers = getSumEmployers(countEmployers, employeeSalary)
    val totalSum = sumEmployers + getSumTrainee(countTrainee, traineeSalary)
    val avgSum = getAvgSumEmployer(countEmployers + countTrainee, totalSum)

    println(sumEmployers)
    println(totalSum)
    println(avgSum)
}

fun getSumEmployers(count: Int, sum: Int): Int {
    return count * sum
}

fun getSumTrainee(count: Int, sum: Int): Int {
    return count * sum
}

fun getAvgSumEmployer(count: Int, sum: Int): Int {
    return sum / count
}