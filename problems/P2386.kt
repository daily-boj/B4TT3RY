fun main() {
    System.`in`.bufferedReader().readLines().dropLast(1).joinToString("\n") {
        val char = it.split(" ")[0]
        val sentence = it.split(" ").drop(1).joinToString(" ")
        "$char ${sentence.filter { c -> c.toLowerCase().toString() == char }.length}"
    }.let(::println)
}