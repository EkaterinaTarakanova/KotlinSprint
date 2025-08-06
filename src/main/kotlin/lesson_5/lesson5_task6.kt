package lesson_5

const val CENTIMETERS_IN_METER = 100

fun main() {
    println("Введите свой вес в килограммах")
    val weight = readln().toDouble()

    println("Введите свой рост в сантиметрах")
    val height = readln()

    val heightInMetres = height.toDouble() / CENTIMETERS_IN_METER
    val result = weight / (heightInMetres * heightInMetres)

    println("%.2f".format(result))

    when {
        result < 18.5 -> println("Недостаточная масса тела")
        result < 25 -> println("Нормальная масса тела")
        result < 30 -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}