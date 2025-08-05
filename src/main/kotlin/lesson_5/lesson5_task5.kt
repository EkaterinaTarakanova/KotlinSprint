package lesson_5

import kotlin.random.Random

fun main() {
    val winningNum1 = Random.nextInt(0, 42)
    val winningNum2 = Random.nextInt(0, 42)
    val winningNum3 = Random.nextInt(0, 42)

    println("Введите первое число от 0 до 42")
    val num1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val num2 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val num3 = readln().toInt()

    val correctNums = listOf(winningNum1, winningNum2, winningNum3)
    val userNums = listOf(num1, num2, num3)
    val commonNums = correctNums.intersect(userNums).size

    when (commonNums) {
        3 -> println("Вы угадали все числа и получаете джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы получаете утешительный приз")
        0 -> println("К сожалению, вы не угадали ни одного числа")
    }

    println("Правильные числа: ${correctNums.joinToString()}")
}