fun main() {
    var case = 0
    System.`in`.bufferedReader().readLines().dropLast(2).chunked(2).joinToString("\n") {
        case++
        val first: MutableMap<Char, Int> = HashMap()
        val second: MutableMap<Char, Int> = HashMap()
        for (c in it[0]) first[c] = (first[c] ?: 0) + 1
        for (c in it[1]) second[c] = (second[c] ?: 0) + 1
        "Case ${case}: ${if (first == second) "same" else "different"}"
    }.let(::println)
}