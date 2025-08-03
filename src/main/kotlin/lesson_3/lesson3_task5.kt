package lesson_3

fun main() {
    val moveString: String = "D2-D4;0"
    val from: String = moveString.substringBefore("-")
    val remains: String = moveString.substringAfter("-")
    val to: String = remains.substringBefore(";")
    val step: Int = moveString.substringAfter(";").toInt()

    println("$from\n$to\n$step")
}