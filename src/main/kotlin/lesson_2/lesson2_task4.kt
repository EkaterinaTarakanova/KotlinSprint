package lesson_2

fun main() {
    val crystalOreAmount: Int = 7
    val ironOreAmount: Int = 11
    val buff: Double = 0.2
    val bonusCrystalOreAmount: Int = (crystalOreAmount * buff).toInt()
    val bonusIronOreAmount: Int = (ironOreAmount * buff).toInt()
    println("Кристаллическая руда - $bonusCrystalOreAmount")
    println("Железная руда - $bonusIronOreAmount")
}
