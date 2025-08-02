package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    var hour: Int = 9
    var minute: Int = 39
    val travelTimeMinutes: Int = 457
    val remains: Int = (minute + travelTimeMinutes % MINUTES_IN_HOUR) / MINUTES_IN_HOUR
    hour += (travelTimeMinutes / MINUTES_IN_HOUR) + remains
    minute = (minute + travelTimeMinutes) % MINUTES_IN_HOUR
    println("%02d:%02d".format(hour, minute))
}
