fun main() {
    readLine()!!
            .reversed()
            .chunked(3)
            .joinToString("") {
                it.reversed().toInt(2).toString(8)
            }
            .reversed()
            .let(::println)
}