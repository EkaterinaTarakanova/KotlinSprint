package lesson_1

fun main(){
    val totalSeconds: Int = 6480
    val hours: Int = totalSeconds / 3600
    val remains: Int = totalSeconds % 3600
    val minutes: Int = remains / 60
    val seconds: Int = remains % 60

    println("${formatNums(hours)}:${formatNums(minutes)}:${formatNums(seconds)}")
}

fun formatNums(num: Int) : String{
    if (num < 10)
        return "0$num"
    else
        return num.toString()
}