import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val keys = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .joinToString("\n") { str ->
                str.map { if (it != ' ') keys[keys.indexOf(it) - 1] else it }.joinToString("")
            }
            .let(::println)
}