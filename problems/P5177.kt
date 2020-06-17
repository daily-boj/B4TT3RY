fun main() {
    repeat(readLine()!!.toInt()) {
        val input = listOf(readLine()!!, readLine()!!).map { it.replace("[()\\[\\]{}.,;:]".toRegex(), "").replace("\\s+".toRegex(), " ").toLowerCase() }
        println("Data Set ${it + 1}: ${if (input[0] == input[1]) "equal" else "not equal"}\n")
    }
}