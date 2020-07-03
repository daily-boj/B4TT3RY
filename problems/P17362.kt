fun main() {
    val num = readLine()!!.toInt()
    println(when (num % 8) {
        1, 2, 3, 4, 5 -> "${num % 8}"
        6  -> "4"
        7 -> "3"
        0 -> "2"
        else -> ""
    })
}