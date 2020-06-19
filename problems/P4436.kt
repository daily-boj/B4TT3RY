import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val base = setOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val set: MutableSet<Int> = HashSet()
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .joinToString("\n") {
                var num = it.toLong()
                var count = 1
                while (set != base) {
                    set.addAll(num.toString().toCharArray().map { c -> c.toString().toInt() })
                    num = it.toLong() * ++count
                }
                set.clear()
                (--count).toString()
            }
            .let(::println)
}