package lesson_2

import kotlin.math.pow

const val HUNDRED_PERCENT: Int = 100

fun main() {
    val currentValue: Int = 70000
    val interestRate: Double = 16.7
    val time: Int = 20
    val futureValue: Double = currentValue * (1 + interestRate / HUNDRED_PERCENT).pow(time.toDouble())
    println("%.3f".format(futureValue))
}