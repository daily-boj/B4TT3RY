import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.lang.Integer.min
import kotlin.math.floor

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .drop(1)
            .joinToString("\n") {
                val (a, b) = it.split(" ").map { num -> num.toInt() }
                (calc(a, b) * 10).toString()
            }
            .let(::println)
}

fun calc(a: Int, b: Int): Int {
    val list: MutableList<Int> = ArrayList()
    var value = min(a, b)
    while (value > 1) {
        list.add(value)
        value = floor(value / 2.0).toInt()
    }
    value = max(a, b)
    while (value > 1) {
        if (value in list) {
            return value
        }
        value = floor(value / 2.0).toInt()
    }
    return 1
}