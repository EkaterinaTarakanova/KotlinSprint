package lesson_2

fun main() {
    val workers: Int = 50
    val interns: Int = 30
    val workerSalary: Int = 30000
    val internSalary: Int = 20000
    val salaryExpenses: Int = workerSalary * workers
    val generalExpenses: Int = workerSalary * workers + internSalary * interns
    val averageSalary: Int = (workerSalary * workers + internSalary * interns) / (workers + interns)
    println("\n$salaryExpenses\n$generalExpenses\n$averageSalary")
}