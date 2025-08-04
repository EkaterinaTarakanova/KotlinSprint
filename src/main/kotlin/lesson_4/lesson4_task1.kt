package lesson_4

const val SEATS_AMOUNT: Int = 13

fun main() {
    val todaySeatsAmount: Int = 13
    val tomorrowSeatsAmount: Int = 9

    println("Доступность столиков на сегодня:${todaySeatsAmount < SEATS_AMOUNT}\n" +
            "Доступность столиков на завтра:${tomorrowSeatsAmount < SEATS_AMOUNT}")
}