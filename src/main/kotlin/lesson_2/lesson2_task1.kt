package lesson_2

fun main() {
    val pupils: Int = 4
    val firstMark: Int = 3
    val secondMark: Int = 4
    val thirdMark: Int = 3
    val fourthMark: Int = 5
    val averageMark: Double = (firstMark + secondMark + thirdMark + fourthMark).toDouble() / pupils
    print(String.format("%.2f", averageMark))
}