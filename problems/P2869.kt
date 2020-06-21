import kotlin.math.ceil

fun main() {
    val (a, b, v) = readLine()!!.split(" ").map { it.toInt() }
    println(ceil((v - a) / (a - b).toDouble()).toInt() + 1)
}