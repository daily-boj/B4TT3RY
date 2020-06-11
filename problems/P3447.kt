import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var code = BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .joinToString("\n")
    while ("BUG" in code) {
        code = code.replace("BUG", "")
    }
    println(code)
}