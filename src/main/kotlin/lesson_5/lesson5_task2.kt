package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val yearOfBirth = readln().toInt()
    val currentYear = 2025
    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}
