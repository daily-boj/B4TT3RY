import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    var cursor: Int
    val password = LinkedList<Char>()
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .drop(1)
            .joinToString("\n") {
                cursor = 0
                password.clear()
                for (char in it.toCharArray()) {
                    when (char) {
                        '<' -> {
                            if (cursor > 0) cursor--
                        }
                        '>' -> {
                            if (cursor < password.size) cursor++
                        }
                        '-' -> {
                            if (cursor > 0) {
                                cursor--
                                password.removeAt(cursor)
                            }
                        }
                        else -> {
                            password.add(cursor, char)
                            cursor++
                        }
                    }
                }
                password.joinToString("")
            }
            .let(::println)
}