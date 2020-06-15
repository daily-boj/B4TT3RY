import java.util.*

fun main() {
    val list: MutableList<String> = ArrayList()
    val (m, n) = readLine()!!.split(" ").map { it.toInt() }
    repeat(m) {
        val input = readLine()!!.trim().split(" ").map { it.toInt() }
        val compare = StringBuilder()
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                compare.append(when {
                    input[i] > input[j] -> {
                        ">"
                    }
                    input[i] == input[j] -> {
                        "="
                    }
                    input[i] < input[j] -> {
                        "<"
                    }
                    else -> ""
                })
            }
        }
        list.add(compare.toString())
    }
    var count = 0
    for (i in 0 until m - 1) {
        for (j in i + 1 until m) {
            if (list[i] != list[j]) continue
            count++
        }
    }
    println(count)
}