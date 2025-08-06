package lesson_5

fun main() {
    println("Введите расстояние поездки в километрах")
    val travelDistance = readln().toDouble()

    println("Введите расход топлива на 100 км в литрах")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива")
    val fuelPricePerLiter = readln().toDouble()

    val fuelAmount = (travelDistance * fuelConsumption) / 100
    val cost = fuelAmount * fuelPricePerLiter

    println("Топлива необходимо: $fuelAmount л\nИтоговая стоимость поездки: ${"%.2f".format(cost)}")
}