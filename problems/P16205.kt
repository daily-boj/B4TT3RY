fun main() {
    val (type, variable) = readLine()!!.split(" ")
    printVariables(parse(type, variable.trim()))
}

fun parse(type: String, variable: String): List<String> {
    return when (type) {
        "1" -> variable.split("(?=[A-Z])".toRegex())
        "2" -> variable.split("_")
        "3" -> variable.split("(?=[A-Z])".toRegex()).drop(1)
        else -> listOf()
    }
}

fun printVariables(parsed: List<String>) {
    println(parsed.mapIndexed { i, s -> if (i == 0) s.toLowerCase() else s.capitalize() }.joinToString(""))
    println(parsed.joinToString("_") { it.toLowerCase() })
    println(parsed.joinToString("") { it.capitalize() })
}