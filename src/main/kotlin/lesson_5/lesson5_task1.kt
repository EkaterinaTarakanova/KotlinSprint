package lesson_5

fun main() {
    val firstNum = 5
    val secondNum = 13

    println(
        """
        Решите простой математический пример
        Сколько будет $firstNum + $secondNum
    """.trimIndent()
    )

    val result = readln().toInt()

    if (result == firstNum + secondNum) {
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен")
    }
}