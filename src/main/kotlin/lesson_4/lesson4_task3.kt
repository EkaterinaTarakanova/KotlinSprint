package lesson_4

const val REQUIRED_SUNNY_WEATHER = true
const val REQUIRED_OPEN_TEND = true
const val REQUIRED_HUMIDITY = 20
const val REQUIRED_TIME_OF_YEAR = "не зима"

fun main() {
    val weatherIsSunny: Boolean = true
    val isTendOpen: Boolean = true
    val currentHumidity: Int = 20
    val timeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherIsSunny == REQUIRED_SUNNY_WEATHER && isTendOpen == REQUIRED_OPEN_TEND 
                    && currentHumidity == REQUIRED_HUMIDITY && timeOfYear.equals(REQUIRED_TIME_OF_YEAR)}")
}