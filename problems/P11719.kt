import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .joinToString("\n")
            .let(::println)
}