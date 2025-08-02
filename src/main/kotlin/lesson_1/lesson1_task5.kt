package lesson_1

const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60

fun main() {
    val totalSeconds: Int = 6480
    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val remains: Int = totalSeconds % SECONDS_IN_HOUR
    val minutes: Int = remains / SECONDS_IN_MINUTE
    val seconds: Int = remains % SECONDS_IN_MINUTE
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}
