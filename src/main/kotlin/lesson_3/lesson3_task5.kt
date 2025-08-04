package lesson_3

fun main() {
    val moveString: String = "D2-D4;0"
    val (from, to, step) = moveString.split("-", ";")
    println("$from\n$to\n$step")
}