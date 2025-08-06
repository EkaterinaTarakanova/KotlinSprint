package lesson_5

const val WINNING_NUM1 = 35
const val WINNING_NUM2 = 41

fun main() {
    println("Введите первое число от 0 до 42")
    val num1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val num2 = readln().toInt()

    val isNum1Matched = num1 == WINNING_NUM1 || num1 == WINNING_NUM2
    val isNum2Matched = num2 == WINNING_NUM1 || num2 == WINNING_NUM2

    if (isNum1Matched && isNum2Matched) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isNum1Matched || isNum2Matched) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }

    println("Правильные числа: $WINNING_NUM1 и $WINNING_NUM2")
}