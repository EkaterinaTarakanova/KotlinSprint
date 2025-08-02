package lesson_2

import kotlin.math.pow

fun main() {
    val currentValue: Int = 70000
    val interestRate: Double = 0.167
    val time: Int = 20
    val futureValue: Double = currentValue * (1 + interestRate).pow(time.toDouble())
    println("%.3f".format(futureValue))
}