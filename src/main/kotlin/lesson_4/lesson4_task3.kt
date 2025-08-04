package lesson_4

const val REQUIRED_SUNNY_WEATHER = true
const val REQUIRED_OPEN_TENT = true
const val REQUIRED_HUMIDITY = 20
const val FORBIDDEN_TIME_OF_YEAR = "зима"

fun main() {
    val isSunnyWeather: Boolean = true
    val isTentOpen: Boolean = true
    val currentHumidity: Int = 20
    val timeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunnyWeather == REQUIRED_SUNNY_WEATHER && isTentOpen == REQUIRED_OPEN_TENT && 
                    currentHumidity == REQUIRED_HUMIDITY && timeOfYear != FORBIDDEN_TIME_OF_YEAR}")
}