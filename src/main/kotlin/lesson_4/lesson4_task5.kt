package lesson_4

const val MIN_CREW_NUMBER = 55
const val MAX_CREW_NUMBER = 70
const val BOXES_OF_PROVISIONS = 50

fun main() {
    println("Введите наличие повреждений (true/false):")
    val isHullDamage: Boolean = readln().toBoolean()

    println("Введите количество членов экипажа")
    val currentCrewNumber: Int = readln().toInt()

    println("Введите количество ящиков провизии")
    val currentBoxesOfProvisions: Int = readln().toInt()

    println("Введите благоприятность погодных условий (true/false):")
    val isWeatherFavorable: Boolean = readln().toBoolean()

    val canSail = (!isHullDamage && currentCrewNumber in MIN_CREW_NUMBER..MAX_CREW_NUMBER &&
            currentBoxesOfProvisions > BOXES_OF_PROVISIONS) ||
            (isHullDamage && currentCrewNumber == MAX_CREW_NUMBER &&
                    isWeatherFavorable == true && currentBoxesOfProvisions >= BOXES_OF_PROVISIONS)

    println("Корабль может отправиться в плавание: $canSail")
}
