package lesson_3

fun main() {
    val name: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var surname: String = "Андреева"
    var age: Int = 20

    println("$surname $name $patronymic, $age")

    surname = "Сидорова"
    age = 22

    println("$surname $name $patronymic, $age")
}