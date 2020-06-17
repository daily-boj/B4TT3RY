import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val list: MutableList<Int> = MutableList(30) { i -> i + 1 }
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .forEach { list.remove(it.toInt()) }
    list.joinToString("\n").let(::println)
}