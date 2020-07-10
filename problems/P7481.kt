import java.lang.Integer.max
import java.lang.Integer.min

fun main() {
    System.`in`.bufferedReader().readLines().drop(1).joinToString("\n") {
        val (a, b, s) = it.split(" ").map { input -> input.toInt() }
        val max = max(a, b)
        val min = min(a, b)
        var sTmp = 0
        var aCount = 0
        var bCount = 0
        while (sTmp < s) {
            sTmp += if ((s - sTmp) % max == 0) {
                if (max == a) aCount++ else bCount++
                max
            } else {
                if (min == a) aCount++ else bCount++
                min
            }
        }
        if (s == sTmp) "$aCount $bCount" else "Impossible"
    }.let(::println)
}