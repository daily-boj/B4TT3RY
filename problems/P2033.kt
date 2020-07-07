import kotlin.math.pow

fun main() {
    var num = readLine()!!
    for (i in num.length - 1 downTo 1) {
        val base = num.substring(i - 1..i).toInt()
        val one = base % 10
        val digit = 10.0.pow(num.length - 1 - i).toInt()
        num = if (one < 5) {
            (num.toInt() - (one * digit)).toString()
        } else {
            (num.toInt() + ((10 - one) * digit)).toString()
        }
    }
    println(num)
}