import kotlin.math.floor

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    var bundle = floor(n.toDouble() / m)
    while (bundle > 0.0) {
        count += bundle.toInt()
        bundle = floor(bundle / m)
    }
    println(n + count)
}