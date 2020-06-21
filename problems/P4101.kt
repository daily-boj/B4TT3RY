fun main() {
    System.`in`.bufferedReader().readLines().dropLast(1).joinToString("\n") {
        val (a, b) = it.split(" ").map { num -> num.toInt() }
        if (a > b) "Yes" else "No"
    }.let(::println)
}