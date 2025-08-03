package lesson_2

const val HUNDRED_PERCENT: Int = 100

fun main() {
    val crystalOreAmount: Int = 7
    val ironOreAmount: Int = 11
    val buff: Int = 20
    val bonusCrystalOreAmount: Int = (crystalOreAmount * buff / HUNDRED_PERCENT)
    val bonusIronOreAmount: Int = (ironOreAmount * buff / HUNDRED_PERCENT)

    println("Кристаллическая руда - $bonusCrystalOreAmount")
    println("Железная руда - $bonusIronOreAmount")
}
